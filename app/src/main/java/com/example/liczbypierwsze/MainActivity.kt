package com.example.liczbypierwsze

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val liczba = findViewById<TextView>(R.id.editTextNumber)
        val button = findViewById<Button>(R.id.button)
        val outresult= findViewById<TextView>(R.id.textView)


        button.setOnClickListener {
            var a = liczba.text.toString().toInt()
            var x = 2
            var czynnik = ""
            while (a > 1)
            {
                while (a % x==0)
                {
                    czynnik += (x.toString() + "  ")
                    a/= x
                }
                ++x
            }
            outresult.text = ("liczby pierwsze tej liczby " + czynnik)
        }
    }
}
