package tech.friede.joshua.trivia.model.questions

abstract class Question(val id: String, val text: String) {
    abstract val correctAnswer: Any
}