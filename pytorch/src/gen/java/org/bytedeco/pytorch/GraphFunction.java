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


@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class GraphFunction extends Function {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GraphFunction(Pointer p) { super(p); }

  // NOLINTNEXTLINE(cppcoreguidelines-pro-type-member-init)
  public GraphFunction(
        @ByVal QualifiedName name,
        @SharedPtr @ByVal Graph graph,
        @ByVal GraphFunctionCreator function_creator) { super((Pointer)null); allocate(name, graph, function_creator); }
  private native void allocate(
        @ByVal QualifiedName name,
        @SharedPtr @ByVal Graph graph,
        @ByVal GraphFunctionCreator function_creator);

  public native @Cast("bool") boolean isGraphFunction();

  public native void run(@ByRef IValueVector stack);

  public native @ByVal @Name("operator ()") IValue apply(@ByVal IValueVector stack, @Cast("const torch::jit::Kwargs*") @ByRef(nullValue = "torch::jit::Kwargs()") IValueIValueMap kwargs);
  public native @ByVal @Name("operator ()") IValue apply(@ByVal IValueVector stack);

  public native @SharedPtr @ByVal Graph graph();

  public native @SharedPtr @ByVal Graph optimized_graph();

  public native void clear_execution_info();

  public native @Const @ByRef QualifiedName qualname();

  public native @StdString BytePointer name();

  // if this isn't yet defined, run its method_creator function
  public native void ensure_defined();

  public native @Cast("size_t") long num_inputs();

  public native @ByRef Function setSchema(@ByVal FunctionSchema schema);

  public native @Const @ByRef FunctionSchema getSchema();

  public native @StdString BytePointer pretty_print_schema();

  public native @ByVal GraphExecutorState getDebugState();

  public native @Cast("bool") boolean is_optimized();

  public native void check_single_output();

  public native @ByRef GraphExecutor get_executor();
}
