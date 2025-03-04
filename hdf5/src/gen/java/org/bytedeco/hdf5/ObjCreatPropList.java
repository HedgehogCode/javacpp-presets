// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/** \class ObjCreatPropList
    \brief Class ObjCreatPropList inherits from PropList and provides
    wrappers for the HDF5 object create property list.
*/
//  Inheritance: PropList -> IdComponent
@Namespace("H5") @NoOffset @Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class ObjCreatPropList extends PropList {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ObjCreatPropList(Pointer p) { super(p); }

    /**\brief Default object creation property list. */
    @MemberGetter public static native @Const @ByRef ObjCreatPropList DEFAULT();

    // Creates a object creation property list.
    public ObjCreatPropList() { super((Pointer)null); allocate(); }
    private native void allocate();

    // Sets attribute storage phase change thresholds.
    public native void setAttrPhaseChange(@Cast("unsigned") int max_compact/*=8*/, @Cast("unsigned") int min_dense/*=6*/);
    public native void setAttrPhaseChange();

    // Gets attribute storage phase change thresholds.
    public native void getAttrPhaseChange(@Cast("unsigned*") @ByRef IntPointer max_compact, @Cast("unsigned*") @ByRef IntPointer min_dense);
    public native void getAttrPhaseChange(@Cast("unsigned*") @ByRef IntBuffer max_compact, @Cast("unsigned*") @ByRef IntBuffer min_dense);
    public native void getAttrPhaseChange(@Cast("unsigned*") @ByRef int[] max_compact, @Cast("unsigned*") @ByRef int[] min_dense);

    // Sets tracking and indexing of attribute creation order.
    public native void setAttrCrtOrder(@Cast("unsigned") int crt_order_flags);

    // Gets tracking and indexing settings for attribute creation order.
    public native @Cast("unsigned") int getAttrCrtOrder();

    /**\brief Returns this class name. */
    public native @StdString BytePointer fromClass();

    // Copy constructor: same as the original ObjCreatPropList.
    public ObjCreatPropList(@Const @ByRef ObjCreatPropList original) { super((Pointer)null); allocate(original); }
    private native void allocate(@Const @ByRef ObjCreatPropList original);

    // Creates a copy of an existing object creation property list
    // using the property list id.
    public ObjCreatPropList(@Cast("const hid_t") long plist_id) { super((Pointer)null); allocate(plist_id); }
    private native void allocate(@Cast("const hid_t") long plist_id);

    // Noop destructor

// #ifndef DOXYGEN_SHOULD_SKIP_THIS

    // Deletes the global constant, should only be used by the library
    public static native void deleteConstants();

}
