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
        val text_number: TextView = findViewById(R.id.text_number)
        val calculator = Calculator()
        text_number.text = "Number: ${calculator.number}"

        button_increase.setOnClickListener{
            calculator.increment()
            text_number.text = "Number: ${calculator.number}"
        }
    }

}