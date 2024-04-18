package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Handler
import android.widget.Button
import android.widget.ImageView

class HollyMolly : AppCompatActivity() {
    private lateinit var nextButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.holly_molly)

        nextButton = findViewById(R.id.nextButton)

        nextButton.setOnClickListener{
            val intent = Intent(this@HollyMolly, ActivityRC::class.java)
            startActivity(intent)
            finish()
        }
    }
}
