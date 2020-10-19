package com.example.mypetquiz

class Question (
    val question: String,
    val rightAnswer: String,
    val wrongAnswers: List<String> =  mutableListOf<String>()
)