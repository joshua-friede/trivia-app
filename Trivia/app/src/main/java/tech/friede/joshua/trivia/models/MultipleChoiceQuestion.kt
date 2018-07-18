package tech.friede.joshua.trivia.models

class MultipleChoiceQuestion : Question {

    var A: String //we're going to use multiple choice with radio buttons
    var B: String
    var C: String
    var D: String

    constructor(number: Int, question: String, A: String, B: String, C: String, D: String) : super(number, question) {
        this.A = A
        this.B = B
        this.C = C
        this.D = D
    }

    constructor() : super(0, "") {
        A="";B="";C="";D=""
    }

}