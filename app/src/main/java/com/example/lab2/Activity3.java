package com.example.lab2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Activity3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        Button bottomButton = findViewById(R.id.bottomButton);
        bottomButton.setBackgroundColor(Color.parseColor("#FFFFFF"));
        bottomButton.setOnClickListener(v -> {
            bottomButton.setBackgroundColor(Color.parseColor("#90EE90")); // светло-зеленый
        });
    }
}