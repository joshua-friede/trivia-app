package tech.friede.joshua.trivia.model

open abstract class Answer {
    val id: String
    abstract val answer: Any

    constructor(id: String) {
        this.id = id
    }

}