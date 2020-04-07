package top.zzkshare.reflectlib

import org.junit.Test

import org.junit.Assert.*
import top.zzkshare.reflectlib.reflectUtil.JavaReflectMethod

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        JavaReflectMethod().getAllConstructor()
        assertEquals(4, 2 + 2)
    }
}
