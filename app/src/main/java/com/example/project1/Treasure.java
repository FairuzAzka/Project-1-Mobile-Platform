package com.example.project1;

import android.os.Bundle;
import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

/*KUCING TEKNO */

public class Treasure extends AppCompatActivity {

    VideoView videoView;
    //deklarasi objek

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treasure);
        getSupportActionBar().setTitle("Video Offline");

        videoView = (VideoView) findViewById(R.id.videoView);
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.rickroll));
        videoView.setMediaController(new MediaController(this));
    }
}