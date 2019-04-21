// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;


            @Namespace("ngraph::runtime::cpu") @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class CPU_Executable extends Executable {
                static { Loader.load(); }
                /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
                public CPU_Executable(Pointer p) { super(p); }
            
                public CPU_Executable(@SharedPtr Function func,
                                               @ByRef PassConfig pass_config,
                                               @Cast("bool") boolean performance_counters_enabled) { super((Pointer)null); allocate(func, pass_config, performance_counters_enabled); }
                private native void allocate(@SharedPtr Function func,
                                               @ByRef PassConfig pass_config,
                                               @Cast("bool") boolean performance_counters_enabled);
                public native @Cast("bool") boolean call(@Const @ByRef NgraphTensorVector outputs,
                                          @Const @ByRef NgraphTensorVector inputs);

                public native @SharedPtr CPU_CallFrame get_call_frame();

                public native @StdVector PerformanceCounter get_performance_data();
            }
