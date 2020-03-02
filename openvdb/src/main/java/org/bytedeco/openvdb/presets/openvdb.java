package org.bytedeco.openvdb.presets;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;
import org.bytedeco.javacpp.tools.*;

@Properties(
  value = @Platform(
    include = "openvdb/openvdb.h",
    link = "openvdb",
    define = "SHARED_PTR_NAMESPACE std",
    compiler = "cpp11"
  ),
  target = "org.bytedeco.openvdb",
  global = "org.bytedeco.openvdb.global.openvdb"
)
public class openvdb implements InfoMapper {
    static { Loader.checkVersion("org.bytedeco", "openvdb"); }

    public void map(InfoMap infoMap) {

    }
}
