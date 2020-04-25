package top.zzkshare.reflectlib.reflectUtil;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;

import top.zzkshare.reflectlib.TestClass.TestClass1;
import top.zzkshare.reflectlib.Util.LogUtil;

public class JavaReflectMethod {

    public void getAllConstructor(){
        TestClass1 testClass1 = new TestClass1();
        TestClass1 testClass1WithMember = new TestClass1("hello_world", 12.0f, 176);
        Class cls = testClass1.getClass();
        LogUtil.log("className " +cls.getName());

        try{
            Constructor[] constructors = cls.getDeclaredConstructors(); //  获取所有构造方法(仅获取public方法使用getConstructors)
            for (Constructor ctor : constructors){
                int mod = ctor.getModifiers();
                String strMod = Modifier.toString(mod)+" : ";
                // 获取参数类型
                Class[] paramTypes = ctor.getParameterTypes();
                for (Class param : paramTypes){
                    strMod += param.getName() + " ";
//                    Log(param.getName()+" ");
                }
                LogUtil.log("获取所有构造函数" + strMod);
                Proxy.newProxyInstance()
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void evalConstructor() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class reflectTestClass1 = Class.forName("top.zzkshare.reflectlib.TestClass.TestClass1");

        // 获取指定构造函数
        Class[] param = {String.class};
        Constructor test1Constructor = reflectTestClass1.getDeclaredConstructor(param);
        test1Constructor.setAccessible(true);
        Object obj = test1Constructor.newInstance("first reflect");

        //  调用私有方法
        Class[] methodParam = {String.class};
        Method method = reflectTestClass1.getDeclaredMethod("thisIsAPersonalMethod", methodParam);
        method.setAccessible(true);
        Object result = method.invoke(obj, "hello private method");
        LogUtil.log("get result: "+ result.toString());

        // 静态私有方法


    }

    private static final String TAG = "JavaReflectMethod";
//    private static void Log(String log) {
////        android.util.Log.d(TAG, log);
//        System.out.println(log);
//    }
}
