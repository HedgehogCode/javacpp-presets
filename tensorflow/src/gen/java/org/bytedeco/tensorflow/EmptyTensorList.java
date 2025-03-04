// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** \defgroup list_ops List Ops
 *  \{
 <p>
 *  Creates and returns an empty tensor list.
 * 
 *  All list elements must be tensors of dtype element_dtype and shape compatible
 *  with element_shape.
 * 
 *  handle: an empty tensor list.
 *  element_dtype: the type of elements in the list.
 *  element_shape: a shape compatible with that of elements in the list.
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The handle tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class EmptyTensorList extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EmptyTensorList(Pointer p) { super(p); }

  public EmptyTensorList(@Const @ByRef Scope scope, @ByVal Input element_shape, @ByVal Input max_num_elements, @Cast("tensorflow::DataType") int element_dtype) { super((Pointer)null); allocate(scope, element_shape, max_num_elements, element_dtype); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input element_shape, @ByVal Input max_num_elements, @Cast("tensorflow::DataType") int element_dtype);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native EmptyTensorList operation(Operation setter);
  public native @ByRef Output handle(); public native EmptyTensorList handle(Output setter);
}
