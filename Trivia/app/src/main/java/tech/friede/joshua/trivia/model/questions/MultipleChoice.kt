package tech.friede.joshua.trivia.model.questions

class MultipleChoice(
        id: String,
        text: String,
        val A: String,
        val B: String,
        val C: String,
        val D: String,
        correctAnswer: Char
) : Question(
        id,
        text,
        correctAnswer
)