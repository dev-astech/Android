package com.example.addtwonumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.addtwonumber.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnAdd.setOnClickListener {
            val result = binding.etNumber1.text.toString().trim().toInt() + binding.etNumber2.text.toString().trim().toInt()
            binding.tvResult.text = "$result"
        }
    }
}