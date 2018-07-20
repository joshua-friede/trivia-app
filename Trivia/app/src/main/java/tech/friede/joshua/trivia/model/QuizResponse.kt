package tech.friede.joshua.trivia.model

class QuizResponse {
    val quizName: String
    var answerSheet: HashMap<String, Any>

    constructor(quizName: String) {
        this.quizName = quizName
        this.answerSheet = hashMapOf()
    }

    fun addAnswer(questionid: String, answer: Any) {
        answerSheet.put(questionid, answer)
    }
}