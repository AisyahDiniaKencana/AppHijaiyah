package com.example.apphijaiyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class huruf extends AppCompatActivity {

    public static Intent getActIntent(MainActivity mainActivity) {
        return new Intent(mainActivity, huruf.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf);

        getSupportActionBar().setTitle("Huruf-Huruf Hijaiyah");
    }
}