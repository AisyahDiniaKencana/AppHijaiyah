package com.example.apphijaiyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Anak extends AppCompatActivity {
    VideoView videoAnk;

    public static Intent getActIntent(Video video) {
        return new Intent(video, Anak.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anak);

        getSupportActionBar().setTitle("Lagu Anak-Anak");
        getSupportActionBar().setSubtitle("Belajar membaca Huruf Hijaiyah");

        videoAnk = (VideoView) findViewById(R.id.videoView2);
        //inisialisasi object videoView
        videoAnk.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.laguanakanak));
        //digunakan untuk mengidentifikasi resource seperti lokasi video
        videoAnk.setMediaController(new MediaController(this));
        //menampilkan media controller video
        videoAnk.start();
        //memulai video
    }
}