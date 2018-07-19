package tech.friede.joshua.trivia.model

class TrueFalseAnswer : Answer {
    override var answer: Boolean

    constructor(questionID: String, answer: Boolean) : super(questionID) {
        this.answer = answer
    }
}
