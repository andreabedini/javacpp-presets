// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

        @Namespace("ngraph::pass") @Opaque @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class GetOutputElementElimination extends Pointer {
            /** Empty constructor. Calls {@code super((Pointer)null)}. */
            public GetOutputElementElimination() { super((Pointer)null); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public GetOutputElementElimination(Pointer p) { super(p); }
        }
