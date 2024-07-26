//go:build !windows && cgo
// +build !windows,cgo

package native

import (
	"fmt"
	"io"
	"strings"
	"testing"
	"time"

	"kcl-lang.io/lib/go/api"
	"kcl-lang.io/lib/go/env"
	"kcl-lang.io/lib/go/plugin"
)

const code = `
import kcl_plugin.hello

name = "kcl"
sum = hello.add(option("a"), option("b"))
`

func init() {
	// Set the lib path
	// Enable the fast eval mode.
	env.EnableFastEvalMode()
	// Add a plugin named hello
	plugin.RegisterPlugin(plugin.Plugin{
		Name: "hello",
		MethodMap: map[string]plugin.MethodSpec{
			"add": {
				Body: func(args *plugin.MethodArgs) (*plugin.MethodResult, error) {
					v := args.IntArg(0) + args.IntArg(1)
					return &plugin.MethodResult{V: v}, nil
				},
			},
		},
	})
}

func TestExecProgramWithPlugin(t *testing.T) {
	client := NewNativeServiceClient()
	result, err := client.ExecProgram(&api.ExecProgram_Args{
		KFilenameList: []string{"main.k"},
		KCodeList:     []string{code},
		Args: []*api.Argument{
			{
				Name:  "a",
				Value: "1",
			},
			{
				Name:  "b",
				Value: "2",
			},
		},
	})
	if err != nil {
		t.Fatal(err)
	}
	if result.ErrMessage != "" {
		t.Fatal("error message must be empty")
	}
}

func TestExecProgramWithPluginError(t *testing.T) {
	client := NewNativeServiceClient()
	result, err := client.ExecProgram(&api.ExecProgram_Args{
		KFilenameList: []string{"main.k"},
		KCodeList:     []string{code},
	})
	if err != nil {
		t.Fatal(err)
	}
	if !strings.Contains(result.ErrMessage, "strconv.ParseInt: parsing \"<nil>\": invalid syntax") {
		t.Fatal(result.ErrMessage)
	}
}

func TestParseFile(t *testing.T) {
	// Example: Test with string source
	src := `schema Name:
    name: str

n = Name {name = "name"}` // Sample KCL source code
	astJson, err := ParseFileASTJson("", src)
	if err != nil {
		t.Errorf("ParseFileASTJson failed with string source: %v", err)
	}
	if astJson == "" {
		t.Errorf("Expected non-empty AST JSON with string source")
	}

	// Example: Test with byte slice source
	srcBytes := []byte(src)
	astJson, err = ParseFileASTJson("", srcBytes)
	if err != nil {
		t.Errorf("ParseFileASTJson failed with byte slice source: %v", err)
	}
	if astJson == "" {
		t.Errorf("Expected non-empty AST JSON with byte slice source")
	}

	startTime := time.Now()
	// Example: Test with io.Reader source
	srcReader := strings.NewReader(src)
	astJson, err = ParseFileASTJson("", srcReader)
	if err != nil {
		t.Errorf("ParseFileASTJson failed with io.Reader source: %v", err)
	}
	if astJson == "" {
		t.Errorf("Expected non-empty AST JSON with io.Reader source")
	}
	elapsed := time.Since(startTime)
	t.Logf("ParseFileASTJson took %s", elapsed)
	if !strings.Contains(astJson, "Schema") {
		t.Errorf("Expected Schema Node AST JSON with io.Reader source")
	}
	if !strings.Contains(astJson, "Assign") {
		t.Errorf("Expected Assign Node AST JSON with io.Reader source")
	}
}

func ParseFileASTJson(filename string, src interface{}) (result string, err error) {
	var code string
	if src != nil {
		switch src := src.(type) {
		case []byte:
			code = string(src)
		case string:
			code = src
		case io.Reader:
			d, err := io.ReadAll(src)
			if err != nil {
				return "", err
			}
			code = string(d)
		default:
			return "", fmt.Errorf("unsupported src type: %T", src)
		}
	}
	client := NewNativeServiceClient()
	resp, err := client.ParseFile(&api.ParseFile_Args{
		Path:   filename,
		Source: code,
	})
	if err != nil {
		return "", err
	}
	return resp.AstJson, nil
}
