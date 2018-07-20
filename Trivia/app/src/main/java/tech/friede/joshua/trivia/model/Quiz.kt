package tech.friede.joshua.trivia.model

import tech.friede.joshua.trivia.model.questions.Question

class Quiz {
    val id: String
    var title: String
    var description: String
    private val questions: ArrayList<Question>

    constructor(id: String, title: String, description: String) {
        this.id = id
        this.title = title
        this.description = description
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