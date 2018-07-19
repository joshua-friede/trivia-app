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
        val dummyQuestion = TrueFalseTriviaQuestion("dummyQuestion1", "The sky is blue:", a)
        dummyQuiz.addQuestion(dummyQuestion)
        Storage.createQuiz(dummyQuiz)

        selectedQuizName = "dummyQuiz"
        selectedQuiz = Storage.getQuiz(selectedQuizName)
        response = QuizResponse(selectedQuizName)
    }
}