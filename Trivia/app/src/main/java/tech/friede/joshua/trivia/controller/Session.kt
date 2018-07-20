package tech.friede.joshua.trivia.controller

import tech.friede.joshua.trivia.model.Quiz
import tech.friede.joshua.trivia.model.QuizResponse
import tech.friede.joshua.trivia.model.questions.TrueFalse


object Session {

    lateinit var selectedQuizName: String
    lateinit var selectedQuiz: Quiz
    lateinit var response: QuizResponse
    var currentQuestion = 1


    init {
        //dummy code

        val dummyQuiz = Quiz("dummyQuiz")
        val dummyQuestion1 = TrueFalse("dummyQuestion1", "The sky is blue:", true)
        dummyQuiz.addQuestion(dummyQuestion1)
        val dummyQuestion2 = TrueFalse("dummyQuestion2", "The earth is round:", true)
        dummyQuiz.addQuestion(dummyQuestion2)
        val dummyQuestion3 = TrueFalse("dummyQuestion3", "Kotlin is the best language:", true)
        dummyQuiz.addQuestion(dummyQuestion3)
        Storage.createQuiz(dummyQuiz)

        selectedQuizName = "dummyQuiz" // get from shared preferences eventually
        selectedQuiz = Storage.getQuiz(selectedQuizName)
        response = QuizResponse(selectedQuizName)
    }
}