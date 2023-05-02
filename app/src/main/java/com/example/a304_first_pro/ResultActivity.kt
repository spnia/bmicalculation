package com.example.a304_first_pro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.math.pow
import kotlin.math.roundToInt

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val height = intent.getIntExtra("height", 0)
        val weight = intent.getIntExtra("weight", 0)
        val bmi = weight/(height/100.0).pow(2.0)
        val result = when{
            bmi >= 35.0 -> "비이이이만"
            bmi >= 30.0 -> "비이이만"
            bmi >= 25.0 -> "비이만"
            bmi >= 23.0 -> "비만"
            bmi >= 18.5 -> "정상 체중"
            else -> "저체중"
        }
        val result_bmi = findViewById<TextView>(R.id.bmi_result)
        val result_value = findViewById<TextView>(R.id.value_result)
        result_bmi.text = (((bmi*100).roundToInt())/100.0).toString()
        result_value.text = result
    }
}