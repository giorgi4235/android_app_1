package com.example.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.EditText
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val okayButton = findViewById<Button>(R.id.okayButton)
        val nextButton = findViewById<Button>(R.id.nextButton)

        okayButton.setOnClickListener {
            val email = emailEditText.text.toString()
            if (email.isNotEmpty()) {
                Toast.makeText(this, "Welcome back, $email", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show()
            }
        }

        nextButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val intent = Intent(this, CounterActivity::class.java)
            intent.putExtra("email", email)
            startActivity(intent)
        }
    }
}
