package com.example.mypetquiz

class Score() {
    var total = 0
    var points = 0

    fun rightAnswer() {
        total++
        points++
    }

    fun wrongAnswer() {
        total++
    }
}