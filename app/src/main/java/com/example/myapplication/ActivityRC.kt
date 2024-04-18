package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Handler
import android.widget.Button
import android.widget.ImageView

class ActivityRC : AppCompatActivity() {
    private lateinit var imageAvatar: ImageView
    private lateinit var buttonGuessTheAnimal: Button
    private lateinit var buttonListening: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rc)

        imageAvatar = findViewById(R.id.imageAvatar)
        buttonGuessTheAnimal = findViewById(R.id.buttonGuessTheAnimal)
        buttonListening = findViewById(R.id.buttonListening)

        imageAvatar.setOnClickListener{
            val intent = Intent(this@ActivityRC, Profile::class.java)
            startActivity(intent)
            finish()
        }
        buttonGuessTheAnimal.setOnClickListener{
            val intent = Intent(this@ActivityRC, AnimalChoose::class.java)
            startActivity(intent)
            finish()
        }
        buttonListening.setOnClickListener{
            val intent = Intent(this@ActivityRC, Audition::class.java)
            startActivity(intent)
            finish()
        }
    }
}
