package tech.friede.joshua.trivia.model

class Quiz {
    var name: String
    private val questions: ArrayList<TriviaQuestion>

    constructor(name: String) {
        this.name = name
        this.questions = ArrayList()
    }

    fun addQuestion(q: TriviaQuestion): Boolean {
        return this.questions.add(q)
    }

    fun getQuestionN(n: Int): TriviaQuestion? {
        return this.questions.getOrNull(n-1)
    }

    fun removeQuestionN(index:Int): TriviaQuestion {
        return this.questions.removeAt(index-1)
    }

}