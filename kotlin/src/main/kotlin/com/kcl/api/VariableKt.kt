// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spec.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.kcl.api;

@kotlin.jvm.JvmName("-initializevariable")
public inline fun variable(block: com.kcl.api.VariableKt.Dsl.() -> kotlin.Unit): com.kcl.api.Spec.Variable =
  com.kcl.api.VariableKt.Dsl._create(com.kcl.api.Spec.Variable.newBuilder()).apply { block() }._build()
/**
 * ```
 * Message representing a variable.
 * ```
 *
 * Protobuf type `com.kcl.api.Variable`
 */
public object VariableKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.kcl.api.Spec.Variable.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.kcl.api.Spec.Variable.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.kcl.api.Spec.Variable = _builder.build()

    /**
     * ```
     * Value of the variable.
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
     * Value of the variable.
     * ```
     *
     * `string value = 1;`
     */
    public fun clearValue() {
      _builder.clearValue()
    }

    /**
     * ```
     * Type name of the variable.
     * ```
     *
     * `string type_name = 2;`
     */
    public var typeName: kotlin.String
      @JvmName("getTypeName")
      get() = _builder.getTypeName()
      @JvmName("setTypeName")
      set(value) {
        _builder.setTypeName(value)
      }
    /**
     * ```
     * Type name of the variable.
     * ```
     *
     * `string type_name = 2;`
     */
    public fun clearTypeName() {
      _builder.clearTypeName()
    }

    /**
     * ```
     * Operation symbol associated with the variable.
     * ```
     *
     * `string op_sym = 3;`
     */
    public var opSym: kotlin.String
      @JvmName("getOpSym")
      get() = _builder.getOpSym()
      @JvmName("setOpSym")
      set(value) {
        _builder.setOpSym(value)
      }
    /**
     * ```
     * Operation symbol associated with the variable.
     * ```
     *
     * `string op_sym = 3;`
     */
    public fun clearOpSym() {
      _builder.clearOpSym()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ListItemsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * ```
     * List items if the variable is a list.
     * ```
     *
     * `repeated .com.kcl.api.Variable list_items = 4;`
     */
     public val listItems: com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.Variable, ListItemsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getListItemsList()
      )
    /**
     * ```
     * List items if the variable is a list.
     * ```
     *
     * `repeated .com.kcl.api.Variable list_items = 4;`
     * @param value The listItems to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addListItems")
    public fun com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.Variable, ListItemsProxy>.add(value: com.kcl.api.Spec.Variable) {
      _builder.addListItems(value)
    }
    /**
     * ```
     * List items if the variable is a list.
     * ```
     *
     * `repeated .com.kcl.api.Variable list_items = 4;`
     * @param value The listItems to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignListItems")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.Variable, ListItemsProxy>.plusAssign(value: com.kcl.api.Spec.Variable) {
      add(value)
    }
    /**
     * ```
     * List items if the variable is a list.
     * ```
     *
     * `repeated .com.kcl.api.Variable list_items = 4;`
     * @param values The listItems to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllListItems")
    public fun com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.Variable, ListItemsProxy>.addAll(values: kotlin.collections.Iterable<com.kcl.api.Spec.Variable>) {
      _builder.addAllListItems(values)
    }
    /**
     * ```
     * List items if the variable is a list.
     * ```
     *
     * `repeated .com.kcl.api.Variable list_items = 4;`
     * @param values The listItems to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllListItems")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.Variable, ListItemsProxy>.plusAssign(values: kotlin.collections.Iterable<com.kcl.api.Spec.Variable>) {
      addAll(values)
    }
    /**
     * ```
     * List items if the variable is a list.
     * ```
     *
     * `repeated .com.kcl.api.Variable list_items = 4;`
     * @param index The index to set the value at.
     * @param value The listItems to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setListItems")
    public operator fun com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.Variable, ListItemsProxy>.set(index: kotlin.Int, value: com.kcl.api.Spec.Variable) {
      _builder.setListItems(index, value)
    }
    /**
     * ```
     * List items if the variable is a list.
     * ```
     *
     * `repeated .com.kcl.api.Variable list_items = 4;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearListItems")
    public fun com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.Variable, ListItemsProxy>.clear() {
      _builder.clearListItems()
    }


    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class DictEntriesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * ```
     * Dictionary entries if the variable is a dictionary.
     * ```
     *
     * `repeated .com.kcl.api.MapEntry dict_entries = 5;`
     */
     public val dictEntries: com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.MapEntry, DictEntriesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getDictEntriesList()
      )
    /**
     * ```
     * Dictionary entries if the variable is a dictionary.
     * ```
     *
     * `repeated .com.kcl.api.MapEntry dict_entries = 5;`
     * @param value The dictEntries to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addDictEntries")
    public fun com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.MapEntry, DictEntriesProxy>.add(value: com.kcl.api.Spec.MapEntry) {
      _builder.addDictEntries(value)
    }
    /**
     * ```
     * Dictionary entries if the variable is a dictionary.
     * ```
     *
     * `repeated .com.kcl.api.MapEntry dict_entries = 5;`
     * @param value The dictEntries to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignDictEntries")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.MapEntry, DictEntriesProxy>.plusAssign(value: com.kcl.api.Spec.MapEntry) {
      add(value)
    }
    /**
     * ```
     * Dictionary entries if the variable is a dictionary.
     * ```
     *
     * `repeated .com.kcl.api.MapEntry dict_entries = 5;`
     * @param values The dictEntries to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllDictEntries")
    public fun com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.MapEntry, DictEntriesProxy>.addAll(values: kotlin.collections.Iterable<com.kcl.api.Spec.MapEntry>) {
      _builder.addAllDictEntries(values)
    }
    /**
     * ```
     * Dictionary entries if the variable is a dictionary.
     * ```
     *
     * `repeated .com.kcl.api.MapEntry dict_entries = 5;`
     * @param values The dictEntries to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllDictEntries")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.MapEntry, DictEntriesProxy>.plusAssign(values: kotlin.collections.Iterable<com.kcl.api.Spec.MapEntry>) {
      addAll(values)
    }
    /**
     * ```
     * Dictionary entries if the variable is a dictionary.
     * ```
     *
     * `repeated .com.kcl.api.MapEntry dict_entries = 5;`
     * @param index The index to set the value at.
     * @param value The dictEntries to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setDictEntries")
    public operator fun com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.MapEntry, DictEntriesProxy>.set(index: kotlin.Int, value: com.kcl.api.Spec.MapEntry) {
      _builder.setDictEntries(index, value)
    }
    /**
     * ```
     * Dictionary entries if the variable is a dictionary.
     * ```
     *
     * `repeated .com.kcl.api.MapEntry dict_entries = 5;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearDictEntries")
    public fun com.google.protobuf.kotlin.DslList<com.kcl.api.Spec.MapEntry, DictEntriesProxy>.clear() {
      _builder.clearDictEntries()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.kcl.api.Spec.Variable.copy(block: `com.kcl.api`.VariableKt.Dsl.() -> kotlin.Unit): com.kcl.api.Spec.Variable =
  `com.kcl.api`.VariableKt.Dsl._create(this.toBuilder()).apply { block() }._build()

