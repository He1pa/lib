// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spec.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.kcl.api;

@kotlin.jvm.JvmName("-initializepingResult")
public inline fun pingResult(block: com.kcl.api.Ping_ResultKt.Dsl.() -> kotlin.Unit): com.kcl.api.Spec.Ping_Result =
  com.kcl.api.Ping_ResultKt.Dsl._create(com.kcl.api.Spec.Ping_Result.newBuilder()).apply { block() }._build()
/**
 * ```
 * Message for ping response.
 * ```
 *
 * Protobuf type `com.kcl.api.Ping_Result`
 */
public object Ping_ResultKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.kcl.api.Spec.Ping_Result.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.kcl.api.Spec.Ping_Result.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.kcl.api.Spec.Ping_Result = _builder.build()

    /**
     * ```
     * Value received in the ping response.
     * ```
     *
     * `string value = 1;`
     */
    public var value: kotlin.String
      @JvmName("getValue")
      get() = _builder.getValue()
      @JvmName("setValue")
      set(value) {
        _builder.setValue(value)
      }
    /**
     * ```
     * Value received in the ping response.
     * ```
     *
     * `string value = 1;`
     */
    public fun clearValue() {
      _builder.clearValue()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.kcl.api.Spec.Ping_Result.copy(block: `com.kcl.api`.Ping_ResultKt.Dsl.() -> kotlin.Unit): com.kcl.api.Spec.Ping_Result =
  `com.kcl.api`.Ping_ResultKt.Dsl._create(this.toBuilder()).apply { block() }._build()

