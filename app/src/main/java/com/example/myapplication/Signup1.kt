package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Handler
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Signup1 : AppCompatActivity() {
    private lateinit var continue_button: Button
    private lateinit var textViewLogin: TextView
    private lateinit var back_button_login: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup1)

        continue_button = findViewById(R.id.continue_button)
        back_button_login = findViewById(R.id.back_button_login)
        textViewLogin = findViewById(R.id.textViewLogin)

        continue_button.setOnClickListener{
            val intent = Intent(this@Signup1, Signup2::class.java)
            startActivity(intent)
            finish()
        }
        textViewLogin.setOnClickListener{
            val intent = Intent(this@Signup1, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
        back_button_login.setOnClickListener{
            val intent = Intent(this@Signup1, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
