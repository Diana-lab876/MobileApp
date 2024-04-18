package com.example.myapplication

import android.content.res.Configuration
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class SecondActivity : AppCompatActivity() {
    private lateinit var onboardingManager: OnboardingManager
    private lateinit var nextButton: Button
    private lateinit var imageView: ImageView
    private lateinit var textView: TextView
    private lateinit var textView3: TextView
    private lateinit var textView4: TextView
    private lateinit var dot1: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        onboardingManager = OnboardingManager(this)

        nextButton = findViewById(R.id.nextButton)
        imageView = findViewById(R.id.imageView)
        textView = findViewById(R.id.textView)
        textView3 = findViewById(R.id.textView3)
        textView4 = findViewById(R.id.textView4)
        dot1 = findViewById(R.id.dot1)


        nextButton.setOnClickListener {
            showNextOnboardingItem()
        }

        textView4.setOnClickListener {
            val intent = Intent(this@SecondActivity, LanguageActivity::class.java)
            startActivity(intent)
            finish()
        }

        showNextOnboardingItem()
    }

    private fun showNextOnboardingItem() {
        val item = onboardingManager.getNextOnboardingItem()

        if (item != null) {
            // Устанавливаем изображение и текст на экран
            imageView.setImageResource(item.imageResId)
            dot1.setImageResource(item.slider)
            textView.text = item.text1
            textView3.text = item.text2
            textView4.text = item.text3
            nextButton.text = item.buttonText

            // Применяем анимацию проявления
            imageView.visibility = View.VISIBLE
            dot1.visibility = View.VISIBLE
            textView.visibility = View.VISIBLE
            textView3.visibility = View.VISIBLE
            textView4.visibility = View.VISIBLE
            nextButton.visibility = View.VISIBLE
            imageView.alpha = 0f
            dot1.alpha = 0f
            textView.alpha = 0f
            textView3.alpha = 0f
            textView4.alpha = 0f
            nextButton.alpha = 0f

            imageView.animate().alpha(1f).setDuration(500).start()
            dot1.animate().alpha(1f).setDuration(500).start()
            textView.animate().alpha(1f).setDuration(500).start()
            textView3.animate().alpha(1f).setDuration(500).start()
            textView4.animate().alpha(1f).setDuration(500).start()
            nextButton.animate().alpha(1f).setDuration(500).start()
        } else {
            val intent = Intent(this@SecondActivity, LanguageActivity::class.java)
            startActivity(intent)
            finish()
            }
        }
    }
