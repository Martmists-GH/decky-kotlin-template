package example_plugin

import kpy.annotations.PyModuleHook
import kpy.wrappers.PyObjectT

@PyModuleHook
fun onLoad(module: PyObjectT) {
    println("Native extension loaded")
}
