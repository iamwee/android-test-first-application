package com.example.zeon.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView tvHello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        initInstances();
    }

    private void init() {

    }

    private void initInstances() {
        tvHello = (TextView) findViewById(R.id.tv_hello);
        tvHello.setText("Test Sharing Project on Github");
    }
}
