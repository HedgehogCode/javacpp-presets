// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// NOLINTNEXTLINE(cppcoreguidelines-pro-type-member-init)
@Namespace("torch::optim") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class LBFGSParamState extends OptimizerCloneableLBFGSParamState {
    static { Loader.load(); }
    /** Default native constructor. */
    public LBFGSParamState() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LBFGSParamState(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LBFGSParamState(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public LBFGSParamState position(long position) {
        return (LBFGSParamState)super.position(position);
    }
    @Override public LBFGSParamState getPointer(long i) {
        return new LBFGSParamState((Pointer)this).offsetAddress(i);
    }

  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer func_evals();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer n_iter();
  public native @ByRef @NoException(true) DoublePointer t();
  public native @ByRef @NoException(true) DoublePointer prev_loss();
  public native @ByRef @NoException(true) Tensor d();
  public native @ByRef @NoException(true) Tensor H_diag();
  public native @ByRef @NoException(true) Tensor prev_flat_grad();
  public native @ByRef @NoException(true) TensorDeque old_dirs();
  public native @ByRef @NoException(true) TensorDeque old_stps();
  public native @ByRef @NoException(true) TensorDeque ro();
  public native @ByRef @NoException(true) TensorVectorOptional al();
  
  
  
}
