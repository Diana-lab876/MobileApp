package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Handler
import android.widget.Button
import android.widget.ImageView

class WrongAnswer : AppCompatActivity() {
    private lateinit var nextButton: Button
    private lateinit var tryAgainButton: Button
    private lateinit var back_button_login: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.wrong_answer)

        nextButton = findViewById(R.id.nextButton)
        tryAgainButton = findViewById(R.id.tryAgainButton)
        back_button_login = findViewById(R.id.tryAgainButton)

        nextButton.setOnClickListener{
            val intent = Intent(this@WrongAnswer, ActivityRC::class.java)
            startActivity(intent)
            finish()
        }
        tryAgainButton.setOnClickListener{
            val intent = Intent(this@WrongAnswer, AnimalChoose::class.java)
            startActivity(intent)
            finish()
        }
        back_button_login.setOnClickListener{
            val intent = Intent(this@WrongAnswer, AnimalChoose::class.java)
            startActivity(intent)
            finish()
        }
    }
}
