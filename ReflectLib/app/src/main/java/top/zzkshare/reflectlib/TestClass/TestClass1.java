package top.zzkshare.reflectlib.TestClass;

import android.util.Log;

import top.zzkshare.reflectlib.Util.LogUtil;

public class TestClass1 {
    public String mStr;
    public static String mStaticStr = "hello_reflect";
    private Float mPriFloat;
    private static Integer mStaticPriInt = 176971;

    public TestClass1() {
    }

    public TestClass1(String mStr, Float mPriFloat, Integer mStaticPriInt) {
        this.mStr = mStr;
        this.mPriFloat = mPriFloat;
    }

    private TestClass1(String mStr) {
        this.mStr = mStr;
        LogUtil.log("testClass private constructor with param: "+mStr);
    }

    private Integer thisIsAPersonalMethod(String mStr) {
        LogUtil.log(mStr);
        LogUtil.log("testClass private method with return: "+mStaticPriInt);
        return mStaticPriInt;
    }

    public String getmStr() {
        return mStr;
    }

    public void setmStr(String mStr) {
        this.mStr = mStr;
    }

    private static String getmStaticStr() {
        return mStaticStr;
    }

    public static void setmStaticStr(String mStaticStr) {
        TestClass1.mStaticStr = mStaticStr;
    }

    public Float getmPriFloat() {
        return mPriFloat;
    }

    public void setmPriFloat(Float mPriFloat) {
        this.mPriFloat = mPriFloat;
    }

    public Integer getmStaticPriInt() {
        return mStaticPriInt;
    }

    public void setmStaticPriInt(Integer mStaticPriInt) {
        this.mStaticPriInt = mStaticPriInt;
    }
}
