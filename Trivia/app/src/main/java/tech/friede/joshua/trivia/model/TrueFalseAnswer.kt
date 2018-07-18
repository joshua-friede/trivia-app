package tech.friede.joshua.trivia.model

class TrueFalseAnswer : Answer {
    override var answer: Boolean

    constructor(number: Int, answer: Boolean) : super(number) {
        this.answer = answer
    }

    constructor() : super(0) {
        this.answer = false
    }


}
