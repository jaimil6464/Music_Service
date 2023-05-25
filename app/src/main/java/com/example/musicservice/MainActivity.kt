package com.example.musicservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.musicservice.Music_Service.Music_Service
import com.example.musicservice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnstart.setOnClickListener {

            startService(Intent(this,Music_Service::class.java))

        }

        binding.btnstop.setOnClickListener {

            stopService(Intent(this,Music_Service::class.java))
        }
    }
}