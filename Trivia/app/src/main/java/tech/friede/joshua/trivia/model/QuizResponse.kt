package tech.friede.joshua.trivia.model

data class QuizResponse(val quizid: String) {

    private val answerSheet: HashMap<String, Any> = hashMapOf()

    fun putAnswer(questionid: String, answer: Any) {
        answerSheet[questionid] = answer
    }

    fun getAnswers(): HashMap<String, Any> {
        return this.answerSheet
    }
}