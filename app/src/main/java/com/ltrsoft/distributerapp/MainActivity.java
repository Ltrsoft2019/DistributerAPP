package com.ltrsoft.distributerapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.ltrsoft.distributerapp.fragment.NavigationDrawer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NavigationDrawer navigationDrawer = new NavigationDrawer();

        getSupportFragmentManager().beginTransaction().
                replace(R.id.main, navigationDrawer).commit();

    }
}