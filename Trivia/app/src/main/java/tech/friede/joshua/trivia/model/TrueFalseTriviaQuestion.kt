package tech.friede.joshua.trivia.model

class TrueFalseTriviaQuestion : TriviaQuestion {
    constructor(id: String, question: String, correctAnswer: TrueFalseAnswer) : super(id, question, correctAnswer)
}
