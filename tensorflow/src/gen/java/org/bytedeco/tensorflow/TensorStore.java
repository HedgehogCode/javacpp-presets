// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// The tensor store remembers the tensors we choose to keep for the
// current run call. It is available to every op kernel.
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorStore extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TensorStore() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TensorStore(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorStore(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TensorStore position(long position) {
        return (TensorStore)super.position(position);
    }
    @Override public TensorStore getPointer(long i) {
        return new TensorStore((Pointer)this).offsetAddress(i);
    }

  public static class TensorAndKey extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public TensorAndKey() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public TensorAndKey(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public TensorAndKey(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public TensorAndKey position(long position) {
          return (TensorAndKey)super.position(position);
      }
      @Override public TensorAndKey getPointer(long i) {
          return new TensorAndKey((Pointer)this).offsetAddress(i);
      }
  
    public native @ByRef Tensor tensor(); public native TensorAndKey tensor(Tensor setter);
    public native @Cast("tensorflow::int64") long id(); public native TensorAndKey id(long setter);
    public native @StdString BytePointer device_name(); public native TensorAndKey device_name(BytePointer setter);

    public native @StdString BytePointer GetHandle(@StdString BytePointer tensor_name);
    public native @StdString String GetHandle(@StdString String tensor_name);
  }

  // Add the named tensor to the tensor store for this run.
  public native @ByVal Status AddTensor(@StdString BytePointer name, @Const @ByRef TensorAndKey tk);
  public native @ByVal Status AddTensor(@StdString String name, @Const @ByRef TensorAndKey tk);

  // Save the tensors in the tensor store of this run to the session.
  public native @ByVal Status SaveTensors(@Const @ByRef StringVector output_names,
                       SessionState session_state);

  // Returns true if no tensors have been added to this store.
  public native @Cast("bool") boolean empty();
}
