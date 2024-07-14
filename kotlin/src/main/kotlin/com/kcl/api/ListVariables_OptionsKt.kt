// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spec.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.kcl.api;

@kotlin.jvm.JvmName("-initializelistVariablesOptions")
public inline fun listVariablesOptions(block: com.kcl.api.ListVariables_OptionsKt.Dsl.() -> kotlin.Unit): com.kcl.api.Spec.ListVariables_Options =
  com.kcl.api.ListVariables_OptionsKt.Dsl._create(com.kcl.api.Spec.ListVariables_Options.newBuilder()).apply { block() }._build()
/**
 * ```
 * Message for list variables options.
 * ```
 *
 * Protobuf type `com.kcl.api.ListVariables_Options`
 */
public object ListVariables_OptionsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.kcl.api.Spec.ListVariables_Options.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.kcl.api.Spec.ListVariables_Options.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.kcl.api.Spec.ListVariables_Options = _builder.build()

    /**
     * ```
     * Flag to merge program configuration.
     * ```
     *
     * `bool merge_program = 1;`
     */
    public var mergeProgram: kotlin.Boolean
      @JvmName("getMergeProgram")
      get() = _builder.getMergeProgram()
      @JvmName("setMergeProgram")
      set(value) {
        _builder.setMergeProgram(value)
      }
    /**
     * ```
     * Flag to merge program configuration.
     * ```
     *
     * `bool merge_program = 1;`
     */
    public fun clearMergeProgram() {
      _builder.clearMergeProgram()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.kcl.api.Spec.ListVariables_Options.copy(block: `com.kcl.api`.ListVariables_OptionsKt.Dsl.() -> kotlin.Unit): com.kcl.api.Spec.ListVariables_Options =
  `com.kcl.api`.ListVariables_OptionsKt.Dsl._create(this.toBuilder()).apply { block() }._build()

