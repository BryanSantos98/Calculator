package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import java.util.Scanner
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

class MainActivity : AppCompatActivity() {

    var tvCalculator: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Adiciona textView no código
        tvCalculator = findViewById<AppCompatTextView>(R.id.tvNumber)

        listOf("+", "-", "*", "/", "%")

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

        bt0.setOnClickListener { addNewChar("0") }
        bt1.setOnClickListener { addNewChar("1") }
        bt2.setOnClickListener { addNewChar("2") }
        bt3.setOnClickListener { addNewChar("3") }
        bt4.setOnClickListener { addNewChar("4") }
        bt5.setOnClickListener { addNewChar("5") }
        bt6.setOnClickListener { addNewChar("6") }
        bt7.setOnClickListener { addNewChar("7") }
        bt8.setOnClickListener { addNewChar("8") }
        bt9.setOnClickListener { addNewChar("9") }
        btAC.setOnClickListener { clearScreen() }
        btX.setOnClickListener { backspace() }
        btDot.setOnClickListener { insertFloatOperators(".") }
        btComma.setOnClickListener { insertFloatOperators(",") }
        btPlus.setOnClickListener { insertFloatOperators(char = "+".plus(plus())) }
        btMinus.setOnClickListener { insertFloatOperators(char = "-".plus(minus())) }
        btDivision.setOnClickListener { insertFloatOperators(char = "/".plus(divide())) }
        btMultiply.setOnClickListener { insertFloatOperators("*".plus(multiply())) }
        btModule.setOnClickListener { insertFloatOperators(char = "%".plus(module())) }
        btEqual.setOnClickListener() {
            try {
                val expression = ExpressionBuilder(tvCalculator.text.toString()).build()
                val result = expression.evaluate()
                val longResult = result.toULong()
                if (result == longResult.toDouble())
                    tvCalculator.text = longResult.toString()
                else
                    tvCalculator.text = result.toString()

            } catch (e: Exception) {
                Log.d("Exception", "Message : " + e.message)
            }
        }
    }

    private fun addNewChar(char: String) {
        tvCalculator?.text = tvCalculator?.text.toString().plus(char)
    }

    private fun clearScreen() {
        tvCalculator?.text = ""
    }

    private fun backspace() {
        val actualText = tvCalculator?.text.toString()
        if (tvCalculator?.text.toString().isNotEmpty())
            tvCalculator?.text = actualText.substring(0, actualText.length - 1)
    }

    private fun insertFloatOperators(char: String) {
        val actualText = tvCalculator?.text.toString()

        if (actualText.isNotEmpty()) {
            """\d""".toRegex().find(actualText.last().toString()).let { matchResult ->
                if (matchResult?.value != null) {
                    tvCalculator?.text = actualText.plus(char)
                }
            }
        }
    }

    var number1: Int = 0
    var number2: Int = 0

    public fun plus(): Int {return (number1 + number2)}

    public fun minus(): Int {return (number1 - number2)}

    public fun multiply(): Int {return (number1 * number2)}

    public fun divide(): Int {return (number1 / number2)}

    public fun module(): Int {return (number1 % number2)}
}








