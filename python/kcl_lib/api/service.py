import kcl_lib
import kcl_lib.plugin as plugin
from .spec_pb2 import (
    Ping_Args,
    Ping_Result,
    GetVersion_Args,
    GetVersion_Result,
    ParseFile_Args,
    ParseFile_Result,
    ParseProgram_Args,
    ParseProgram_Result,
    LoadPackage_Args,
    LoadPackage_Result,
    ListOptions_Result,
    ExecProgram_Args,
    ExecProgram_Result,
    BuildProgram_Args,
    BuildProgram_Result,
    ExecArtifact_Args,
    FormatCode_Args,
    FormatCode_Result,
    FormatPath_Args,
    FormatPath_Result,
    LintPath_Args,
    LintPath_Result,
    OverrideFile_Args,
    OverrideFile_Result,
    ListVariables_Args,
    ListVariables_Result,
    GetSchemaTypeMapping_Args,
    GetSchemaTypeMapping_Result,
    ValidateCode_Args,
    ValidateCode_Result,
    ListDepFiles_Args,
    ListDepFiles_Result,
    LoadSettingsFiles_Args,
    LoadSettingsFiles_Result,
    Rename_Args,
    Rename_Result,
    RenameCode_Args,
    RenameCode_Result,
    Test_Args,
    Test_Result,
    UpdateDependencies_Args,
    UpdateDependencies_Result,
)
from google.protobuf import message as _message


