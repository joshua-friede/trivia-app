package tech.friede.joshua.trivia.model

class QuizResponse {
    val quizid: String
    var answerSheet: HashMap<String, Any>

    constructor(quizName: String) {
        this.quizid = quizName
        this.answerSheet = hashMapOf()
    }

    fun addAnswer(questionid: String, answer: Any) {
        answerSheet[questionid] = answer
    }
}