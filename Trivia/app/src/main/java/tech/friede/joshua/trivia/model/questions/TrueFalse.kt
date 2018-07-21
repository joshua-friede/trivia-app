package tech.friede.joshua.trivia.model.questions

class TrueFalse(
        id: String,
        text: String,
        override val correctAnswer: Boolean
) : Question(
        id,
        text
)
