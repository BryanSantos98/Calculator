package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Adiciona botões no código

        // Botões numéricos
        val bt0 = findViewById<AppCompatButton>(R.id.btNumber0)
        val bt1 = findViewById<AppCompatButton>(R.id.btNumber1)
        val bt2 = findViewById<AppCompatButton>(R.id.btNumber2)
        val bt3 = findViewById<AppCompatButton>(R.id.btNumber3)
        val bt4 = findViewById<AppCompatButton>(R.id.btNumber4)
        val bt5 = findViewById<AppCompatButton>(R.id.btNumber5)
        val bt6 = findViewById<AppCompatButton>(R.id.btNumber6)
        val bt7 = findViewById<AppCompatButton>(R.id.btNumber7)
        val bt8 = findViewById<AppCompatButton>(R.id.btNumber8)
        val bt9 = findViewById<AppCompatButton>(R.id.btNumber9)

        // Botões de ação
        val btAC = findViewById<AppCompatButton>(R.id.btAc)
        val btX = findViewById<AppCompatButton>(R.id.btErase)
        val btModule = findViewById<AppCompatButton>(R.id.btModule)
        val btDivision = findViewById<AppCompatButton>(R.id.btDivision)
        val btMultiply = findViewById<AppCompatButton>(R.id.btMultiply)
        val btMinus = findViewById<AppCompatButton>(R.id.btMinus)
        val btPlus = findViewById<AppCompatButton>(R.id.btPlus)
        val btEqual = findViewById<AppCompatButton>(R.id.btEqual)
        val btComma = findViewById<AppCompatButton>(R.id.btComma)
        val btDot = findViewById<AppCompatButton>(R.id.btPoint)


        // Adiciona textView no código
        val tvCalculator = findViewById<AppCompatTextView>(R.id.tvNumber)

        bt0.setOnClickListener { tvCalculator.text = tvCalculator.text.toString().plus("0") }
        bt1.setOnClickListener { tvCalculator.text = tvCalculator.text.toString().plus("1") }
        bt2.setOnClickListener { tvCalculator.text = tvCalculator.text.toString().plus("2") }
        bt3.setOnClickListener { tvCalculator.text = tvCalculator.text.toString().plus("3") }
        bt4.setOnClickListener { tvCalculator.text = tvCalculator.text.toString().plus("4") }
        bt5.setOnClickListener { tvCalculator.text = tvCalculator.text.toString().plus("5") }
        bt6.setOnClickListener { tvCalculator.text = tvCalculator.text.toString().plus("6") }
        bt7.setOnClickListener { tvCalculator.text = tvCalculator.text.toString().plus("7") }
        bt8.setOnClickListener { tvCalculator.text = tvCalculator.text.toString().plus("8") }
        bt9.setOnClickListener { tvCalculator.text = tvCalculator.text.toString().plus("9") }
        btAC.setOnClickListener { tvCalculator.text = "" }
        btX.setOnClickListener {
            val tvString = tvCalculator.text.toString()
            if (tvString.isNotEmpty()) {
                tvCalculator.text = tvString.substring(0, tvString.length - 1)
            }
        }
        btDot.setOnClickListener {
            val tvString = tvCalculator.text.toString()

            if (tvString.isNotEmpty()) {
                tvCalculator.text = tvString.plus(".")
            }

        }
        btComma.setOnClickListener {
            val tvString = tvCalculator.text.toString()

            if (tvString.isNotEmpty()) {
                tvCalculator.text = tvString.plus(",")
            }
        }


    }
}








