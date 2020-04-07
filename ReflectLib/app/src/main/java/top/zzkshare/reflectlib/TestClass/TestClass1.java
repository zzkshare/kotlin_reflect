package top.zzkshare.reflectlib.TestClass;

public class TestClass1 {
    public String mStr;
    public static String mStaticStr = "hello_reflect";
    private Float mPriFloat;
    private Integer mStaticPriInt = 1;

    public TestClass1() {
    }

    public TestClass1(String mStr, Float mPriFloat, Integer mStaticPriInt) {
        this.mStr = mStr;
        this.mPriFloat = mPriFloat;
        this.mStaticPriInt = mStaticPriInt;
    }

    public String getmStr() {
        return mStr;
    }

    public void setmStr(String mStr) {
        this.mStr = mStr;
    }

    public static String getmStaticStr() {
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
