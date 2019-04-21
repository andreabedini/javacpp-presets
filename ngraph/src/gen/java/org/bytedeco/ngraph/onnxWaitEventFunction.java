// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

@Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class onnxWaitEventFunction extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    onnxWaitEventFunction(Pointer p) { super(p); }
    protected onnxWaitEventFunction() { allocate(); }
    private native void allocate();
    public native @Cast("onnxStatus") int call(
    onnxEvent event);
}
