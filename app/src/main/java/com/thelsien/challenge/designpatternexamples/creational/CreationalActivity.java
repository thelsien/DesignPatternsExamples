package com.thelsien.challenge.designpatternexamples.creational;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.thelsien.challenge.designpatternexamples.R;
import com.thelsien.challenge.designpatternexamples.creational.singleton.SingletonActivity;

public class CreationalActivity extends AppCompatActivity {

    Button singleton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creational);

        singleton = findViewById(R.id.btn_singleton);

        singleton.setOnClickListener(clickedView -> {
            Intent intent = new Intent(CreationalActivity.this, SingletonActivity.class);
            startActivity(intent);
        });
    }
}
