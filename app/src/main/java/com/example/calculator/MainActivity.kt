package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_increase: Button = findViewById<Button>(R.id.button_increase)
        var text_number: TextView = findViewById(R.id.text_number)
        var number = 0
        text_number.setText("Number: " + "$number")

        button_increase.setOnClickListener{
            number++
            text_number.setText("Number: " + "$number")
        }
    }

}