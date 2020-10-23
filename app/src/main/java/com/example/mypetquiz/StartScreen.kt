package com.example.mypetquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StartScreen : AppCompatActivity() {

    lateinit var startRatQuiz: Button
    lateinit var startGuineaPigQuiz: Button
    lateinit var startHamsterQuiz: Button
    lateinit var startRabbitQuiz: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_screen)

        startRatQuiz = findViewById(R.id.startRatQuiz)
        startGuineaPigQuiz = findViewById(R.id.startGuineaPigQuiz)
        startHamsterQuiz = findViewById(R.id.startHamsterQuiz)
        startRabbitQuiz = findViewById(R.id.startRabbitQuiz)

        startHamsterQuiz.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("Choice", 1)
            }
            startActivity(intent)
        }

        startRabbitQuiz.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("Choice", 2)
            }
            startActivity(intent)
        }

        startGuineaPigQuiz.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("Choice", 3)
            }
            startActivity(intent)
        }

        startRatQuiz.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("Choice", 4)
            }
            startActivity(intent)
        }
    }
}