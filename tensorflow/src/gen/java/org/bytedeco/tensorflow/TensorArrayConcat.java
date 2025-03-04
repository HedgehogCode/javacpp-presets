// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Concat the elements from the TensorArray into value {@code value}.
 * 
 *  Takes {@code T} elements of shapes
 * 
 *    <pre>{@code
 *    (n0 x d0 x d1 x ...), (n1 x d0 x d1 x ...), ..., (n(T-1) x d0 x d1 x ...)
 *    }</pre>
 * 
 *  and concatenates them into a Tensor of shape:
 * 
 *    <pre>{@code (n0 + n1 + ... + n(T-1) x d0 x d1 x ...)}</pre>
 * 
 *  All elements must have the same shape (excepting the first dimension).
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * handle: The handle to a TensorArray.
 *  * flow_in: A float scalar that enforces proper chaining of operations.
 *  * dtype: The type of the elem that is returned.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * element_shape_except0: The expected shape of an element, if known,
 *  excluding the first dimension. Used to validate the shapes of
 *  TensorArray elements. If this shape is not fully specified, concatenating
 *  zero-size TensorArrays is an error.
 * 
 *  Returns:
 *  * {@code Output} value: All of the elements in the TensorArray, concatenated along the first
 *  axis.
 *  * {@code Output} lengths: A vector of the row sizes of the original T elements in the
 *  value output.  In the example above, this would be the values:
 *  {@code (n1, n2, ..., n(T-1))}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorArrayConcat extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorArrayConcat(Pointer p) { super(p); }

  /** Optional attribute setters for TensorArrayConcat */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
      @Override public Attrs getPointer(long i) {
          return new Attrs((Pointer)this).offsetAddress(i);
      }
  
    /** The expected shape of an element, if known,
     *  excluding the first dimension. Used to validate the shapes of
     *  TensorArray elements. If this shape is not fully specified, concatenating
     *  zero-size TensorArrays is an error.
     * 
     *  Defaults to <unknown> */
    public native @ByVal Attrs ElementShapeExcept0(@ByVal PartialTensorShape x);

    public native @ByRef PartialTensorShape element_shape_except0_(); public native Attrs element_shape_except0_(PartialTensorShape setter);
  }
  public TensorArrayConcat(@Const @ByRef Scope scope, @ByVal Input handle,
                    @ByVal Input flow_in, @Cast("tensorflow::DataType") int dtype) { super((Pointer)null); allocate(scope, handle, flow_in, dtype); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input handle,
                    @ByVal Input flow_in, @Cast("tensorflow::DataType") int dtype);
  public TensorArrayConcat(@Const @ByRef Scope scope, @ByVal Input handle,
                    @ByVal Input flow_in, @Cast("tensorflow::DataType") int dtype, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, handle, flow_in, dtype, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input handle,
                    @ByVal Input flow_in, @Cast("tensorflow::DataType") int dtype, @Const @ByRef Attrs attrs);

  public static native @ByVal Attrs ElementShapeExcept0(@ByVal PartialTensorShape x);

  public native @ByRef Operation operation(); public native TensorArrayConcat operation(Operation setter);
  public native @ByRef Output value(); public native TensorArrayConcat value(Output setter);
  public native @ByRef Output lengths(); public native TensorArrayConcat lengths(Output setter);
}
