package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class WordPractice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_practice)
        var countClick = 0
        val buttonGuess2 = findViewById<Button>(R.id.buttonGuess2)
        val buttonGuess3 = findViewById<Button>(R.id.buttonGuess3)
        val buttonGuess4 = findViewById<Button>(R.id.buttonGuess4)
        val buttonGuess5 = findViewById<Button>(R.id.buttonGuess5)
        val buttonGuess6 = findViewById<Button>(R.id.buttonGuess6)
        buttonGuess6.setOnClickListener {
            countClick++
            buttonGuess6.text = "Next"
            if (countClick > 1){
                startActivity(
                    Intent(
                        this@WordPractice,
                        ActivityRC::class.java
                    )
                )
            }
            buttonGuess3.backgroundTintList = getColorStateList(R.color.green)
            if (buttonGuess2.backgroundTintList == getColorStateList(R.color.button_blue)) {
                buttonGuess2.backgroundTintList = getColorStateList(R.color.orange)
            }
            if (buttonGuess4.backgroundTintList == getColorStateList(R.color.button_blue)) {
                buttonGuess4.backgroundTintList = getColorStateList(R.color.orange)
            }
            if (buttonGuess5.backgroundTintList == getColorStateList(R.color.button_blue)) {
                buttonGuess5.backgroundTintList = getColorStateList(R.color.orange)
            }
        }
        buttonGuess2.setOnClickListener {
            buttonGuess2.backgroundTintList = getColorStateList(R.color.button_blue)
            buttonGuess3.backgroundTintList = getColorStateList(R.color.gray)
            buttonGuess4.backgroundTintList = getColorStateList(R.color.gray)
            buttonGuess5.backgroundTintList = getColorStateList(R.color.gray)

        }
        buttonGuess3.setOnClickListener {
            buttonGuess2.backgroundTintList = getColorStateList(R.color.gray)
            buttonGuess3.backgroundTintList = getColorStateList(R.color.button_blue)
            buttonGuess4.backgroundTintList = getColorStateList(R.color.gray)
            buttonGuess5.backgroundTintList = getColorStateList(R.color.gray)

        }

        buttonGuess4.setOnClickListener {
            buttonGuess2.backgroundTintList = getColorStateList(R.color.gray)
            buttonGuess3.backgroundTintList = getColorStateList(R.color.gray)
            buttonGuess4.backgroundTintList = getColorStateList(R.color.button_blue)
            buttonGuess5.backgroundTintList = getColorStateList(R.color.gray)

        }

        buttonGuess5.setOnClickListener {
            buttonGuess2.backgroundTintList = getColorStateList(R.color.gray)
            buttonGuess3.backgroundTintList = getColorStateList(R.color.gray)
            buttonGuess4.backgroundTintList = getColorStateList(R.color.gray)
            buttonGuess5.backgroundTintList = getColorStateList(R.color.button_blue)

        }

        val back_button_login = findViewById<Button>(R.id.back_button_login)
        back_button_login.setOnClickListener {
            startActivity(
                Intent(
                    this@WordPractice,
                    ActivityRC::class.java
                )
            )
        }
    }
}
