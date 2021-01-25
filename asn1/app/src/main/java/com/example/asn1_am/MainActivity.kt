package com.example.asn1_am

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.asn1_am.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.

        val toastButton: Button = findViewById(R.id.toast_button)
        toastButton.setOnClickListener { makeToast() }

        val countUpButton: Button = findViewById(R.id.plus_button)
        countUpButton.setOnClickListener { countUp() }

        val countDownButton: Button = findViewById(R.id.minus_button)
        countDownButton.setOnClickListener { countDown() }

    }

    private fun makeToast(){
        val counted: TextView = findViewById(R.id.countedTo)
        val currentCount = counted.toString()
        Toast.makeText(this, currentCount, Toast.LENGTH_SHORT).show()
    }

    private  fun countUp(){
        val counted: TextView = findViewById(R.id.countedTo)
        val countedUp = counted.toString() + 1
        counted.text = countedUp
    }

    private  fun countDown(){
        val counted: TextView = findViewById(R.id.countedTo)
        val countedDown = counted.toString()
        counted.text = countedDown
    }

}