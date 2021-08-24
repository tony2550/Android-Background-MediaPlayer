package com.com.clone_spotify.exoplayer;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

import com.com.clone_spotify.R;

public class MusicService extends Service implements MediaPlayer.OnPreparedListener {

    private static final String ACTION_PLAY = "com.example.action.PLAY";
    private static final String TAG = "MusicService";
    MediaPlayer mediaPlayer = null;

    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG, "onBind: onBind()");
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: onCreate()");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand: 실행");
        // mp3 시작 코드
        mediaPlayer = MediaPlayer.create(this, R.raw.keane);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onPrepared(MediaPlayer mediaPlayer) {
        Log.d(TAG, "onPrepared: 실행");
    }
    
    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy: 실행");
        // mp3 음악 중지 코드
        super.onDestroy();
        mediaPlayer.stop();
    }
}
