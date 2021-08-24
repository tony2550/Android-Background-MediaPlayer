package com.com.clone_spotify.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.com.clone_spotify.R;
import com.com.clone_spotify.exoplayer.MusicService;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity2";
    private ImageView ivPlayPause;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        
        
        init();
        initLr();
                
    }
    
    private void initLr() {
        ivPlayPause.setOnClickListener(v -> {
            Intent intent = new Intent(this, MusicService.class);

            startService(intent);
            Log.d(TAG, "initLr: startService()");
        });
    }
    
    private void init() {
        ivPlayPause = findViewById(R.id.ivPlayPause);
    }
    
}