package tech.friede.joshua.trivia.model

class Quiz {
    var name: String
    val questions: ArrayList<TriviaQuestion>

    constructor(name: String) {
        this.name = name
        this.questions = ArrayList()
    }

    fun addQuestion(q: TriviaQuestion): Boolean {
        return this.questions.add(q)
    }

    fun removeQuestionAt(index:Int): TriviaQuestion {
        return this.questions.removeAt(index)
    }

    fun questionsIterator(): Iterator<TriviaQuestion> {
        return this.questions.iterator()
    }

}