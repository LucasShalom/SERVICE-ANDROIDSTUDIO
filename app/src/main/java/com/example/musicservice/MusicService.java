package com.example.musicservice;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class MusicService extends Service {
    static MediaPlayer mp;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mp=MediaPlayer.create(this, R.raw.song);
        mp.setLooping(true);
        mp.start();
        return START_NOT_STICKY;
    }
    @Override
    public void onDestroy() {
        mp.stop();
        super.onDestroy();
    }
}