package com.jamal.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val calc = findViewById<TextView>(R.id.calculator)
        val firstNumber = findViewById<EditText>(R.id.first_number)
        val secondNumber = findViewById<EditText>(R.id.second_number)

        val sum = findViewById<Button>(R.id.sum)
        val substract = findViewById<Button>(R.id.substract)
        val divide = findViewById<Button>(R.id.divide)
        val multiply = findViewById<Button>(R.id.multiply)

        val answer = findViewById<TextView>(R.id.answer)


        sum.setOnClickListener {
            val firstNumberInput = firstNumber.text.toString().toDouble()
            val secondNumberInput = secondNumber.text.toString().toDouble()
            val sum = firstNumberInput + secondNumberInput
            answer.text = "the sum is $sum"
        }
        substract.setOnClickListener {
            val firstNumberInput = firstNumber.text.toString().toDouble()
            val secondNumberInput = secondNumber.text.toString().toDouble()
            val substract = firstNumberInput - secondNumberInput
            answer.text = "the difference is $substract"
        }
        divide.setOnClickListener {
            val firstNumberInput = firstNumber.text.toString().toDouble()
            val secondNumberInput = secondNumber.text.toString().toDouble()
            val divide = firstNumberInput / secondNumberInput
            answer.text = "the quotient is $divide"
        }
       multiply.setOnClickListener {
            val firstNumberInput = firstNumber.text.toString().toDouble()
            val secondNumberInput = secondNumber.text.toString().toDouble()
            val multiply = firstNumberInput * secondNumberInput
            answer.text = "the product is $multiply"
        }
    }
}