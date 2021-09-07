# include <jni.h>
# include <stdio.h>
extern "C"
{
    JNIEXPORT jstring JNICALL Java_com_test_jni1_MainActivity_getFromJNI(JNIEnv *env, jobject obj ){
        return env -> NewStringUTF("Hello i am from JNI!");
	}
}