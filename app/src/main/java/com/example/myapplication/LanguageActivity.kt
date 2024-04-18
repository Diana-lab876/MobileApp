package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Handler
import android.widget.Button

class LanguageActivity : AppCompatActivity() {
    private lateinit var choose_button: Button
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.language_select)

        choose_button = findViewById(R.id.choose_button)

        choose_button.setOnClickListener{
            val intent = Intent(this@LanguageActivity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
