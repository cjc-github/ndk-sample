#cmake最低版本
cmake_minimum_required(VERSION 3.4.1)
add_library(
            #库名
             jni-lib
            #设置共享库
             SHARED
            #源文件
             jni.cpp )
