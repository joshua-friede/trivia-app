package tech.friede.joshua.trivia.models

open abstract class Answer {
    val number: Int
    abstract val answer: Any

    constructor(number: Int) {
        this.number = number
    }

    constructor() {
        this.number = 0
    }
}