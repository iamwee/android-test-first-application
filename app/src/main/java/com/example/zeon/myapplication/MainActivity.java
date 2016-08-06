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
        int i = 0;
        int j = 1;
        for(i = 0; i <= j; i++){
            j = 3;
        }
    }

    private void initInstances() {
        tvHello = (TextView) findViewById(R.id.tv_hello);
        tvHello.setText("Test Sharing Project on Github");
    }
}
