package com.g_emall.simpledraweeviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {

    private SimpleDraweeView simpleDraweeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //初始化Fresco
        Fresco.initialize(this);

        setContentView(R.layout.activity_main);

        simpleDraweeView = (SimpleDraweeView) findViewById(R.id.simpleDraweeView);
    }
}
