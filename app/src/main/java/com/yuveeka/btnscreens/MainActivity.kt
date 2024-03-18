package com.yuveeka.btnscreens

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //declare a variable for birthdate and initialize
    private val birthdate = 15


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        findViewById<View>(R.id.button).setOnClickListener {
                CalculateBirthDate()
            }
        }


          private fun CalculateBirthDate() {

//creating variables to add to birthdate, subtract from birthdate
// multiply to birthdate
                val addNumber = 10
                val subtractNumber = 5
                val multiplyNumber = 3


                // Perform the arithmetic operations
                val resultAfterAddition = birthdate + addNumber
                val resultAfterSubtraction = resultAfterAddition - subtractNumber
                val resultAfterMultiplication = resultAfterSubtraction * multiplyNumber


                /* the dollar sign ($) is used for string interpolation. String
                interpolation allows you to embed expressions into string literals,
                making it easier to construct strings with dynamic content. */

                /*
                *displays the results in a text view by accessing its ID
                *makes use of string interpolation to perform calculations
                *string and variables names will be displayed on the textview */


                val resultTextView = findViewById<TextView>(R.id.resultTextView)
                resultTextView.text =
                    "Your birthdate: $birthdate\n" +
                            "After adding $addNumber: $resultAfterAddition\n" +
                            "After subtracting $subtractNumber: $resultAfterSubtraction\n" +
                            "After multiplying by $multiplyNumber: $resultAfterMultiplication"


                //making use of logging
                Log.d("BirthdayCalculation", "After adding 10:" + birthdate)
                Log.d("BirthdayCalculation", "After multiplying by 3: " + birthdate)

                //converted string concatenation into a template, made use of $
                Log.d("Birthday Calc ", "After subtracting by 5:$birthdate")
                Log.d("Birth calc", "divide by 2 : $birthdate")


                /* string concatenation converted into template?

                * Both methods achieve the same result, but string interpolation is
                * generally preferred for
                * its readability and conciseness,
                * especially when dealing with complex strings or multiple variables.
                * However, in some cases, such as when working with
                * languages that do not support string interpolation, or when performance is a concern,
                * string concatenation may be used instead.*/
            }
        }


