package com.ldw.testjnicmake;

/**
 * Created by lidingwei on 2018/8/18 0018.
 */
public class JniUtils {

    static {
        System.loadLibrary("native-qqq");
    }

    public static native String getJniString();
}
