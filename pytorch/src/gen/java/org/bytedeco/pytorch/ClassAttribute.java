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


// This structure represents all notional booking entities in a class attribute: name, kind (see: AttributeKind), and type (see: TypePtr).
// Note: This structure does not represent the value of the attribute.
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ClassAttribute extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ClassAttribute(Pointer p) { super(p); }

  public ClassAttribute(AttributeKind kind,
    @SharedPtr @ByVal Type attributeType,
    @StdString BytePointer attributeName) { super((Pointer)null); allocate(kind, attributeType, attributeName); }
  private native void allocate(AttributeKind kind,
    @SharedPtr @ByVal Type attributeType,
    @StdString BytePointer attributeName);
  public ClassAttribute(@Cast("c10::AttributeKind") int kind,
    @SharedPtr @ByVal Type attributeType,
    @StdString String attributeName) { super((Pointer)null); allocate(kind, attributeType, attributeName); }
  private native void allocate(@Cast("c10::AttributeKind") int kind,
    @SharedPtr @ByVal Type attributeType,
    @StdString String attributeName);

  public native AttributeKind getKind();

  public native @SharedPtr @ByVal Type getType();

  public native @StdString BytePointer getName();
}
