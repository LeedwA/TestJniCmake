//
// Created by Administrator on 2018/8/18 0018.
//

#include "com_ldw_testjnicmake_JniUtils.h"

JNIEXPORT jstring JNICALL Java_com_ldw_testjnicmake_JniUtils_getJniString
  (JNIEnv *env, jclass jc){

       return (*env)->NewStringUTF(env,"xxxxxxxxxxxx");

  }

