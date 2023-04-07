package com.example.foodorderapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.foodorderapplication.R;

public class IntroActivity extends AppCompatActivity {
    private ConstraintLayout startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        startButton= (ConstraintLayout) findViewById(R.id.startButton);

        startButton.setOnClickListener(view -> {
            Intent intent=new Intent(IntroActivity.this,MainActivity.class);
            startActivity(intent);
        });
    }
}