package tech.friede.joshua.trivia.controller

import tech.friede.joshua.trivia.model.Quiz
import tech.friede.joshua.trivia.model.QuizResponse
import tech.friede.joshua.trivia.model.questions.MultipleChoice
import tech.friede.joshua.trivia.model.questions.TrueFalse


object Session {

    var selectedQuizID: String
    var selectedQuiz: Quiz
    var response: QuizResponse
    var currentQuestion: Int = 1


    init {
        //dummy code

        val dummyQuiz = Quiz("000","Dummy Quiz", "This is a dummy quiz I created for testing purposes")
        val dummyQuestion1 = MultipleChoice("dummyQuestion1", "What color is the sky?", 'B', "yellow", "blue", "orange", "red")
        dummyQuiz.addQuestion(dummyQuestion1)
        val dummyQuestion2 = TrueFalse("dummyQuestion2", "The earth is round:", true)
        dummyQuiz.addQuestion(dummyQuestion2)
        val dummyQuestion3 = TrueFalse("dummyQuestion3", "Kotlin is the best language:", true)
        dummyQuiz.addQuestion(dummyQuestion3)
        Storage.createQuiz(dummyQuiz)

        selectedQuizID = "000" // get from shared preferences eventually
        selectedQuiz = Storage.getQuiz(selectedQuizID)
        response = QuizResponse(selectedQuizID)
    }
}