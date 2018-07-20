package tech.friede.joshua.trivia.model.questions

data class MultipleChoice(val id: String, val question: String, val A: String, val B: String, val C: String, val D: String, val correctAnswer: Char) : Question(id, question, correctAnswer)