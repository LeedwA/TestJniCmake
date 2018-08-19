package com.ldw.testjnicmake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);

        tv.setText(JniUtils.getJniString());

        JniUtils jniUtils = new JniUtils();

        Log.d(TAG, "前: " + jniUtils.name);

        jniUtils.accessJavaStringField();

        Log.d(TAG, "后: " + jniUtils.name);

    }


}
