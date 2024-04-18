package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Handler
import android.widget.Button
import android.widget.ImageView

class HollyMolly : AppCompatActivity() {
    private lateinit var nextButton: Button
    private lateinit var back_button_login: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.holly_molly)

        nextButton = findViewById(R.id.nextButton)
        back_button_login = findViewById(R.id.back_button_login)

        nextButton.setOnClickListener{
            val intent = Intent(this@HollyMolly, ActivityRC::class.java)
            startActivity(intent)
            finish()
        }
        back_button_login.setOnClickListener{
            val intent = Intent(this@HollyMolly, AnimalChoose::class.java)
            startActivity(intent)
            finish()
        }
    }
}
