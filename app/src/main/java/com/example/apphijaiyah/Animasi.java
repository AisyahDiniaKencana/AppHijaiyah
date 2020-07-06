package com.example.apphijaiyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Animasi extends AppCompatActivity {
    VideoView videoAn;

    public static Intent getActIntent(Video video) {
        return new Intent(video, Animasi.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animasi);

        getSupportActionBar().setTitle("Animasi");
        getSupportActionBar().setSubtitle("Belajar membaca Huruf Hijaiyah");

        videoAn = (VideoView) findViewById(R.id.videoView1);
        //inisialisasi object videoView
        videoAn.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.animasi));
        //digunakan untuk mengidentifikasi resource seperti lokasi video
        videoAn.setMediaController(new MediaController(this));
        //menampilkan media controller video
        videoAn.start();
        //memulai video
    }
}