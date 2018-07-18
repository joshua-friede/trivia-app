package tech.friede.joshua.trivia.controller

import tech.friede.joshua.trivia.model.*
import java.io.File

class Backend {
    //val rootPath = ContextCompat.getFilesDir()
    //val userPath = rootPath + "/src/main/kotlin/edu/uiowa/cs/jsonbackend/users/"

    fun createQuiz(quiz:Quiz): Boolean {
        val file = File(quiz.name + ".json")
        if(file.isFile) return false
        file.writeText(GSON.QuizToGson(quiz))
        return true
    }

    fun getQuiz(name:String): Quiz? {
        val file = File(name + ".json")
        if(!file.canRead()) return null
        val gsonQuiz = file.readText()
        return GSON.GsonToQuiz(gsonQuiz)
    }

}