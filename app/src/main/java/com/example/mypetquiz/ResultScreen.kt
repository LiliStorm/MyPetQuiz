package com.example.mypetquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultScreen : AppCompatActivity() {

    lateinit var quizScore: TextView
    lateinit var playAgainButton: Button
    lateinit var menuButton: Button

    var score = Score()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_screen)

        quizScore = findViewById(R.id.quizScore)
        playAgainButton = findViewById(R.id.playAgainButton)
        menuButton = findViewById(R.id.menuButton)

        score.total = intent.getIntExtra("Total", -1)
        score.points = intent.getIntExtra("Points", -1)

        quizScore.text = getScoreString()

        playAgainButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply { }
            startActivity(intent)
        }

        menuButton.setOnClickListener {
            val intent = Intent(this, StartScreen::class.java).apply { }
            startActivity(intent)
        }
    }

    fun getScoreString(): String {
        return "${score.points} correct answers out of ${score.total}"
    }


}