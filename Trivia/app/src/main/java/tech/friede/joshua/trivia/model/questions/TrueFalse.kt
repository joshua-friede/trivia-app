package tech.friede.joshua.trivia.model.questions

class TrueFalse(
        id: String,
        text: String,
        correctAnswer: Boolean
) : Question(
        id,
        text,
        correctAnswer
)
