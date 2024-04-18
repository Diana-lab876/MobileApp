package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Handler
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    private lateinit var choose_button: Button
    private lateinit var textViewSignup: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        choose_button = findViewById(R.id.choose_button)
        textViewSignup = findViewById(R.id.textViewSignup)

        choose_button.setOnClickListener{
            val intent = Intent(this@LoginActivity, ActivityRC::class.java)
            startActivity(intent)
            finish()
        }
        textViewSignup.setOnClickListener{
            val intent = Intent(this@LoginActivity, Signup1::class.java)
            startActivity(intent)
            finish()
        }
    }
}
