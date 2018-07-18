package tech.friede.joshua.trivia.controller

import tech.friede.joshua.trivia.model.*
import java.io.File
import java.io.FileReader
import java.io.FileWriter

class Backend {
    //val rootPath = ContextCompat.getFilesDir()
    //val userPath = rootPath + "/src/main/kotlin/edu/uiowa/cs/jsonbackend/users/"

    fun createQuiz(quiz:Quiz): Boolean {
        val file = File(quiz.name + ".json")
        if(file.isFile) return false
        file.writeText(GsonTools.UserToGson(quiz))
        return true
    }


}

object testBackend {
    @JvmStatic
    fun main(args: Array<String>) {
        val b = Backend()
        println(b.createQuiz(Quiz()))
    }
}