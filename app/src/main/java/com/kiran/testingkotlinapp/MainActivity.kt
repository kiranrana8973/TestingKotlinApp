package com.kiran.testingkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var etFirst: EditText
    private lateinit var etSecond: EditText
    private lateinit var btnCalculate: Button

    private lateinit var arithmetic: Arithmetic

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etFirst = findViewById(R.id.etFirst)
        etSecond = findViewById(R.id.etSecond)
        btnCalculate = findViewById(R.id.btnCalculate)

        btnCalculate.setOnClickListener {
            addTwoNos()
        }
    }

    private fun addTwoNos() {
        val first = etFirst.text.toString().toInt()
        val second = etSecond.text.toString().toInt()
        arithmetic = Arithmetic()
        arithmetic.first = first
        arithmetic.second = second

        val result = arithmetic.add()

        Toast.makeText(this, "Sum is $result", Toast.LENGTH_SHORT).show()
    }
}