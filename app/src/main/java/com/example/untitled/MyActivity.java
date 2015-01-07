package com.example.untitled;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;


public class MyActivity extends Activity {

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent intent = new Intent(this, SDCardListenSer.class);
        startService(intent);
        init();

    }


    private native void init();

    static {
        Log.d("onEvent", "load jni lib");
        System.loadLibrary("hello-jni");
    }


}
