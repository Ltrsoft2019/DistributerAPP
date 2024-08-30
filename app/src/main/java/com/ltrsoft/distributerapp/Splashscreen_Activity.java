package com.ltrsoft.distributerapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.window.SplashScreen;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Splashscreen_Activity extends AppCompatActivity {

    private static final long SPLASH_DURATION = 3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.splashscreen_activity);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splashscreen_Activity.this,
                        MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_DURATION);

    }
}