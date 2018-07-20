package tech.friede.joshua.trivia.model.questions

data class TrueFalse(val id: String, val text: String, val correctAnswer: Boolean) : Question(id, text, correctAnswer)
