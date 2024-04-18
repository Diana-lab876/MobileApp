package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Handler
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Signup2 : AppCompatActivity() {
    private lateinit var choose_button: Button
    private lateinit var textViewLogin: TextView
    private lateinit var back_button_login: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup2)

        choose_button = findViewById(R.id.choose_button)
        textViewLogin = findViewById(R.id.textViewLogin)
        back_button_login = findViewById(R.id.back_button_login)

        choose_button.setOnClickListener{
            val intent = Intent(this@Signup2, ActivityRC::class.java)
            startActivity(intent)
            finish()
        }

        textViewLogin.setOnClickListener{
            val intent = Intent(this@Signup2, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
        back_button_login.setOnClickListener{
            val intent = Intent(this@Signup2, Signup1::class.java)
            startActivity(intent)
            finish()
        }
    }
}
