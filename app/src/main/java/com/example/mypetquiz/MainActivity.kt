package com.example.mypetquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.widget.Button
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        quizQuestions.initializeRatQuiz()
        questionBox = findViewById(R.id.questionBox)
        answerButton1 = findViewById(R.id.button1)
        answerButton2 = findViewById(R.id.button2)
        answerButton3 = findViewById(R.id.button3)
        answerButton4 = findViewById(R.id.button4)

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

            // ### Example ###
            // The first time we run this loop, if indexToShuffle was randomized to be 1, then...
            //      indexToShuffle will be:      1
            //      answerToShuffle will be:     quizQuestions.getWrongAnswer(0,0)
            // ###

            // remove the item from the list which is at the randomized index
            randomizedList.removeAt(indexToShuffle)

            // add the item we just removed back in the list, which will be added to the bottom of the list
            randomizedList.add(answerToShuffle)

            // If the randomized list item used to be at randomizedList[1], it will now be at randomizedList[3].
            // (added items go to the bottom of the list)
            // Now we will repeat this randomized shuffle process by looping another 19 times.
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

    fun checkAnswer(answer: String){

        if(answer.toLowerCase() == quizQuestions.getRightAnswer(currentQuestionIndex).toLowerCase()) {
            score.rightAnswer()
        } else {
            score.wrongAnswer()
        }
        nextQuestionOrResultScreen()
    }

    // TODO Fortsätt här!

    fun nextQuestionOrResultScreen() {
        if(currentQuestionIndex+1 == quizQuestions.getQuizLength()) {
            Log.d("Results", "Score!")
        } else{
            currentQuestionIndex++
            showQuestion()
            showAnswers()
        }
    }
}