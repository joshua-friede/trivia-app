package tech.friede.joshua.trivia.model

class Quiz {
    var name: String
    val questions: HashMap<Int, Question>

    constructor(name: String, questions: HashMap<Int, Question>) {
        this.name = name
        this.questions = questions
    }

    constructor(name: String) {
        this.name = name
        this.questions = hashMapOf()
    }

    constructor() {
        this.name = ""
        this.questions = hashMapOf()
    }

    fun addQuestion(q: Question):Question? {
        return this.questions.put(q.number, q)
    }

    fun deleteQuestion(number:Int): Question? {
        return this.questions.remove(number)
    }

}