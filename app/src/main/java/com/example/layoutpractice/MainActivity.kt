package com.example.layoutpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.layoutpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            val firstname = binding.textView.text.toString()
            val lastname = binding.textView2.text.toString()
            val dob = binding.textView3.text.toString()
            val country = binding.textView4.text.toString()
            Log.d("MainActivity", "$firstname $lastname DOB is $dob and his country is $country")
        }
    }
}