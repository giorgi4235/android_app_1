package com.example.homework

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homework.databinding.ActivityCounterBinding

class CounterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCounterBinding
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Initialize View Binding
        binding = ActivityCounterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Get email from intent
        val email = intent.getStringExtra("email")
        binding.userTextView.text = email ?: "Guest"

        // Set up click listener for counter button
        binding.nextButton.setOnClickListener {
            counter--
            binding.counterTextView.text = counter.toString()
        }
    }
}
