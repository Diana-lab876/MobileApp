package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout

class Audition : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.audition)

        val check =findViewById<Button>(R.id.check_speech_btn)
        val third_after =findViewById<LinearLayout>(R.id.third_after)
        val micro =findViewById<ImageButton>(R.id.micro)
        val yay =findViewById<Button>(R.id.next)
        check.setOnClickListener {
            third_after.visibility=View.VISIBLE
            check.visibility=View.GONE
            micro.visibility=View.VISIBLE
        }
        micro.setOnClickListener {
            micro.visibility=View.GONE
            yay.visibility=View.VISIBLE
        }
        yay.setOnClickListener { startActivity(Intent(this@Audition, ActivityRC::class.java)) }

        val comeback =findViewById<ImageButton>(R.id.back)
        comeback.setOnClickListener { startActivity(Intent(this@Audition, ActivityRC::class.java)) }
    }
}
