package tech.friede.joshua.trivia.model

abstract class TriviaQuestion {

    val id: String
    var question: String
    var correctAnswer: Answer

    constructor(id: String, question: String, correctAnswer: Answer) {
        this.id = id
        this.question = question
        this.correctAnswer = correctAnswer
    }

}