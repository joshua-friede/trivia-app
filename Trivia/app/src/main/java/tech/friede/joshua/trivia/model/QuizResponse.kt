package tech.friede.joshua.trivia.model

class QuizResponse {
    val quizName: String
    var answers: HashMap<String, Answer>

    constructor(quizName: String, answers: HashMap<String, Answer>) {
        this.quizName = quizName
        this.answers = answers
    }

    constructor(quizName: String) {
        this.quizName = quizName
        this.answers = hashMapOf()
    }

    fun addAnswer(answer: Answer): Answer? {
        return this.answers.put(answer.id, answer)
    }
}