package com.example.android_assigment_2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var et1: EditText
    lateinit var et2: EditText
    lateinit var btnAdd: Button
    lateinit var btnSub: Button
    lateinit var btnMult: Button
    lateinit var btnDiv: Button
    var result: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et1 = findViewById(R.id.et1)
        et2 = findViewById(R.id.et2)
        btnAdd = findViewById(R.id.add)
        btnSub = findViewById(R.id.subtract)
        btnMult = findViewById(R.id.multiply)
        btnDiv = findViewById(R.id.divide)

        btnAdd.setOnClickListener { onClick(it) }
        btnSub.setOnClickListener { onClick(it) }
        btnMult.setOnClickListener { onClick(it) }
        btnDiv.setOnClickListener { onClick(it) }
    }

    private fun onClick(v: View) {
        val et1Num = et1.text.toString().toDoubleOrNull()
        val et2Num = et2.text.toString().toDoubleOrNull()

        if (et1Num == null || et2Num == null) return

        when (v.id) {
            R.id.add -> {
                result = et1Num + et2Num
                switchActivities(result)
            }
            R.id.subtract -> {
                result = et1Num - et2Num
                switchActivities(result)
            }
            R.id.multiply -> {
                result = et1Num * et2Num
                switchActivities(result)
            }
            R.id.divide -> {
                result = et1Num / et2Num
                switchActivities(result)
            }
        }
    }

    private fun switchActivities(result: Double) {
        val switchActivityIntent = Intent(this, ResultActivity::class.java)
        switchActivityIntent.putExtra("result", result)
        startActivity(switchActivityIntent)
    }
}