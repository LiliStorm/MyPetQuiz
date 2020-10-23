package com.example.mypetquiz

class QuestionList() {
    val listOfQuestionsAndAnswers = mutableListOf<Question>()
    init {
    }

    fun initializeHamsterQuiz() {
        listOfQuestionsAndAnswers.add(
            Question(
                "Det finns två sorters tama hamstrar, vilka?",
                "Dvärghamster och guldhamster",
                listOf("Guldhamster och pygméhanster", "Dvärghamster och jättehamster",
                    "Minihamster och jättehamster")
            )

        )

        listOfQuestionsAndAnswers.add(
            Question(
                "Hur mycket väger en guldhamster?",
                "50- 100 gram",
                listOf("100- 150 gram", "150- 200 gram", "200- 250 gram")
            )

        )

        listOfQuestionsAndAnswers.add(
            Question(
                "Hur många centimeter i diameter ska hamsterhjulet minst vara?",
                "12- 14 cm",
                listOf("14- 16 cm", "16- 18 cm", "18- 20 cm")
            )

        )

        listOfQuestionsAndAnswers.add(
            Question(
                "Hur ofta ska hamsterburen rengöras?",
                "1- 2 gånger i veckan",
                listOf("Varje dag", "3- 4 gånger i veckan", "Varannan vecka")
            )

        )

        listOfQuestionsAndAnswers.add(
            Question(
                "Hur mycket protein bör hamsterns pellets innehålla?",
                "15- 20 procent",
                listOf("5- 10 procent", "10- 15 procent", "20- 25 procent")
            )

        )

        listOfQuestionsAndAnswers.add(
            Question(
                "Ungefär hur mycket mat om dagen ska hamstern äta?",
                "12 gram",
                listOf("6 gram", "18 gram", "24 gram")
            )

        )

        listOfQuestionsAndAnswers.add(
            Question(
                "Hur gammal blir en hamster",
                "2 år",
                listOf("1 år", "3 år", "4 år")
            )

        )

        listOfQuestionsAndAnswers.add(
            Question(
                "Vad ska man aldrig ge sin hamster att äta?",
                "Mandel",
                listOf("Broccoli", "Jordgubbar", "Ost")
            )

        )
    }

    fun initializeRabbitQuiz() {
        listOfQuestionsAndAnswers.add(
            Question(
                "Ungefär hur gammal blir en kanin?",
                "8- 10 år",
                listOf("2- 4 år", "4- 6 år", "6- 8 år")
            )

        )
        listOfQuestionsAndAnswers.add(
            Question(
                "När kan kaninungar skiljas helt från sin mamma?",
                "8 veckor",
                listOf("4 veckor", "6 veckor", "10 veckor")
            )

        )
        listOfQuestionsAndAnswers.add(
            Question(
                "Hur gammal blev världens äldsta kanin?",
                "16 år",
                listOf("14 år", "15 år", "17 år")
            )

        )
        listOfQuestionsAndAnswers.add(
            Question(
                "Hur ofta ska man byta strö i en kaninbur?",
                "Varje dag",
                listOf("Varannan dag", "2 gånger i veckan", "1 gång varannan vecka")
            )

        )
        listOfQuestionsAndAnswers.add(
            Question(
                "Hur mycket av kaninens foder ska vara hö?",
                "90 procent",
                listOf("70 procent", "80 procent", "60 procent")
            )

        )
        listOfQuestionsAndAnswers.add(
            Question(
                "Vilket av dessa livsmedel är giftigt för kaniner?",
                "Rabarber",
                listOf("Broccoli", "Paprika", "Basilika")
            )

        )

        listOfQuestionsAndAnswers.add(
            Question(
                "När blir en kanin könsmogen?",
                "Vid 3- 6 månader",
                listOf("Vid 1- 3 månader", "Vid 6- 9 månader", "Vid ett års ålder")
            )

        )
    }

    fun initializeGuineaPigQuiz() {
        listOfQuestionsAndAnswers.add(
            Question(
                "Varifrån kommer marsvin ursprungligen?",
                "Sydamerika",
                listOf("Australien", "Nordafrika", "Asien")
            )

        )

        listOfQuestionsAndAnswers.add(
            Question(
                "Vad är medelåldern för ett marsvin?",
                "5- 6 år",
                listOf("1- 2 år", "3- 4 år", "7- 8 år")
            )

        )

        listOfQuestionsAndAnswers.add(
            Question(
                "Vilken sorts vitamin kan marsvin inte producera själva?",
                "C-vitamin",
                listOf("B-vitamin", "D-vitamin", "E-vitamin")
            )

        )

        listOfQuestionsAndAnswers.add(
            Question(
                "Hur stor del av marsvinets mat ska vara hö?",
                "80 procent",
                listOf("60 procent", "70 procent", "90 procent")
            )

        )

        listOfQuestionsAndAnswers.add(
            Question(
                "Vad ska man INTE ha som bottenmaterial för marsvin?",
                "Sågspån",
                listOf("Tidningspapper", "Handdukar", "Fleece")
            )

        )

        listOfQuestionsAndAnswers.add(
            Question(
                "När blir marsvinshanar vanligtvis könsmogna?",
                "8- 10 veckor",
                listOf("2- 4 veckor", "4- 6 veckor", "6- 8 veckor")
            )

        )

        listOfQuestionsAndAnswers.add(
            Question(
                "Hur länge är en marsvinshona dräktig?",
                "2- 2.5 månader",
                listOf("1- 2 månader", "2.5- 3 månader", "3- 4 månader")
            )

        )

        listOfQuestionsAndAnswers.add(
            Question(
                "Vad är den normala vikten för en marsvinshane",
                "900- 1200 gram",
                listOf("300- 600 gram", "600- 900 gram", "1200- 1500 gram")
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
