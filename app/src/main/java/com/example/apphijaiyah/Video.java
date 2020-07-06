package com.example.apphijaiyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import java.util.ArrayList;

public class Video extends AppCompatActivity {
    private Button bAnimasi;
    private Button bAnak;
    private Button bUpin;
//VideoView videoView;
//ListView listView;
//ArrayList<String> videoList;
//ArrayAdapter adapter;
//    MediaController media_Controller;
//    DisplayMetrics dm;
//    VideoView videoViewMe;
//    TextView txtJudul;
//    private Object View;


    public static Intent getActIntent(MainActivity mainActivity) {
        return new Intent(mainActivity, Video.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        getSupportActionBar().setTitle("Video");

        bAnimasi = (Button) findViewById(R.id.btn1);
        bAnak = (Button) findViewById(R.id.btn2);
        bUpin = (Button) findViewById(R.id.btn3);

        bAnimasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(Animasi.getActIntent(Video.this));
            }
        });
        bAnak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(Anak.getActIntent(Video.this));
            }
        });
        bUpin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(Upin.getActIntent(Video.this));
            }
        });

//        //view
//        videoViewMe = (VideoView) findViewById(R.id.videoView);
//        txtJudul = (TextView) findViewById(R.id.txtTema);
//
//        //inisialisasi
//        media_Controller = new MediaController(this);
//        dm = new DisplayMetrics();
//
//        //ukuran layar
//        this.getWindowManager().getDefaultDisplay().getMetrics(dm);
//        int height = dm.heightPixels;
//        int widht = dm.widthPixels;
//
//        //lebar dan tinggi view
//        videoViewMe.setMinimumWidth(widht);
//        videoViewMe.setMinimumHeight(height);
//
//        //kontrol video
//        videoViewMe.setMediaController(media_Controller);
//
//        private void muatVideo(String video, String animasi) {
//            // kasih judul
//            txtJudul.setText(video);
//
//            // ambil video
//            videoViewMe.setVideoPath("android.resource://"+getPackageName()+"/raw/"+R.raw.animasi);
//
//            // mulai
//            videoViewMe.start();
//        }
////
//        public void video1(View view) {
//            muatVideo("Trik Memasukkan Benang ke Jarum", "jarum");
//        }
//        public void video2(View view) {
//            muatVideo("Kucing Mau Lompat", "kucing_lompat");
//        }
//        public void video3(View view) {
//            muatVideo("Hypnotism Tata Surya", "tata_surya");
//        }

//        videoView = (VideoView) findViewById(R.id.videoView);
//        listView = (ListView) findViewById(R.id.listView);
//
//        videoList = new ArrayList<>();
//        videoList.add("Animasi");
//        videoList.add("Lagu Anak-Anak");
//        videoList.add("Upin Ipin");
//
//        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, videoList);
//        listView.setAdapter(adapter);
//
//        listView.setOnClickListener(new AdapterView.OnClickListener() {
//            @Override
//            public void onClick(AdapterView<?> parent, View view) {
//                switch (position){
//                    case 0:
//                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.animasi));
//                        break;
//                    case 1:
//                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.laguanakanak));
//                        break;
//                    case 2:
//                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.upinipin));
//                        break;
//                    default:
//                        break;
//                }
//                videoView.setMediaController(new MediaController(Video.this));
//                videoView.requestFocus();
//                videoView.start();
//            }
//        });
    }
}
