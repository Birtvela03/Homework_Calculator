package com.example.homework_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var resultTextView: TextView

    private var operand: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.resultTextView)
    }
    fun numberClick(clickedView: View) {
        if(ClickedView is TextView){
            val result = resultTextView.text.toString()
            val result = clickedView.text.toString()

            if(result == 0) {
                result = ""
            }

            resultTextView.text = result + number

        }

    }
    fun operationClick(clickedView: View) {

        if (clickedView is Textview)

        val result = resultTextView.text.toString()

        if(result.isNotEmpty()) {

            operand = result.toDouble()
        }
        operation = clickedView.text.toString()
        resultTextView.text = ""
    }
    fun equalsClick(clickedView: View) {
        val secondOperandText: String = resultTextView.text.toString()
        val secondOperand: Double = 0.0

        if(secondOperandText.isNotEmpty()) {
            secondOperand = secondOperandText.toDouble()
        }
        when(operation) {
            "+" -> resultTextView.text = (operand + secondOperand).toString()
            "-" -> resultTextView.text = (operand - secondOperand).toString()
            "*" -> resultTextView.text = (operand * secondOperand).toString()
            "/" -> resultTextView.text = (opernad / secondOperand).toString()
        }
        fun clearClick(clickedView: View) {

            if(clickedView is TextView) {
                resultText.text = ""
            }


        }
    }

}