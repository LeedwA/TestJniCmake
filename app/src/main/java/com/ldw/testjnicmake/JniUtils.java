package com.ldw.testjnicmake;

import android.content.res.AssetManager;

import javax.xml.transform.sax.SAXTransformerFactory;

/**
 * Created by lidingwei on 2018/8/18 0018.
 *  右键点击 extraLtools -> javah -jni 会在jni文件夹生成头文件.h  （这里跟配置extraltools 有关系）
 */
public class JniUtils {

    // 使用C语言修改java字段
    public String name = "zeno" ;

    static {
        System.loadLibrary("JniDemo");
    }

    public static native String getJniString();

    public native void accessJavaStringField() ;

}
