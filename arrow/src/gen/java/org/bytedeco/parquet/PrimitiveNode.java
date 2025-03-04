// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


// A type that is one of the primitive Parquet storage types. In addition to
// the other type metadata (name, repetition level, logical type), also has the
// physical storage type and their type-specific metadata (byte width, decimal
// parameters)
@Namespace("parquet::schema") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class PrimitiveNode extends Node {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PrimitiveNode(Pointer p) { super(p); }

  public static native @UniquePtr Node FromParquet(@Const Pointer opaque_element);

  // A field_id -1 (or any negative value) will be serialized as null in Thrift
  public static native @SharedPtr @ByVal Node Make(@StdString String name, Repetition.type repetition,
                               org.bytedeco.parquet.Type.type type,
                               ConvertedType.type converted_type/*=parquet::ConvertedType::NONE*/,
                               int length/*=-1*/, int precision/*=-1*/, int scale/*=-1*/,
                               int field_id/*=-1*/);
  public static native @SharedPtr @ByVal Node Make(@StdString String name, Repetition.type repetition,
                               org.bytedeco.parquet.Type.type type);
  public static native @SharedPtr @ByVal Node Make(@StdString BytePointer name, @Cast("parquet::Repetition::type") int repetition,
                               @Cast("parquet::Type::type") int type,
                               @Cast("parquet::ConvertedType::type") int converted_type/*=parquet::ConvertedType::NONE*/,
                               int length/*=-1*/, int precision/*=-1*/, int scale/*=-1*/,
                               int field_id/*=-1*/);
  public static native @SharedPtr @ByVal Node Make(@StdString BytePointer name, @Cast("parquet::Repetition::type") int repetition,
                               @Cast("parquet::Type::type") int type);

  // If no logical type, pass LogicalType::None() or nullptr
  // A field_id -1 (or any negative value) will be serialized as null in Thrift
  public static native @SharedPtr @ByVal Node Make(@StdString String name, Repetition.type repetition,
                               @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType logical_type,
                               org.bytedeco.parquet.Type.type primitive_type, int primitive_length/*=-1*/,
                               int field_id/*=-1*/);
  public static native @SharedPtr @ByVal Node Make(@StdString String name, Repetition.type repetition,
                               @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType logical_type,
                               org.bytedeco.parquet.Type.type primitive_type);
  public static native @SharedPtr @ByVal Node Make(@StdString BytePointer name, @Cast("parquet::Repetition::type") int repetition,
                               @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType logical_type,
                               @Cast("parquet::Type::type") int primitive_type, int primitive_length/*=-1*/,
                               int field_id/*=-1*/);
  public static native @SharedPtr @ByVal Node Make(@StdString BytePointer name, @Cast("parquet::Repetition::type") int repetition,
                               @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType logical_type,
                               @Cast("parquet::Type::type") int primitive_type);

  public native @Cast("bool") boolean Equals(@Const Node other);

  public native org.bytedeco.parquet.Type.type physical_type();

  public native @ByVal ColumnOrder column_order();

  public native void SetColumnOrder(@ByVal ColumnOrder column_order);

  public native int type_length();

  public native @Const @ByRef DecimalMetadata decimal_metadata();

  public native void ToParquet(Pointer element);
  public native void Visit(Visitor visitor);
  public native void VisitConst(ConstVisitor visitor);
}
