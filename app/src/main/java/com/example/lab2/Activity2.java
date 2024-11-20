package com.example.lab2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);

        // Пример обработки нажатий кнопок
        button1.setOnClickListener(v -> Toast.makeText(this, "Button 1 clicked", Toast.LENGTH_SHORT).show());
        button2.setOnClickListener(v -> Toast.makeText(this, "Button 2 clicked", Toast.LENGTH_SHORT).show());
        button3.setOnClickListener(v -> Toast.makeText(this, "Button 3 clicked", Toast.LENGTH_SHORT).show());
        button4.setOnClickListener(v -> Toast.makeText(this, "Button 4 clicked", Toast.LENGTH_SHORT).show());
        button5.setOnClickListener(v -> Toast.makeText(this, "Button 5 clicked", Toast.LENGTH_SHORT).show());
    }
}