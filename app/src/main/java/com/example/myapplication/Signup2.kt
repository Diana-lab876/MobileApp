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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup2)

        choose_button = findViewById(R.id.choose_button)
        textViewLogin = findViewById(R.id.textViewLogin)

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
    }
}
