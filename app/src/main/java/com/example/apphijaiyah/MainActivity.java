package com.example.apphijaiyah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button bHuruf;
    private Button bVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Assalamualaikum");

        bHuruf = (Button) findViewById(R.id.btnHuruf);
        bVideo = (Button) findViewById(R.id.btnVideo);

        bHuruf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(huruf.getActIntent(MainActivity.this));
            }
        });
        bVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(Video.getActIntent(MainActivity.this));
            }
        });
    }
}