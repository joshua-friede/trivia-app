package tech.friede.joshua.trivia.model

class MultipleChoiceTriviaQuestion : TriviaQuestion {

    var A: String //we're going to use multiple choice with radio buttons
    var B: String
    var C: String
    var D: String

    constructor(id: String, question: String, A: String, B: String, C: String, D: String, correctAnswer: MultipleChoiceAnswer) : super(id, question, correctAnswer) {
        this.A = A
        this.B = B
        this.C = C
        this.D = D
    }

}