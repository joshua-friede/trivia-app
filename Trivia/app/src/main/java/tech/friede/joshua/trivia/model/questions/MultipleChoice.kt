package tech.friede.joshua.trivia.model.questions

class MultipleChoice(id: String, question: String, A: String, B: String, C: String, D: String, correctAnswer: Char) : Question(id, question, correctAnswer)