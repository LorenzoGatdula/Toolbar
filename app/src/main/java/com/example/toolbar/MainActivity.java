package com.example.toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("lCycle", "onCreate() is called...");

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("lCycle", "onStart() is called...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("lCycle", "onResume() is called...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("lCycle", "onPause() is called...");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("lCycle", "onStop() is called...");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("lCycle", "onDestroy() is called...");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("lCycle", "onRestart() is called...");
    }
}