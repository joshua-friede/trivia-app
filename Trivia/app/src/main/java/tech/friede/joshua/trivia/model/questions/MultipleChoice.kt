package tech.friede.joshua.trivia.model.questions

class MultipleChoice(
        id: String,
        text: String,
        override val correctAnswer: Char,
        val A: String,
        val B: String,
        val C: String,
        val D: String
) : Question(
        id,
        text
)