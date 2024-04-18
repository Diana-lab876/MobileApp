package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Handler
import android.widget.Button
import androidx.appcompat.app.AppCompatDelegate

class Profile : AppCompatActivity() {
    private lateinit var changeLangButton: Button
    private lateinit var choose_button5: Button
    private lateinit var choose_button4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)

        changeLangButton = findViewById(R.id.changeLangButton)
        choose_button5 = findViewById(R.id.choose_button5)
        choose_button4 = findViewById(R.id.choose_button4)

        changeLangButton.setOnClickListener{
            val intent = Intent(this@Profile, LanguageActivity::class.java)
            startActivity(intent)
            finish()
        }
        choose_button5.setOnClickListener{
            val intent = Intent(this@Profile, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
        choose_button4.setOnClickListener {
// Получение текущей темы
            val currentNightMode =
                resources.configuration.uiMode and android.content.res.Configuration.UI_MODE_NIGHT_MASK

// Изменение темы
            when (currentNightMode) {
                android.content.res.Configuration.UI_MODE_NIGHT_YES -> {
// Если текущая тема - темная, то установить светлую тему
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                }

                android.content.res.Configuration.UI_MODE_NIGHT_NO -> {
// Если текущая тема - светлая, то установить темную тему
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                }
            }

// Перезагрузка активити для применения изменений
            recreate()
        }
    }
}
