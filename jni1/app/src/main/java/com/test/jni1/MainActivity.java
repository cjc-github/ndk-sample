package com.test.jni1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //导入
    static{
        System.loadLibrary("jni-lib");
    }
    //声明native函数
    public native String getFromJNI();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=findViewById(R.id.id1);
        //调用native函数
        tv.setText(getFromJNI());
    }
}