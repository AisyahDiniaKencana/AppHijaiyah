package com.example.apphijaiyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Upin extends AppCompatActivity {
    VideoView videoUp;

    public static Intent getActIntent(Video video) {
        return new Intent(video, Upin.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upin);

        getSupportActionBar().setTitle("Upin Ipin");
        getSupportActionBar().setSubtitle("Belajar membaca Huruf Hijaiyah");

        videoUp = (VideoView) findViewById(R.id.videoView3);
        //inisialisasi object videoView
        videoUp.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.upinipin));
        //digunakan untuk mengidentifikasi resource seperti lokasi video
        videoUp.setMediaController(new MediaController(this));
        //menampilkan media controller video
        videoUp.start();
        //memulai video
    }
}