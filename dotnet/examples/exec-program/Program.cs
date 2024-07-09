﻿using KclLib.API;

var api = new API();
var execArgs = new ExecProgram_Args();
var path = Path.Combine("test_data", "schema.k");
execArgs.KFilenameList.Add(path);
var result = api.ExecProgram(execArgs);
Console.WriteLine(result.YamlResult);
