package com.iot.plant;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        System.out.println("error finding");

        new Handler(Looper.getMainLooper()).postDelayed(() -> {

            startActivity(new Intent(MainActivity.this, MainActivity2.class));
            finish();
        }, 2000);
    }
}