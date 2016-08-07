package com.example.zeon.myapplication;

import android.support.v4.view.GravityCompat;
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
        Person person = new Person.Builder()
                .firstName("Hello")
                .lastName("World")
                .address("12345 Bangkok")
                .eMail("examples@hotmail.com")
                .numberPhone("0812345678")
                .age(1)
                .build();
    }

    private void initInstances() {
        tvHello = (TextView) findViewById(R.id.tv_hello);
        tvHello.setText("Test Sharing Project on Github");
    }
}
