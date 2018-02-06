package com.thelsien.challenge.designpatternexamples;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.thelsien.challenge.designpatternexamples.behavioral.BehavioralActivity;
import com.thelsien.challenge.designpatternexamples.creational.CreationalActivity;
import com.thelsien.challenge.designpatternexamples.structural.StructuralActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button constuctional = findViewById(R.id.btn_constructional);
        Button structural = findViewById(R.id.btn_structural);
        Button behavioral = findViewById(R.id.btn_behavioral);

        constuctional.setOnClickListener(clickedView -> {
            Intent intent = new Intent(MainActivity.this, CreationalActivity.class);
            startActivity(intent);
        });

        structural.setOnClickListener(clickedView -> {
            Intent intent = new Intent(MainActivity.this, StructuralActivity.class);
            startActivity(intent);
        });

        behavioral.setOnClickListener(clickedView -> {
            Intent intent = new Intent(MainActivity.this, BehavioralActivity.class);
            startActivity(intent);
        });
    }
}
