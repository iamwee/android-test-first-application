package com.example.zeon.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.zeon.myapplication.obj.Person;

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
                .firstname("Monkey")
                .midname("D")
                .lastname("Luffy")
                .age(21)
                .address("Monkey-d-luffy@hotmail.com")
                .phone("0812345678")
                .build();

        Person person1 = new Person.Builder().create();
    }

    private void initInstances() {
        tvHello = (TextView) findViewById(R.id.tv_hello);
        tvHello.setText("Test Sharing Project on Github");
    }
}
