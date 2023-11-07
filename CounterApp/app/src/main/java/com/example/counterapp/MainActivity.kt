package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.counterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        var count = 0
        binding.btnCount.setOnClickListener{
            count++
            binding.tvCount.text = "$count"
        }
        binding.btnReset.setOnClickListener {
            count = 0
            binding.tvCount.text = "$count"
        }
    }
}