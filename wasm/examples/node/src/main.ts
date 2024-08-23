import { load, invokeKCLRun, KCLWasmLoadOptions } from '@kcl-lang/wasm-lib'
import fs from '@zenfs/core';

async function main() {
  const opt: KCLWasmLoadOptions = {
    // @ts-ignore
    fs
  }
  const files: Map<string, string> = new Map();
  files.set("test.k",    `
  schema Person:
    name: str
  
  p = Person {name = "Alice"}` );

  const inst = await load(files, opt);
  const result = invokeKCLRun(inst, {
    filename: "test.k",
    source: `
schema Person:
  name: str

p = Person {name = "Alice"}`,
  });
  console.log(result)
}

main()