class API:
    """KCL APIs

    Examples
    --------
    ```python
    import kcl_lib.api as api
    # Call the `exec_program` method with appropriate arguments
    args = api.ExecProgram_Args(k_filename_list=["a.k"])
    # Usage
    api = api.API()
    result = api.exec_program(args)
    print(result.yaml_result)
    ```
    """

    def __init__(self, plugin_agent: int = plugin.plugin_agent_addr):
        self.plugin_agent = plugin_agent

    def ping(self, args: Ping_Args) -> Ping_Result:
        return self.call("KclvmService.Ping", args)

    def parse_program(self, args: ParseProgram_Args) -> ParseProgram_Result:
        return self.call("KclvmService.ParseProgram", args)

    def exec_program(self, args: ExecProgram_Args) -> ExecProgram_Result:
        return self.call("KclvmService.ExecProgram", args)

    def build_program(self, args: BuildProgram_Args) -> BuildProgram_Result:
        return self.call("KclvmService.BuildProgram", args)

    def exec_artifact(self, args: ExecArtifact_Args) -> ExecProgram_Result:
        return self.call("KclvmService.ExecArtifact", args)

    def parse_file(self, args: ParseFile_Args) -> ParseFile_Result:
        return self.call("KclvmService.ParseFile", args)

    def parse_program(self, args: ParseProgram_Args) -> ParseProgram_Result:
        return self.call("KclvmService.ParseProgram", args)

    def load_package(self, args: LoadPackage_Args) -> LoadPackage_Result:
        return self.call("KclvmService.LoadPackage", args)

    def list_options(self, args: ParseProgram_Args) -> ListOptions_Result:
        return self.call("KclvmService.ListOptions", args)

    def list_variables(self, args: ListVariables_Args) -> ListVariables_Result:
        return self.call("KclvmService.ListVariables", args)

    def format_code(self, args: FormatCode_Args) -> FormatCode_Result:
        return self.call("KclvmService.FormatCode", args)

    def format_path(self, args: FormatPath_Args) -> FormatPath_Result:
        return self.call("KclvmService.FormatPath", args)

    def lint_path(self, args: LintPath_Args) -> LintPath_Result:
        return self.call("KclvmService.LintPath", args)

    def override_file(self, args: OverrideFile_Args) -> OverrideFile_Result:
        return self.call("KclvmService.OverrideFile", args)

    def get_schema_type_mapping(
        self,
        args: GetSchemaTypeMapping_Args,
    ) -> GetSchemaTypeMapping_Result:
        return self.call("KclvmService.GetSchemaTypeMapping", args)

    def validate_code(self, args: ValidateCode_Args) -> ValidateCode_Result:
        return self.call("KclvmService.ValidateCode", args)

    def load_settings_files(
        self,
        args: LoadSettingsFiles_Args,
    ) -> LoadSettingsFiles_Result:
        return self.call("KclvmService.LoadSettingsFiles", args)

    def rename(self, args: Rename_Args) -> Rename_Result:
        return self.call("KclvmService.Rename", args)

    def rename_code(self, args: RenameCode_Args) -> RenameCode_Result:
        return self.call("KclvmService.RenameCode", args)

    def test(self, args: Test_Args) -> Test_Result:
        return self.call("KclvmService.Test", args)

    def update_dependencies(
        self, args: UpdateDependencies_Args
    ) -> UpdateDependencies_Result:
        return self.call("KclvmService.UpdateDependencies", args)

    # Helper method to perform the call
    def call(self, name: str, args):
        # Serialize arguments using pickle or json
        args_serialized = args.SerializeToString()

        # Call the service function and get the result
        result = bytes(
            kcl_lib.call_with_plugin_agent(
                name.encode("utf-8"), args_serialized, self.plugin_agent
            )
        )
        if result.startswith(b"ERROR:"):
            raise Exception(result.decode(encoding="utf-8").removeprefix("ERROR:"))
        msg = self.create_method_resp_message(name)
        msg.ParseFromString(result)
        return msg

    def create_method_req_message(self, method: str) -> _message.Message:
        if method in ["Ping", "KclvmService.Ping"]:
            return Ping_Args()
        elif method in ["ExecProgram", "KclvmService.ExecProgram"]:
            return ExecProgram_Args()
        elif method in ["BuildProgram", "KclvmService.BuildProgram"]:
            return BuildProgram_Args()
        elif method in ["ExecArtifact", "KclvmService.ExecArtifact"]:
            return ExecArtifact_Args()
        elif method in ["ParseFile", "KclvmService.ParseFile"]:
            return ParseFile_Args()
        elif method in ["ParseProgram", "KclvmService.ParseProgram"]:
            return ParseProgram_Args()
        elif method in ["LoadPackage", "KclvmService.LoadPackage"]:
            return LoadPackage_Args()
        elif method in ["ListOptions", "KclvmService.ListOptions"]:
            return ParseProgram_Args()
        elif method in ["ListVariables", "KclvmService.ListVariables"]:
            return ListVariables_Args()
        elif method in ["FormatCode", "KclvmService.FormatCode"]:
            return FormatCode_Args()
        elif method in ["FormatPath", "KclvmService.FormatPath"]:
            return FormatPath_Args()
        elif method in ["LintPath", "KclvmService.LintPath"]:
            return LintPath_Args()
        elif method in ["OverrideFile", "KclvmService.OverrideFile"]:
            return OverrideFile_Args()
        elif method in ["GetSchemaTypeMapping", "KclvmService.GetSchemaTypeMapping"]:
            return GetSchemaTypeMapping_Args()
        elif method in ["ValidateCode", "KclvmService.ValidateCode"]:
            return ValidateCode_Args()
        elif method in ["ListDepFiles", "KclvmService.ListDepFiles"]:
            return ListDepFiles_Args()
        elif method in ["LoadSettingsFiles", "KclvmService.LoadSettingsFiles"]:
            return LoadSettingsFiles_Args()
        elif method in ["Rename", "KclvmService.Rename"]:
            return Rename_Args()
        elif method in ["RenameCode", "KclvmService.RenameCode"]:
            return RenameCode_Args()
        elif method in ["Test", "KclvmService.Test"]:
            return Test_Args()
        elif method in ["UpdateDependencies", "KclvmService.UpdateDependencies"]:
            return UpdateDependencies_Args()
        elif method in ["GetVersion", "KclvmService.GetVersion"]:
            return GetVersion_Args()
        raise Exception(f"unknown method: {method}")

    def create_method_resp_message(self, method: str) -> _message.Message:
        if method in ["Ping", "KclvmService.Ping"]:
            return Ping_Result()
        elif method in ["ExecProgram", "KclvmService.ExecProgram"]:
            return ExecProgram_Result()
        elif method in ["BuildProgram", "KclvmService.BuildProgram"]:
            return BuildProgram_Result()
        elif method in ["ExecArtifact", "KclvmService.ExecArtifact"]:
            return ExecProgram_Result()
        elif method in ["ParseFile", "KclvmService.ParseFile"]:
            return ParseFile_Result()
        elif method in ["ParseProgram", "KclvmService.ParseProgram"]:
            return ParseProgram_Result()
        elif method in ["LoadPackage", "KclvmService.LoadPackage"]:
            return LoadPackage_Result()
        elif method in ["ListOptions", "KclvmService.ListOptions"]:
            return ListOptions_Result()
        elif method in ["ListVariables", "KclvmService.ListVariables"]:
            return ListVariables_Result()
        elif method in ["FormatCode", "KclvmService.FormatCode"]:
            return FormatCode_Result()
        elif method in ["FormatPath", "KclvmService.FormatPath"]:
            return FormatPath_Result()
        elif method in ["LintPath", "KclvmService.LintPath"]:
            return LintPath_Result()
        elif method in ["OverrideFile", "KclvmService.OverrideFile"]:
            return OverrideFile_Result()
        elif method in ["GetSchemaTypeMapping", "KclvmService.GetSchemaTypeMapping"]:
            return GetSchemaTypeMapping_Result()
        elif method in ["ValidateCode", "KclvmService.ValidateCode"]:
            return ValidateCode_Result()
        elif method in ["ListDepFiles", "KclvmService.ListDepFiles"]:
            return ListDepFiles_Result()
        elif method in ["LoadSettingsFiles", "KclvmService.LoadSettingsFiles"]:
            return LoadSettingsFiles_Result()
        elif method in ["Rename", "KclvmService.Rename"]:
            return Rename_Result()
        elif method in ["RenameCode", "KclvmService.RenameCode"]:
            return RenameCode_Result()
        elif method in ["Test", "KclvmService.Test"]:
            return Test_Result()
        elif method in ["UpdateDependencies", "KclvmService.UpdateDependencies"]:
            return UpdateDependencies_Result()
        elif method in ["GetVersion", "KclvmService.GetVersion"]:
            return GetVersion_Result()
        raise Exception(f"unknown method: {method}")
