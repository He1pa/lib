// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spec.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.kcl.api;

@kotlin.jvm.JvmName("-initializelistDepFilesArgs")
public inline fun listDepFilesArgs(block: com.kcl.api.ListDepFiles_ArgsKt.Dsl.() -> kotlin.Unit): com.kcl.api.Spec.ListDepFiles_Args =
  com.kcl.api.ListDepFiles_ArgsKt.Dsl._create(com.kcl.api.Spec.ListDepFiles_Args.newBuilder()).apply { block() }._build()
/**
 * ```
 * Message for list dependency files request arguments.
 * ```
 *
 * Protobuf type `com.kcl.api.ListDepFiles_Args`
 */
public object ListDepFiles_ArgsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.kcl.api.Spec.ListDepFiles_Args.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.kcl.api.Spec.ListDepFiles_Args.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.kcl.api.Spec.ListDepFiles_Args = _builder.build()

    /**
     * ```
     * Working directory.
     * ```
     *
     * `string work_dir = 1;`
     */
    public var workDir: kotlin.String
      @JvmName("getWorkDir")
      get() = _builder.getWorkDir()
      @JvmName("setWorkDir")
      set(value) {
        _builder.setWorkDir(value)
      }
    /**
     * ```
     * Working directory.
     * ```
     *
     * `string work_dir = 1;`
     */
    public fun clearWorkDir() {
      _builder.clearWorkDir()
    }

    /**
     * ```
     * Flag to use absolute paths.
     * ```
     *
     * `bool use_abs_path = 2;`
     */
    public var useAbsPath: kotlin.Boolean
      @JvmName("getUseAbsPath")
      get() = _builder.getUseAbsPath()
      @JvmName("setUseAbsPath")
      set(value) {
        _builder.setUseAbsPath(value)
      }
    /**
     * ```
     * Flag to use absolute paths.
     * ```
     *
     * `bool use_abs_path = 2;`
     */
    public fun clearUseAbsPath() {
      _builder.clearUseAbsPath()
    }

    /**
     * ```
     * Flag to include all files.
     * ```
     *
     * `bool include_all = 3;`
     */
    public var includeAll: kotlin.Boolean
      @JvmName("getIncludeAll")
      get() = _builder.getIncludeAll()
      @JvmName("setIncludeAll")
      set(value) {
        _builder.setIncludeAll(value)
      }
    /**
     * ```
     * Flag to include all files.
     * ```
     *
     * `bool include_all = 3;`
     */
    public fun clearIncludeAll() {
      _builder.clearIncludeAll()
    }

    /**
     * ```
     * Flag to use fast parser.
     * ```
     *
     * `bool use_fast_parser = 4;`
     */
    public var useFastParser: kotlin.Boolean
      @JvmName("getUseFastParser")
      get() = _builder.getUseFastParser()
      @JvmName("setUseFastParser")
      set(value) {
        _builder.setUseFastParser(value)
      }
    /**
     * ```
     * Flag to use fast parser.
     * ```
     *
     * `bool use_fast_parser = 4;`
     */
    public fun clearUseFastParser() {
      _builder.clearUseFastParser()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.kcl.api.Spec.ListDepFiles_Args.copy(block: `com.kcl.api`.ListDepFiles_ArgsKt.Dsl.() -> kotlin.Unit): com.kcl.api.Spec.ListDepFiles_Args =
  `com.kcl.api`.ListDepFiles_ArgsKt.Dsl._create(this.toBuilder()).apply { block() }._build()

