package com.example.musicservice.Music_Service

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import com.example.musicservice.R

class Music_Service:Service() {
    lateinit var MP: MediaPlayer
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        MP=MediaPlayer.create(this, R.raw.music1)
        MP.isLooping=true
        MP.start()


            return START_STICKY

    }
    override fun onDestroy() {
        super.onDestroy()
        MP.stop()
    }
}