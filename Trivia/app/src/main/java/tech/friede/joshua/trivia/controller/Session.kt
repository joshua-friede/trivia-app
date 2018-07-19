package tech.friede.joshua.trivia.controller

import tech.friede.joshua.trivia.model.Quiz
import tech.friede.joshua.trivia.model.QuizResponse

object Session {
    lateinit var selectedQuiz: Quiz
    lateinit var response: QuizResponse
    var currentQuestion: Int = 0
    val backend = Backend()
}