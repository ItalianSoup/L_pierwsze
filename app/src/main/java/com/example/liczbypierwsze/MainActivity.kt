package com.example.liczbypierwsze

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

var liczba = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.buttonliczba).setOnClickListener {
            liczba = findViewById<EditText>(R.id.inputliczba).text.toString().toInt()
            findViewById<TextView>(R.id.resultinput).setText(liczba.toString())
        }

    }

}