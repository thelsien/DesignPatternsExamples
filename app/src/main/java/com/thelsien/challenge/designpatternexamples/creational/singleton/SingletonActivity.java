package com.thelsien.challenge.designpatternexamples.creational.singleton;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.thelsien.challenge.designpatternexamples.R;

public class SingletonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton);

        Button showButton = findViewById(R.id.btn_get_description);
        Button setButton = findViewById(R.id.btn_set_description);
        TextView descriptionTextView = findViewById(R.id.tv_description);
        EditText descriptionEditText = findViewById(R.id.et_description);

        setButton.setOnClickListener(clickedView -> {
            String desc = descriptionEditText.getText().toString();
            SammichSingleton.getInstance().setSammichDescription(desc);
        });

        showButton.setOnClickListener(clickedView ->
                descriptionTextView.setText(SammichSingleton.getInstance().getSammichDescription())
        );
    }
}
