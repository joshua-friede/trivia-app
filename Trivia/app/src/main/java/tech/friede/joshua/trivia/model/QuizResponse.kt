package tech.friede.joshua.trivia.model

class QuizResponse {
    val surveyname: String
    var answers: HashMap<Int, Answer>

    constructor(surveyname: String, answers: HashMap<Int, Answer>) {
        this.surveyname = surveyname
        this.answers = answers
    }

    constructor(surveyname: String) {
        this.surveyname = surveyname
        this.answers = hashMapOf()
    }

    constructor() {
        this.surveyname = ""
        this.answers = hashMapOf<Int, Answer>()
    }

    fun addAnswer(answer: Answer): Answer? {
        return this.answers.put(answer.number, answer)
    }
}