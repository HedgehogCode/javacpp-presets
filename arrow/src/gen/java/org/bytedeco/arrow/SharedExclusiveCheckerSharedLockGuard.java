// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Name("arrow::io::internal::SharedLockGuard<arrow::io::internal::SharedExclusiveChecker>") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class SharedExclusiveCheckerSharedLockGuard extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SharedExclusiveCheckerSharedLockGuard(Pointer p) { super(p); }

  public SharedExclusiveCheckerSharedLockGuard(SharedExclusiveChecker lock) { super((Pointer)null); allocate(lock); }
  private native void allocate(SharedExclusiveChecker lock);
}
