package com.example.calculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.View
import android.widget.TextView
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var editNum1:EditText
    lateinit var editNum2:EditText
    lateinit var txtResult:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun addition(view: View){
        editNum1 = findViewById(R.id.txtNum1)
        editNum2 = findViewById(R.id.txtNum2)
        txtResult = findViewById(R.id.txtResult)
        val num1 = editNum1.text.toString().toDouble()
        val num2 = editNum2.text.toString().toDouble()
        val result = num1 + num2
        txtResult.text = java.lang.Double.toString(result)
    }

    fun subtraction(view: View){
        editNum1 = findViewById(R.id.txtNum1)
        editNum2 = findViewById(R.id.txtNum2)
        txtResult = findViewById(R.id.txtResult)
        val num1 = editNum1.text.toString().toDouble()
        val num2 = editNum2.text.toString().toDouble()
        val result = num1 - num2
        txtResult.text = java.lang.Double.toString(result)
    }

    fun multiplication(view: View){
        editNum1 = findViewById(R.id.txtNum1)
        editNum2 = findViewById(R.id.txtNum2)
        txtResult = findViewById(R.id.txtResult)
        val num1 = editNum1.text.toString().toDouble()
        val num2 = editNum2.text.toString().toDouble()
        val result = num1 * num2
        txtResult.text = java.lang.Double.toString(result)
    }

    fun division(view: View){
        editNum1 = findViewById(R.id.txtNum1)
        editNum2 = findViewById(R.id.txtNum2)
        txtResult = findViewById(R.id.txtResult)
        val num1 = editNum1.text.toString().toDouble()
        val num2 = editNum2.text.toString().toDouble()
        val result = num1 / num2
        txtResult.text = java.lang.Double.toString(result)
    }
}