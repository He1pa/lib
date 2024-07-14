// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spec.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.kcl.api;

@kotlin.jvm.JvmName("-initializetestResult")
public inline fun testResult(block: com.kcl.api.Test_ResultKt.Dsl.() -> kotlin.Unit): com.kcl.api.Spec.Test_Result =
  com.kcl.api.Test_ResultKt.Dsl._create(com.kcl.api.Spec.Test_Result.newBuilder()).apply { block() }._build()
/**
 * ```
 * Message for test response.
 * ```
 *
 * Protobuf type `com.kcl.api.Test_Result`
 */
public object Test_ResultKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.kcl.api.Spec.Test_Result.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.kcl.api.Spec.Test_Result.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.kcl.api.Spec.Test_Result = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class InfoProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * ```
     * List of test case information.
     * ```
     *
     * `repeated .com.kcl.api.TestCaseInfo info = 2;`
     */
     public val info: com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.TestCaseInfo, InfoProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getInfoList()
      )
    /**
     * ```
     * List of test case information.
     * ```
     *
     * `repeated .com.kcl.api.TestCaseInfo info = 2;`
     * @param value The info to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addInfo")
    public fun com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.TestCaseInfo, InfoProxy>.add(value: com.kcl.api.Spec.TestCaseInfo) {
      _builder.addInfo(value)
    }
    /**
     * ```
     * List of test case information.
     * ```
     *
     * `repeated .com.kcl.api.TestCaseInfo info = 2;`
     * @param value The info to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignInfo")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.TestCaseInfo, InfoProxy>.plusAssign(value: com.kcl.api.Spec.TestCaseInfo) {
      add(value)
    }
    /**
     * ```
     * List of test case information.
     * ```
     *
     * `repeated .com.kcl.api.TestCaseInfo info = 2;`
     * @param values The info to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllInfo")
    public fun com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.TestCaseInfo, InfoProxy>.addAll(values: kotlin.collections.Iterable<com.kcl.api.Spec.TestCaseInfo>) {
      _builder.addAllInfo(values)
    }
    /**
     * ```
     * List of test case information.
     * ```
     *
     * `repeated .com.kcl.api.TestCaseInfo info = 2;`
     * @param values The info to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllInfo")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.TestCaseInfo, InfoProxy>.plusAssign(values: kotlin.collections.Iterable<com.kcl.api.Spec.TestCaseInfo>) {
      addAll(values)
    }
    /**
     * ```
     * List of test case information.
     * ```
     *
     * `repeated .com.kcl.api.TestCaseInfo info = 2;`
     * @param index The index to set the value at.
     * @param value The info to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setInfo")
    public operator fun com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.TestCaseInfo, InfoProxy>.set(index: kotlin.Int, value: com.kcl.api.Spec.TestCaseInfo) {
      _builder.setInfo(index, value)
    }
    /**
     * ```
     * List of test case information.
     * ```
     *
     * `repeated .com.kcl.api.TestCaseInfo info = 2;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearInfo")
    public fun com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.TestCaseInfo, InfoProxy>.clear() {
      _builder.clearInfo()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.kcl.api.Spec.Test_Result.copy(block: `com.kcl.api`.Test_ResultKt.Dsl.() -> kotlin.Unit): com.kcl.api.Spec.Test_Result =
  `com.kcl.api`.Test_ResultKt.Dsl._create(this.toBuilder()).apply { block() }._build()

