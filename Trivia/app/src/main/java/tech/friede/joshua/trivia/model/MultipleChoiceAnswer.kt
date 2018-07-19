package tech.friede.joshua.trivia.model

class MultipleChoiceAnswer : Answer {
    override var answer: Char

    constructor(id: String, answer: Char) : super(id) {
        this.answer = answer
    }

}
