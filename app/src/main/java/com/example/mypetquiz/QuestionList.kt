package com.example.mypetquiz

class QuestionList() {
    val listOfQuestionsAndAnswers = mutableListOf<Question>()
    init {
    }

    fun initializeGuineaPigQuiz() {
        listOfQuestionsAndAnswers.add(
            Question(
                "Ungefär hur gammal blir ett marsvin vanligtvis?",
                "2 år",
                listOf("1 år", "3 år", "4 år")
            )

        )

        listOfQuestionsAndAnswers.add(
            Question(
                "Hur många färger finns det på marsvin?",
                "2",
                listOf("5", "9", "3")
            )

        )

    }

    fun initializeRatQuiz() {
        listOfQuestionsAndAnswers.add(
            Question(
                "Ungefär hur gammal blir en råtta vanligtvis?",
                "2 år",
                listOf("1 år", "3 år", "4 år")
            )

        )

        listOfQuestionsAndAnswers.add(
            Question(
                "Vad är normalvikt för en vuxen råtthona?",
                "300- 500 gram",
                listOf("100- 300 gram", "200- 400 gram", "400- 600 gram")
            )
        )

        listOfQuestionsAndAnswers.add(
            Question(
                "Hur gammal blev världens äldsta råtta?",
                "4.5 år",
                listOf("4 är", "5 år", "5.5 år")
            )
        )

        listOfQuestionsAndAnswers.add(
            Question(
                "Hur kan man se att en råtthona är brunstig?",
                "Hon stelnar till om man stryker henne över rumpan",
                listOf("Hon äter mer än vanligt", "Hon jagar de andra råttorna",
                "Hon drar bak öronen när man klappar henne")
            )
        )

        listOfQuestionsAndAnswers.add(
            Question(
                "Vilket av dessa livsmedel är livsfarligt för råttor?",
                "Lakrits",
                listOf("Mörk choklad", "Kiwi", "Banan")
            )
        )

        listOfQuestionsAndAnswers.add(
            Question(
                "Vid vilken ålder blir råtthonor könsmogna?",
                "5 veckor",
                listOf("3 veckor", "8 veckor", "12 veckor" )
            )
        )

        listOfQuestionsAndAnswers.add(
            Question(
                "Vad kallas den röda vätska som ibland kan ses vid råttans ögon och nos?",
                "Porfyrin",
                listOf("Paraffin", "Klorofyll", "Teobromin")
            )
        )

        listOfQuestionsAndAnswers.add(
            Question(
                "Vilket strö ska man aldrig ha i råttornas bur?",
                "Kutterspån",
                listOf("Alspån", "Hampaströ", "Spån av asp" )
            )
        )
    }

    fun getQuestion(questionIndex: Int): String {
        return listOfQuestionsAndAnswers[questionIndex].question

    }

    fun getRightAnswer(questionIndex: Int): String {
        return listOfQuestionsAndAnswers[questionIndex].rightAnswer
    }

    fun getWrongAnswer(questionIndex: Int, answerIndex: Int): String {
        return listOfQuestionsAndAnswers[questionIndex].wrongAnswers[answerIndex]
    }

    fun getQuizLength(): Int {
        return listOfQuestionsAndAnswers.size
    }

}
