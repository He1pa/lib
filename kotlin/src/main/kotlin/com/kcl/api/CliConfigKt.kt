// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spec.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.kcl.api;

@kotlin.jvm.JvmName("-initializecliConfig")
public inline fun cliConfig(block: com.kcl.api.CliConfigKt.Dsl.() -> kotlin.Unit): com.kcl.api.Spec.CliConfig =
  com.kcl.api.CliConfigKt.Dsl._create(com.kcl.api.Spec.CliConfig.newBuilder()).apply { block() }._build()
/**
 * ```
 * Message representing KCL CLI configuration.
 * ```
 *
 * Protobuf type `com.kcl.api.CliConfig`
 */
public object CliConfigKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.kcl.api.Spec.CliConfig.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.kcl.api.Spec.CliConfig.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.kcl.api.Spec.CliConfig = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class FilesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * ```
     * List of files.
     * ```
     *
     * `repeated string files = 1;`
     * @return A list containing the files.
     */
    public val files: com.google.protobuf.kotlin.DslList<kotlin.String, FilesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getFilesList()
      )
    /**
     * ```
     * List of files.
     * ```
     *
     * `repeated string files = 1;`
     * @param value The files to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addFiles")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, FilesProxy>.add(value: kotlin.String) {
      _builder.addFiles(value)
    }
    /**
     * ```
     * List of files.
     * ```
     *
     * `repeated string files = 1;`
     * @param value The files to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignFiles")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, FilesProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * ```
     * List of files.
     * ```
     *
     * `repeated string files = 1;`
     * @param values The files to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllFiles")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, FilesProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllFiles(values)
    }
    /**
     * ```
     * List of files.
     * ```
     *
     * `repeated string files = 1;`
     * @param values The files to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllFiles")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, FilesProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * ```
     * List of files.
     * ```
     *
     * `repeated string files = 1;`
     * @param index The index to set the value at.
     * @param value The files to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setFiles")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, FilesProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setFiles(index, value)
    }/**
     * ```
     * List of files.
     * ```
     *
     * `repeated string files = 1;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearFiles")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, FilesProxy>.clear() {
      _builder.clearFiles()
    }
    /**
     * ```
     * Output path.
     * ```
     *
     * `string output = 2;`
     */
    public var output: kotlin.String
      @JvmName("getOutput")
      get() = _builder.getOutput()
      @JvmName("setOutput")
      set(value) {
        _builder.setOutput(value)
      }
    /**
     * ```
     * Output path.
     * ```
     *
     * `string output = 2;`
     */
    public fun clearOutput() {
      _builder.clearOutput()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class OverridesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * ```
     * List of overrides.
     * ```
     *
     * `repeated string overrides = 3;`
     * @return A list containing the overrides.
     */
    public val overrides: com.google.protobuf.kotlin.DslList<kotlin.String, OverridesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getOverridesList()
      )
    /**
     * ```
     * List of overrides.
     * ```
     *
     * `repeated string overrides = 3;`
     * @param value The overrides to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addOverrides")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, OverridesProxy>.add(value: kotlin.String) {
      _builder.addOverrides(value)
    }
    /**
     * ```
     * List of overrides.
     * ```
     *
     * `repeated string overrides = 3;`
     * @param value The overrides to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignOverrides")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, OverridesProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * ```
     * List of overrides.
     * ```
     *
     * `repeated string overrides = 3;`
     * @param values The overrides to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllOverrides")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, OverridesProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllOverrides(values)
    }
    /**
     * ```
     * List of overrides.
     * ```
     *
     * `repeated string overrides = 3;`
     * @param values The overrides to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllOverrides")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, OverridesProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * ```
     * List of overrides.
     * ```
     *
     * `repeated string overrides = 3;`
     * @param index The index to set the value at.
     * @param value The overrides to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setOverrides")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, OverridesProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setOverrides(index, value)
    }/**
     * ```
     * List of overrides.
     * ```
     *
     * `repeated string overrides = 3;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearOverrides")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, OverridesProxy>.clear() {
      _builder.clearOverrides()
    }
    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class PathSelectorProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * ```
     * Path selectors.
     * ```
     *
     * `repeated string path_selector = 4;`
     * @return A list containing the pathSelector.
     */
    public val pathSelector: com.google.protobuf.kotlin.DslList<kotlin.String, PathSelectorProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getPathSelectorList()
      )
    /**
     * ```
     * Path selectors.
     * ```
     *
     * `repeated string path_selector = 4;`
     * @param value The pathSelector to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addPathSelector")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, PathSelectorProxy>.add(value: kotlin.String) {
      _builder.addPathSelector(value)
    }
    /**
     * ```
     * Path selectors.
     * ```
     *
     * `repeated string path_selector = 4;`
     * @param value The pathSelector to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignPathSelector")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, PathSelectorProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * ```
     * Path selectors.
     * ```
     *
     * `repeated string path_selector = 4;`
     * @param values The pathSelector to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllPathSelector")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, PathSelectorProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllPathSelector(values)
    }
    /**
     * ```
     * Path selectors.
     * ```
     *
     * `repeated string path_selector = 4;`
     * @param values The pathSelector to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllPathSelector")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, PathSelectorProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * ```
     * Path selectors.
     * ```
     *
     * `repeated string path_selector = 4;`
     * @param index The index to set the value at.
     * @param value The pathSelector to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setPathSelector")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, PathSelectorProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setPathSelector(index, value)
    }/**
     * ```
     * Path selectors.
     * ```
     *
     * `repeated string path_selector = 4;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearPathSelector")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, PathSelectorProxy>.clear() {
      _builder.clearPathSelector()
    }
    /**
     * ```
     * Flag for strict range check.
     * ```
     *
     * `bool strict_range_check = 5;`
     */
    public var strictRangeCheck: kotlin.Boolean
      @JvmName("getStrictRangeCheck")
      get() = _builder.getStrictRangeCheck()
      @JvmName("setStrictRangeCheck")
      set(value) {
        _builder.setStrictRangeCheck(value)
      }
    /**
     * ```
     * Flag for strict range check.
     * ```
     *
     * `bool strict_range_check = 5;`
     */
    public fun clearStrictRangeCheck() {
      _builder.clearStrictRangeCheck()
    }

    /**
     * ```
     * Flag to disable none values.
     * ```
     *
     * `bool disable_none = 6;`
     */
    public var disableNone: kotlin.Boolean
      @JvmName("getDisableNone")
      get() = _builder.getDisableNone()
      @JvmName("setDisableNone")
      set(value) {
        _builder.setDisableNone(value)
      }
    /**
     * ```
     * Flag to disable none values.
     * ```
     *
     * `bool disable_none = 6;`
     */
    public fun clearDisableNone() {
      _builder.clearDisableNone()
    }

    /**
     * ```
     * Verbose level.
     * ```
     *
     * `int64 verbose = 7;`
     */
    public var verbose: kotlin.Long
      @JvmName("getVerbose")
      get() = _builder.getVerbose()
      @JvmName("setVerbose")
      set(value) {
        _builder.setVerbose(value)
      }
    /**
     * ```
     * Verbose level.
     * ```
     *
     * `int64 verbose = 7;`
     */
    public fun clearVerbose() {
      _builder.clearVerbose()
    }

    /**
     * ```
     * Debug flag.
     * ```
     *
     * `bool debug = 8;`
     */
    public var debug: kotlin.Boolean
      @JvmName("getDebug")
      get() = _builder.getDebug()
      @JvmName("setDebug")
      set(value) {
        _builder.setDebug(value)
      }
    /**
     * ```
     * Debug flag.
     * ```
     *
     * `bool debug = 8;`
     */
    public fun clearDebug() {
      _builder.clearDebug()
    }

    /**
     * ```
     * Flag to sort keys in YAML/JSON results.
     * ```
     *
     * `bool sort_keys = 9;`
     */
    public var sortKeys: kotlin.Boolean
      @JvmName("getSortKeys")
      get() = _builder.getSortKeys()
      @JvmName("setSortKeys")
      set(value) {
        _builder.setSortKeys(value)
      }
    /**
     * ```
     * Flag to sort keys in YAML/JSON results.
     * ```
     *
     * `bool sort_keys = 9;`
     */
    public fun clearSortKeys() {
      _builder.clearSortKeys()
    }

    /**
     * ```
     * Flag to show hidden attributes.
     * ```
     *
     * `bool show_hidden = 10;`
     */
    public var showHidden: kotlin.Boolean
      @JvmName("getShowHidden")
      get() = _builder.getShowHidden()
      @JvmName("setShowHidden")
      set(value) {
        _builder.setShowHidden(value)
      }
    /**
     * ```
     * Flag to show hidden attributes.
     * ```
     *
     * `bool show_hidden = 10;`
     */
    public fun clearShowHidden() {
      _builder.clearShowHidden()
    }

    /**
     * ```
     * Flag to include schema type path in results.
     * ```
     *
     * `bool include_schema_type_path = 11;`
     */
    public var includeSchemaTypePath: kotlin.Boolean
      @JvmName("getIncludeSchemaTypePath")
      get() = _builder.getIncludeSchemaTypePath()
      @JvmName("setIncludeSchemaTypePath")
      set(value) {
        _builder.setIncludeSchemaTypePath(value)
      }
    /**
     * ```
     * Flag to include schema type path in results.
     * ```
     *
     * `bool include_schema_type_path = 11;`
     */
    public fun clearIncludeSchemaTypePath() {
      _builder.clearIncludeSchemaTypePath()
    }

    /**
     * ```
     * Flag for fast evaluation.
     * ```
     *
     * `bool fast_eval = 12;`
     */
    public var fastEval: kotlin.Boolean
      @JvmName("getFastEval")
      get() = _builder.getFastEval()
      @JvmName("setFastEval")
      set(value) {
        _builder.setFastEval(value)
      }
    /**
     * ```
     * Flag for fast evaluation.
     * ```
     *
     * `bool fast_eval = 12;`
     */
    public fun clearFastEval() {
      _builder.clearFastEval()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.kcl.api.Spec.CliConfig.copy(block: `com.kcl.api`.CliConfigKt.Dsl.() -> kotlin.Unit): com.kcl.api.Spec.CliConfig =
  `com.kcl.api`.CliConfigKt.Dsl._create(this.toBuilder()).apply { block() }._build()

