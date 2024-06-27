package com.iot.plant;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button startButton = findViewById(R.id.startButton);
//        getSupportActionBar().hide();

        startButton.setOnClickListener(view -> { // Use a lambda expression for conciseness
            Toast toast = Toast.makeText(MainActivity2.this, "Started", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.BOTTOM | Gravity.START, 0, 0); // Use Gravity.START for better consistency across locales
            toast.show();
        });
    }
}
