package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class AnimalChoose : AppCompatActivity() {
    private lateinit var buttonGuess: Button
    private lateinit var textGuess: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.animal)

        buttonGuess = findViewById(R.id.buttonGuess)
        textGuess = findViewById(R.id.editTextGuess);

        buttonGuess.setOnClickListener{
            if (textGuess.getText().toString().toLowerCase().equals("racoon")) {
                val intent = Intent(this@AnimalChoose, HollyMolly::class.java)
                startActivity(intent)
                finish()
            }else {
                val intent = Intent(this@AnimalChoose, WrongAnswer::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}
