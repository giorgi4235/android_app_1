package com.example.homework

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.homework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Initialize View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up click listeners using binding
        binding.okayButton.setOnClickListener {
            val email = binding.emailEditText.text.toString()
            if (email.isNotEmpty()) {
                Toast.makeText(this, "Welcome back, $email", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show()
            }
        }

        binding.nextButton.setOnClickListener {
            val email = binding.emailEditText.text.toString()
            val intent = Intent(this, CounterActivity::class.java)
            intent.putExtra("email", email)
            startActivity(intent)
        }
    }
}
