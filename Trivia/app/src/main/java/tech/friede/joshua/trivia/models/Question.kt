package tech.friede.joshua.trivia.models

abstract class Question {
    var number: Int
    var question : String

    constructor(number: Int, question: String) {
        this.number = number
        this.question = question
    }

    constructor() {
        this.number = 0
        this.question = ""
    }

}