// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spec.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.kcl.api;

@kotlin.jvm.JvmName("-initializegetVersionArgs")
public inline fun getVersionArgs(block: com.kcl.api.GetVersion_ArgsKt.Dsl.() -> kotlin.Unit): com.kcl.api.Spec.GetVersion_Args =
  com.kcl.api.GetVersion_ArgsKt.Dsl._create(com.kcl.api.Spec.GetVersion_Args.newBuilder()).apply { block() }._build()
/**
 * ```
 * Message for version request arguments. Empty message.
 * ```
 *
 * Protobuf type `com.kcl.api.GetVersion_Args`
 */
public object GetVersion_ArgsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.kcl.api.Spec.GetVersion_Args.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.kcl.api.Spec.GetVersion_Args.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.kcl.api.Spec.GetVersion_Args = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.kcl.api.Spec.GetVersion_Args.copy(block: `com.kcl.api`.GetVersion_ArgsKt.Dsl.() -> kotlin.Unit): com.kcl.api.Spec.GetVersion_Args =
  `com.kcl.api`.GetVersion_ArgsKt.Dsl._create(this.toBuilder()).apply { block() }._build()

