package tech.friede.joshua.trivia.model

class MultipleChoiceAnswer : Answer {
    override var answer: Char

    constructor(number: Int, answer: Char) : super(number) {
        this.answer = answer
    }

    constructor() : super(0) {
        this.answer = "A".single()
    }
}
