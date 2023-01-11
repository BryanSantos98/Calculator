package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val button0 = findViewById<Button>(R.id.btNumber0)
        val textView = findViewById<TextView>(R.id.tvNumber)

        button0.setOnClickListener {
            textView.text = textView.text.toString().plus("0")
        }

        val button1 = findViewById<Button>(R.id.btNumber1)
        val textView = findViewById<TextView>(R.id.tvNumber)

        button1.setOnClickListener {
            textView.text = textView.text.toString().plus("1")
        }

        val button2 = findViewById<Button>(R.id.btNumber2)
        val textView = findViewById<TextView>(R.id.tvNumber)

        button2.setOnClickListener {
            textView.text = textView.text.toString().plus("2")
        }

        val button3 = findViewById<Button>(R.id.btNumber3)
        val textView = findViewById<TextView>(R.id.tvNumber)

        button3.setOnClickListener {
            textView.text = textView.text.toString().plus("3")
        }

        val button = findViewById<Button>(R.id.btNumber4)
        val textView = findViewById<TextView>(R.id.tvNumber)

        button4.setOnClickListener {
            textView.text = textView.text.toString().plus("4")
        }

        val button5 = findViewById<Button>(R.id.btNumber5)
        val textView = findViewById<TextView>(R.id.tvNumber)

        button5.setOnClickListener {
            textView.text = textView.text.toString().plus("5")
        }

        val button6 = findViewById<Button>(R.id.btNumber6)
        val textView = findViewById<TextView>(R.id.tvNumber)

        button6.setOnClickListener {
            textView.text = textView.text.toString().plus("6")
        }

        val button = findViewById<Button>(R.id.btNumber7)
        val textView = findViewById<TextView>(R.id.tvNumber)

        button.setOnClickListener {
            textView.text = textView.text.toString().plus("7")
        }

        val button8 = findViewById<Button>(R.id.btNumber8)
        val textView = findViewById<TextView>(R.id.tvNumber)

        button8.setOnClickListener {
            textView.text = textView.text.toString().plus("8")
        }

        val button9 = findViewById<Button>(R.id.btNumber9)
        val textView = findViewById<TextView>(R.id.tvNumber)

        button9.setOnClickListener {
            textView.text = textView.text.toString().plus("9")
        }

        val btpoint = findViewById<Button>(R.id.btPoint)
        btpoint.setOnClickListener {
            findViewById<TextView>(R.id.tvNumber).setText(".")

        }

        val btcomma = findViewById<Button>(R.id.btComma)

        btcomma.setOnClickListener {
            findViewById<TextView>(R.id.tvNumber).setText(",")
        }


        val btminus = findViewById<Button>(R.id.btMinus)
        val btdivide = findViewById<Button>(R.id.btDivision)
        val btmultiply = findViewById<Button>(R.id.btMultiply)
        val btmodule = findViewById<Button>(R.id.btModule)
        val btequal = findViewById<Button>(R.id.btEqual)

        val btplus = findViewById<Button>(R.id.btPlus)

        val btAC = findViewById<Button>(R.id.btAc)
        btAC.setOnClickListener {
            findViewById<TextView>(R.id.tvNumber).setText("")
        }

        val btErase = findViewById<Button>(R.id.btErase)



        }
        }








