package tech.friede.joshua.trivia.model.questions

abstract class Question {

    val id: String
    var question: String
    var correctAnswer: Any

    constructor(id: String, question: String, correctAnswer: Any) {
        this.id = id
        this.question = question
        this.correctAnswer = correctAnswer
    }

}