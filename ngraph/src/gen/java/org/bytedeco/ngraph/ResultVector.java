// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

    /** \brief Zero or more nodes. */
    @Namespace("ngraph") @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class ResultVector extends NgraphResultVector {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public ResultVector(Pointer p) { super(p); }
    
        public ResultVector(@Cast("size_t") long size) { super((Pointer)null); allocate(size); }
        private native void allocate(@Cast("size_t") long size);

        public ResultVector(@Const @ByRef NgraphResultVector nodes) { super((Pointer)null); allocate(nodes); }
        private native void allocate(@Const @ByRef NgraphResultVector nodes);

        public ResultVector(@Const @ByRef ResultVector nodes) { super((Pointer)null); allocate(nodes); }
        private native void allocate(@Const @ByRef ResultVector nodes);

        public native @ByRef @Name("operator =") ResultVector put(@Const @ByRef ResultVector arg0);

        public ResultVector() { super((Pointer)null); allocate(); }
        private native void allocate();
    }
