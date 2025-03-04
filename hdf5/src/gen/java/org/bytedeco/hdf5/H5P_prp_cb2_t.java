// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;

/** <!-- [H5P_prp_cb1_t_snip] -->
 <p>
 *  <!-- [H5P_prp_cb2_t_snip] -->
/**
 * \brief Callback function for H5Pregister2(),H5Pregister1(),H5Pinsert2(),H5Pinsert1()
 *
 * \plist_id{prop_id}
 * @param name [in]  The name of the property
 * @param size [in]  The size of the property in bytes
 * @param value [in] The value for the property
 * @return \herr_t
 *
 * \details The H5P_prp_cb2_t() describes the parameters used by the
 *          property set ,copy and delete callback functions.
 */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5P_prp_cb2_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    H5P_prp_cb2_t(Pointer p) { super(p); }
    protected H5P_prp_cb2_t() { allocate(); }
    private native void allocate();
    public native @Cast("herr_t") int call(@Cast("hid_t") long prop_id, @Cast("const char*") BytePointer name, @Cast("size_t") long size, Pointer value);
}
