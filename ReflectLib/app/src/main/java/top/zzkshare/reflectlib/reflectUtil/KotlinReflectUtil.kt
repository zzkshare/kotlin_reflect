package top.zzkshare.reflectlib.reflectUtil

import java.util.*
import kotlin.collections.ArrayList

object KotlinReflectUtil {
    public fun getInstanceByClass(name: String,vararg paramType: Class<*>,vararg param: Objects): Objects? {
        try {
            val cls = Class.forName(name).kotlin
            val ctor = cls.c
        }
    }
}