package com.example.layoutpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.layoutpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonAdd.setOnClickListener(this)

        binding.buttonSub.setOnClickListener(this)

        binding.buttonDiv.setOnClickListener(this)

        binding.buttonMult.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v == binding.buttonAdd){
            val number1 = binding.edNumber1.text.toString().toInt()
            val number2 = binding.edNumber2.text.toString().toInt()
            val res = number1 + number2
            binding.result.text = res.toString()
        }else if (v == binding.buttonSub){
            val number1 = binding.edNumber1.text.toString().toInt()
            val number2 = binding.edNumber2.text.toString().toInt()
            val res = number1 - number2
            binding.result.text = res.toString()
        }else if (v == binding.buttonDiv){
            val number1 = binding.edNumber1.text.toString().toInt()
            val number2 = binding.edNumber2.text.toString().toInt()
            val res = number1 / number2
            binding.result.text = res.toString()
        }else if (v == binding.buttonMult){
            val number1 = binding.edNumber1.text.toString().toInt()
            val number2 = binding.edNumber2.text.toString().toInt()
            val res = number1 * number2
            binding.result.text = res.toString()
        }
    }
}