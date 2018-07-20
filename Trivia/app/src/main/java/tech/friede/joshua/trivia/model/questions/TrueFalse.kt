package tech.friede.joshua.trivia.model.questions

class TrueFalse : Question {
    constructor(id: String, question: String, correctAnswer: Boolean) : super(id, question, correctAnswer)
}
