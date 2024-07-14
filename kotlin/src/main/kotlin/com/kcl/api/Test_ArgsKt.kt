// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spec.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.kcl.api;

@kotlin.jvm.JvmName("-initializetestArgs")
public inline fun testArgs(block: com.kcl.api.Test_ArgsKt.Dsl.() -> kotlin.Unit): com.kcl.api.Spec.Test_Args =
  com.kcl.api.Test_ArgsKt.Dsl._create(com.kcl.api.Spec.Test_Args.newBuilder()).apply { block() }._build()
/**
 * ```
 * Message for test request arguments.
 * ```
 *
 * Protobuf type `com.kcl.api.Test_Args`
 */
public object Test_ArgsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.kcl.api.Spec.Test_Args.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.kcl.api.Spec.Test_Args.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.kcl.api.Spec.Test_Args = _builder.build()

    /**
     * ```
     * Execution program arguments.
     * ```
     *
     * `.com.kcl.api.ExecProgram_Args exec_args = 1;`
     */
    public var execArgs: com.kcl.api.Spec.ExecProgram_Args
      @JvmName("getExecArgs")
      get() = _builder.getExecArgs()
      @JvmName("setExecArgs")
      set(value) {
        _builder.setExecArgs(value)
      }
    /**
     * ```
     * Execution program arguments.
     * ```
     *
     * `.com.kcl.api.ExecProgram_Args exec_args = 1;`
     */
    public fun clearExecArgs() {
      _builder.clearExecArgs()
    }
    /**
     * ```
     * Execution program arguments.
     * ```
     *
     * `.com.kcl.api.ExecProgram_Args exec_args = 1;`
     * @return Whether the execArgs field is set.
     */
    public fun hasExecArgs(): kotlin.Boolean {
      return _builder.hasExecArgs()
    }
    public val Test_ArgsKt.Dsl.execArgsOrNull: com.kcl.api.Spec.ExecProgram_Args?
      get() = _builder.execArgsOrNull

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class PkgListProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * ```
     * List of KCL package paths to be tested.
     * ```
     *
     * `repeated string pkg_list = 2;`
     * @return A list containing the pkgList.
     */
    public val pkgList: com.google.protobuf.kotlin.DslList<kotlin.String, PkgListProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getPkgListList()
      )
    /**
     * ```
     * List of KCL package paths to be tested.
     * ```
     *
     * `repeated string pkg_list = 2;`
     * @param value The pkgList to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addPkgList")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, PkgListProxy>.add(value: kotlin.String) {
      _builder.addPkgList(value)
    }
    /**
     * ```
     * List of KCL package paths to be tested.
     * ```
     *
     * `repeated string pkg_list = 2;`
     * @param value The pkgList to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignPkgList")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, PkgListProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * ```
     * List of KCL package paths to be tested.
     * ```
     *
     * `repeated string pkg_list = 2;`
     * @param values The pkgList to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllPkgList")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, PkgListProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllPkgList(values)
    }
    /**
     * ```
     * List of KCL package paths to be tested.
     * ```
     *
     * `repeated string pkg_list = 2;`
     * @param values The pkgList to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllPkgList")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, PkgListProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * ```
     * List of KCL package paths to be tested.
     * ```
     *
     * `repeated string pkg_list = 2;`
     * @param index The index to set the value at.
     * @param value The pkgList to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setPkgList")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, PkgListProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setPkgList(index, value)
    }/**
     * ```
     * List of KCL package paths to be tested.
     * ```
     *
     * `repeated string pkg_list = 2;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearPkgList")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, PkgListProxy>.clear() {
      _builder.clearPkgList()
    }
    /**
     * ```
     * Regular expression for filtering tests to run.
     * ```
     *
     * `string run_regexp = 3;`
     */
    public var runRegexp: kotlin.String
      @JvmName("getRunRegexp")
      get() = _builder.getRunRegexp()
      @JvmName("setRunRegexp")
      set(value) {
        _builder.setRunRegexp(value)
      }
    /**
     * ```
     * Regular expression for filtering tests to run.
     * ```
     *
     * `string run_regexp = 3;`
     */
    public fun clearRunRegexp() {
      _builder.clearRunRegexp()
    }

    /**
     * ```
     * Flag to stop the test run on the first failure.
     * ```
     *
     * `bool fail_fast = 4;`
     */
    public var failFast: kotlin.Boolean
      @JvmName("getFailFast")
      get() = _builder.getFailFast()
      @JvmName("setFailFast")
      set(value) {
        _builder.setFailFast(value)
      }
    /**
     * ```
     * Flag to stop the test run on the first failure.
     * ```
     *
     * `bool fail_fast = 4;`
     */
    public fun clearFailFast() {
      _builder.clearFailFast()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.kcl.api.Spec.Test_Args.copy(block: `com.kcl.api`.Test_ArgsKt.Dsl.() -> kotlin.Unit): com.kcl.api.Spec.Test_Args =
  `com.kcl.api`.Test_ArgsKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.kcl.api.Spec.Test_ArgsOrBuilder.execArgsOrNull: com.kcl.api.Spec.ExecProgram_Args?
  get() = if (hasExecArgs()) getExecArgs() else null

