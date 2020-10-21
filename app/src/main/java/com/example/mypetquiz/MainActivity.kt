package com.example.mypetquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val quizQuestions = QuestionList()
    var currentQuestionIndex = 0
    val score = Score()
    lateinit var questionBox : TextView
    lateinit var answerButton1 : Button
    lateinit var answerButton2 : Button
    lateinit var answerButton3 : Button
    lateinit var answerButton4 : Button
    lateinit var cuteRatsView : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        quizQuestions.initializeRatQuiz()
        questionBox = findViewById(R.id.questionBox)
        answerButton1 = findViewById(R.id.button1)
        answerButton2 = findViewById(R.id.button2)
        answerButton3 = findViewById(R.id.button3)
        answerButton4 = findViewById(R.id.button4)
        cuteRatsView = findViewById(R.id.cuteRatsView)

        // TODO move this to new function and add more rat pictures
        cuteRatsView.setImageResource(R.drawable.champagnerat)

        showQuestion()
        showAnswers()
        setClickListener()

    }

    fun showQuestion() {
        questionBox.text = quizQuestions.getQuestion(currentQuestionIndex)

    }

    fun showAnswers() {
        val randomizedAnswers = getRandomizedAnswers()
        answerButton1.text = randomizedAnswers[0]
        answerButton2.text = randomizedAnswers[1]
        answerButton3.text = randomizedAnswers[2]
        answerButton4.text = randomizedAnswers[3]
    }

    fun getRandomizedAnswers(): List<String> {
        val randomizedList = mutableListOf<String>()
        randomizedList.add(quizQuestions.getRightAnswer(currentQuestionIndex)) // randomizedList index 0
        randomizedList.add(quizQuestions.getWrongAnswer(currentQuestionIndex,0)) // randomizedList index 1
        randomizedList.add(quizQuestions.getWrongAnswer(currentQuestionIndex,1)) // randomizedList index 2
        randomizedList.add(quizQuestions.getWrongAnswer(currentQuestionIndex,2)) // randomizedList index 3

        for (i in 1..20) {
            // randomize a number which will be 0, 1, 2 or 3
            val indexToShuffle = Random.nextInt(0,4)

            // store the list element which we want to shuffle, in a new variable
            val answerToShuffle = randomizedList[indexToShuffle]

            randomizedList.removeAt(indexToShuffle)

            // add the item we just removed back in the list, which will be added to the bottom of the list
            randomizedList.add(answerToShuffle)
        }

        return randomizedList
    }

    fun setClickListener() {
        answerButton1.setOnClickListener {
            checkAnswer(answerButton1.text.toString())
        }
        answerButton2.setOnClickListener {
            checkAnswer(answerButton2.text.toString())
        }

        answerButton3.setOnClickListener {
            checkAnswer(answerButton3.text.toString())
        }

        answerButton4.setOnClickListener {
            checkAnswer(answerButton4.text.toString())
        }
    }

    fun checkAnswer(answer: String) {
        if(answer.toLowerCase() == quizQuestions.getRightAnswer(currentQuestionIndex).toLowerCase()) {
            score.rightAnswer()
        } else {
            score.wrongAnswer()
        }
        nextQuestionOrResultScreen()
    }

    fun nextQuestionOrResultScreen() {
        if(currentQuestionIndex+1 == quizQuestions.getQuizLength()) {
            val intent = Intent(this, ResultScreen::class.java).apply {
                putExtra("Points", score.points)
                putExtra("Total", score.total)
            }
            startActivity(intent)
        } else {
            currentQuestionIndex++
            showQuestion()
            showAnswers()
        }
    }
}