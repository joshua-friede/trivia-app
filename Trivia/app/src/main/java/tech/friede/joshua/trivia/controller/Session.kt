package tech.friede.joshua.trivia.controller

import tech.friede.joshua.trivia.model.Quiz
import tech.friede.joshua.trivia.model.QuizResponse
import tech.friede.joshua.trivia.model.TrueFalseAnswer
import tech.friede.joshua.trivia.model.TrueFalseTriviaQuestion


object Session {

    lateinit var selectedQuizName: String
    lateinit var selectedQuiz: Quiz
    lateinit var response: QuizResponse
    var currentQuestion = 1


    init {
        //dummy code

        val dummyQuiz = Quiz("dummyQuiz")
        val a = TrueFalseAnswer("dummyQuestion1", true)
        val dummyQuestion1 = TrueFalseTriviaQuestion("dummyQuestion1", "The sky is blue:", a)
        dummyQuiz.addQuestion(dummyQuestion1)
        val dummyQuestion2 = TrueFalseTriviaQuestion("dummyQuestion2", "The earth is round:", a)
        dummyQuiz.addQuestion(dummyQuestion2)
        val dummyQuestion3 = TrueFalseTriviaQuestion("dummyQuestion3", "Kotlin is the best language:", a)
        dummyQuiz.addQuestion(dummyQuestion3)
        Storage.createQuiz(dummyQuiz)

        selectedQuizName = "dummyQuiz" // get from shared preferences eventually
        selectedQuiz = Storage.getQuiz(selectedQuizName)
        response = QuizResponse(selectedQuizName)
    }
}