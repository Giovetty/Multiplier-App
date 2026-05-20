package com.example.multiplier

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    //Added variables to UI elements
    val calculateButton= findViewById<Button>(R.id.Calculatebutton)
    val inputNumber2= findViewById<EditText>(R.id.Inputnumber2)
    val inputNumber1= findViewById<EditText>(R.id.InputNumber1)
    val answerText = findViewById<TextView>(R.id.answertext)

    //Created calculate function
    fun calculate(){
        var num1= inputNumber1.text.toString().toInt()
        var num2= inputNumber2.text.toString().toInt()
        var result = num1*num2

        answerText.text = result.toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



        // Added code when calculate button is clicked
        calculateButton.setOnClickListener {
         calculate()
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}