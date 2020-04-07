package top.zzkshare.reflectlib.reflectUtil;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import top.zzkshare.reflectlib.TestClass.TestClass1;

public class JavaReflectMethod {

    //获取所有构造函数
    public void getAllConstructor(){
        TestClass1 testClass1 = new TestClass1();
        TestClass1 testClass1WithMember = new TestClass1("hello_world", 12.0f, 176);
        Class cls = testClass1.getClass();
        Log("className" +cls.getName());

        try{
            Constructor[] constructors = cls.getDeclaredConstructors();
            for (Constructor ctor : constructors){
                int mod = ctor.getModifiers();
                String strMod = Modifier.toString(mod)+" : ";
                // 获取参数类型
                Class[] paramTypes = ctor.getParameterTypes();
                for (Class param : paramTypes){
                    strMod += param.getName() + " ";
//                    Log(param.getName()+" ");
                }
                Log(strMod);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static final String TAG = "JavaReflectMethod";
    private static void Log(String log) {
//        android.util.Log.d(TAG, log);
        System.out.println(log);
    }
}
