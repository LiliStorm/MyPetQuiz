package com.example.mypetquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StartScreen : AppCompatActivity() {

    lateinit var startRatQuiz: Button
    lateinit var startGuineaPigQuiz: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_screen)

        startRatQuiz = findViewById(R.id.startRatQuiz)
        startGuineaPigQuiz = findViewById(R.id.startGuineaPigQuiz)

        startRatQuiz.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("Choice", 1)
            }
            startActivity(intent)
        }

        startGuineaPigQuiz.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("Choice", 2)
            }
            startActivity(intent)
        }
    }
}