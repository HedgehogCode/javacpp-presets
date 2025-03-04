// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.libfreenect2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libfreenect2.global.freenect2.*;


// #ifdef LIBFREENECT2_WITH_OPENGL_SUPPORT
/** Pipeline with OpenGL depth processing. */
@Namespace("libfreenect2") @NoOffset @Properties(inherit = org.bytedeco.libfreenect2.presets.freenect2.class)
public class OpenGLPacketPipeline extends PacketPipeline {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OpenGLPacketPipeline(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OpenGLPacketPipeline(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public OpenGLPacketPipeline position(long position) {
        return (OpenGLPacketPipeline)super.position(position);
    }
    @Override public OpenGLPacketPipeline getPointer(long i) {
        return new OpenGLPacketPipeline((Pointer)this).offsetAddress(i);
    }

  public OpenGLPacketPipeline(Pointer parent_opengl_context/*=0*/, @Cast("bool") boolean debug/*=false*/) { super((Pointer)null); allocate(parent_opengl_context, debug); }
  private native void allocate(Pointer parent_opengl_context/*=0*/, @Cast("bool") boolean debug/*=false*/);
  public OpenGLPacketPipeline() { super((Pointer)null); allocate(); }
  private native void allocate();
}
