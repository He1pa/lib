// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spec.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.kcl.api;

@kotlin.jvm.JvmName("-initializevalidateCodeArgs")
public inline fun validateCodeArgs(block: com.kcl.api.ValidateCode_ArgsKt.Dsl.() -> kotlin.Unit): com.kcl.api.Spec.ValidateCode_Args =
  com.kcl.api.ValidateCode_ArgsKt.Dsl._create(com.kcl.api.Spec.ValidateCode_Args.newBuilder()).apply { block() }._build()
/**
 * ```
 * Message for validate code request arguments.
 * ```
 *
 * Protobuf type `com.kcl.api.ValidateCode_Args`
 */
public object ValidateCode_ArgsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.kcl.api.Spec.ValidateCode_Args.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.kcl.api.Spec.ValidateCode_Args.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.kcl.api.Spec.ValidateCode_Args = _builder.build()

    /**
     * ```
     * Path to the data file.
     * ```
     *
     * `string datafile = 1;`
     */
    public var datafile: kotlin.String
      @JvmName("getDatafile")
      get() = _builder.getDatafile()
      @JvmName("setDatafile")
      set(value) {
        _builder.setDatafile(value)
      }
    /**
     * ```
     * Path to the data file.
     * ```
     *
     * `string datafile = 1;`
     */
    public fun clearDatafile() {
      _builder.clearDatafile()
    }

    /**
     * ```
     * Data content.
     * ```
     *
     * `string data = 2;`
     */
    public var data: kotlin.String
      @JvmName("getData")
      get() = _builder.getData()
      @JvmName("setData")
      set(value) {
        _builder.setData(value)
      }
    /**
     * ```
     * Data content.
     * ```
     *
     * `string data = 2;`
     */
    public fun clearData() {
      _builder.clearData()
    }

    /**
     * ```
     * Path to the code file.
     * ```
     *
     * `string file = 3;`
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
     * Path to the code file.
     * ```
     *
     * `string file = 3;`
     */
    public fun clearFile() {
      _builder.clearFile()
    }

    /**
     * ```
     * Source code content.
     * ```
     *
     * `string code = 4;`
     */
    public var code: kotlin.String
      @JvmName("getCode")
      get() = _builder.getCode()
      @JvmName("setCode")
      set(value) {
        _builder.setCode(value)
      }
    /**
     * ```
     * Source code content.
     * ```
     *
     * `string code = 4;`
     */
    public fun clearCode() {
      _builder.clearCode()
    }

    /**
     * ```
     * Name of the schema.
     * ```
     *
     * `string schema = 5;`
     */
    public var schema: kotlin.String
      @JvmName("getSchema")
      get() = _builder.getSchema()
      @JvmName("setSchema")
      set(value) {
        _builder.setSchema(value)
      }
    /**
     * ```
     * Name of the schema.
     * ```
     *
     * `string schema = 5;`
     */
    public fun clearSchema() {
      _builder.clearSchema()
    }

    /**
     * ```
     * Name of the attribute.
     * ```
     *
     * `string attribute_name = 6;`
     */
    public var attributeName: kotlin.String
      @JvmName("getAttributeName")
      get() = _builder.getAttributeName()
      @JvmName("setAttributeName")
      set(value) {
        _builder.setAttributeName(value)
      }
    /**
     * ```
     * Name of the attribute.
     * ```
     *
     * `string attribute_name = 6;`
     */
    public fun clearAttributeName() {
      _builder.clearAttributeName()
    }

    /**
     * ```
     * Format of the validation (e.g., "json", "yaml").
     * ```
     *
     * `string format = 7;`
     */
    public var format: kotlin.String
      @JvmName("getFormat")
      get() = _builder.getFormat()
      @JvmName("setFormat")
      set(value) {
        _builder.setFormat(value)
      }
    /**
     * ```
     * Format of the validation (e.g., "json", "yaml").
     * ```
     *
     * `string format = 7;`
     */
    public fun clearFormat() {
      _builder.clearFormat()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.kcl.api.Spec.ValidateCode_Args.copy(block: `com.kcl.api`.ValidateCode_ArgsKt.Dsl.() -> kotlin.Unit): com.kcl.api.Spec.ValidateCode_Args =
  `com.kcl.api`.ValidateCode_ArgsKt.Dsl._create(this.toBuilder()).apply { block() }._build()

