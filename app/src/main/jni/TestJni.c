//
// Created by Administrator on 2018/8/18 0018.
//

#include "com_ldw_testjnicmake_JniUtils.h"

#include <string.h>
#include <stdio.h>
#include <stdlib.h>

JNIEXPORT jstring JNICALL Java_com_ldw_testjnicmake_JniUtils_getJniString
  (JNIEnv *env, jclass jc){

       return (*env)->NewStringUTF(env,"你好的啊");
  }


JNIEXPORT void JNICALL Java_com_ldw_testjnicmake_JniUtils_accessJavaStringField
        (JNIEnv *env, jobject jobj){

    jclass  jcls = (*env)->GetObjectClass(env, jobj);

    jfieldID jfID = (*env) ->GetFieldID(env, jcls, "name", "Ljava/lang/String;");

    jstring  jstr = (*env) ->GetObjectField(env, jobj, jfID);

    char* cstr = (*env) ->GetStringUTFChars(env, jstr, JNI_FALSE);

    char text[30]  ="xxxxx" ;

    strcat(cstr, text);

    jstring   new_str = (*env) ->NewStringUTF(env, cstr);

    (*env) -> SetObjectField(env, jobj, jfID, new_str);





}