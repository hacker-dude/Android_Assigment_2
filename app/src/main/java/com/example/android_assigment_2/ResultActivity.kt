package com.example.android_assigment_2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.DecimalFormat

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val resultText: TextView = findViewById(R.id.result)
        val format = DecimalFormat("0.#")
        resultText.text = format.format(intent.getDoubleExtra("result", 0.0)).toString()
    }
}