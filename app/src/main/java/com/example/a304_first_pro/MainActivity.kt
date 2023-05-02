package com.example.a304_first_pro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val height_edit:EditText = findViewById(R.id.height_edit)
        val weight_edit = findViewById<EditText>(R.id.height_edit)
        val result_btn = findViewById<Button>(R.id.result_btn)
        result_btn.setOnClickListener {
            if(height_edit.text.isEmpty() || weight_edit.text.isEmpty()){
                Toast.makeText(this, "빈 값이 있습니다.", Toast.LENGTH_SHORT).show()
            } else {
                val height:Int = height_edit.text.toString().toInt()
                val weight:Int = weight_edit.text.toString().toInt()
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("height",height)
                intent.putExtra("weight",weight)
                startActivity(intent)
            }
        }
    }
}