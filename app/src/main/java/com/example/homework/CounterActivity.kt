package com.example.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button

class CounterActivity : AppCompatActivity() {

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)

        val welcomeTextView = findViewById<TextView>(R.id.welcomeTextView)
        val userTextView = findViewById<TextView>(R.id.userTextView)
        val counterTextView = findViewById<TextView>(R.id.counterTextView)
        val clickButton = findViewById<Button>(R.id.nextButton)


        val email = intent.getStringExtra("email")
        userTextView.text = email ?: "Guest"


        clickButton.setOnClickListener {
            counter--
            counterTextView.text = counter.toString()
        }
    }
}

