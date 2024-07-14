// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spec.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.kcl.api;

@kotlin.jvm.JvmName("-initializeoverrideFileArgs")
public inline fun overrideFileArgs(block: com.kcl.api.OverrideFile_ArgsKt.Dsl.() -> kotlin.Unit): com.kcl.api.Spec.OverrideFile_Args =
  com.kcl.api.OverrideFile_ArgsKt.Dsl._create(com.kcl.api.Spec.OverrideFile_Args.newBuilder()).apply { block() }._build()
/**
 * ```
 * Message for override file request arguments.
 * ```
 *
 * Protobuf type `com.kcl.api.OverrideFile_Args`
 */
public object OverrideFile_ArgsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.kcl.api.Spec.OverrideFile_Args.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.kcl.api.Spec.OverrideFile_Args.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.kcl.api.Spec.OverrideFile_Args = _builder.build()

    /**
     * ```
     * Path of the file to override.
     * ```
     *
     * `string file = 1;`
     */
    public var file: kotlin.String
      @JvmName("getFile")
      get() = _builder.getFile()
      @JvmName("setFile")
      set(value) {
        _builder.setFile(value)
      }
    /**
     * ```
     * Path of the file to override.
     * ```
     *
     * `string file = 1;`
     */
    public fun clearFile() {
      _builder.clearFile()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class SpecsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * ```
     * List of override specifications.
     * ```
     *
     * `repeated string specs = 2;`
     * @return A list containing the specs.
     */
    public val specs: com.google.protobuf.kotlin.DslList<kotlin.String, SpecsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getSpecsList()
      )
    /**
     * ```
     * List of override specifications.
     * ```
     *
     * `repeated string specs = 2;`
     * @param value The specs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addSpecs")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, SpecsProxy>.add(value: kotlin.String) {
      _builder.addSpecs(value)
    }
    /**
     * ```
     * List of override specifications.
     * ```
     *
     * `repeated string specs = 2;`
     * @param value The specs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignSpecs")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, SpecsProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * ```
     * List of override specifications.
     * ```
     *
     * `repeated string specs = 2;`
     * @param values The specs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllSpecs")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, SpecsProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllSpecs(values)
    }
    /**
     * ```
     * List of override specifications.
     * ```
     *
     * `repeated string specs = 2;`
     * @param values The specs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllSpecs")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, SpecsProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * ```
     * List of override specifications.
     * ```
     *
     * `repeated string specs = 2;`
     * @param index The index to set the value at.
     * @param value The specs to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setSpecs")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, SpecsProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setSpecs(index, value)
    }/**
     * ```
     * List of override specifications.
     * ```
     *
     * `repeated string specs = 2;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearSpecs")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, SpecsProxy>.clear() {
      _builder.clearSpecs()
    }
    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ImportPathsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * ```
     * List of import paths.
     * ```
     *
     * `repeated string import_paths = 3;`
     * @return A list containing the importPaths.
     */
    public val importPaths: com.google.protobuf.kotlin.DslList<kotlin.String, ImportPathsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getImportPathsList()
      )
    /**
     * ```
     * List of import paths.
     * ```
     *
     * `repeated string import_paths = 3;`
     * @param value The importPaths to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addImportPaths")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, ImportPathsProxy>.add(value: kotlin.String) {
      _builder.addImportPaths(value)
    }
    /**
     * ```
     * List of import paths.
     * ```
     *
     * `repeated string import_paths = 3;`
     * @param value The importPaths to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignImportPaths")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ImportPathsProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * ```
     * List of import paths.
     * ```
     *
     * `repeated string import_paths = 3;`
     * @param values The importPaths to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllImportPaths")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, ImportPathsProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllImportPaths(values)
    }
    /**
     * ```
     * List of import paths.
     * ```
     *
     * `repeated string import_paths = 3;`
     * @param values The importPaths to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllImportPaths")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ImportPathsProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * ```
     * List of import paths.
     * ```
     *
     * `repeated string import_paths = 3;`
     * @param index The index to set the value at.
     * @param value The importPaths to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setImportPaths")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ImportPathsProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setImportPaths(index, value)
    }/**
     * ```
     * List of import paths.
     * ```
     *
     * `repeated string import_paths = 3;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearImportPaths")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, ImportPathsProxy>.clear() {
      _builder.clearImportPaths()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun com.kcl.api.Spec.OverrideFile_Args.copy(block: `com.kcl.api`.OverrideFile_ArgsKt.Dsl.() -> kotlin.Unit): com.kcl.api.Spec.OverrideFile_Args =
  `com.kcl.api`.OverrideFile_ArgsKt.Dsl._create(this.toBuilder()).apply { block() }._build()

