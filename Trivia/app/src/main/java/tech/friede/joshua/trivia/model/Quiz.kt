package tech.friede.joshua.trivia.model

import tech.friede.joshua.trivia.model.questions.Question

class Quiz {
    var id: String
    private val questions: ArrayList<Question>

    constructor(name: String) {
        this.id = name
        this.questions = ArrayList()
    }

    fun addQuestion(q: Question): Boolean {
        return this.questions.add(q)
    }

    fun getQuestionN(n: Int): Question? {
        return this.questions.getOrNull(n-1)
    }

    fun removeQuestionN(index:Int): Question {
        return this.questions.removeAt(index-1)
    }

}