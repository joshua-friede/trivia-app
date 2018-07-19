package tech.friede.joshua.trivia.controller
import android.app.Application
import tech.friede.joshua.trivia.model.Quiz
import tech.friede.joshua.trivia.view.MainActivity
import java.io.File

object Storage: Application() {

    private val path = MainActivity.c.filesDir.absolutePath//applicationContext.filesDir.absolutePath

    fun createQuiz(quiz:Quiz): Boolean {
        val file = File(path + quiz.name + ".json")
        if(file.isFile) return false
        file.writeText(GSON.QuizToGson(quiz))
        return true
    }

    fun getQuiz(name:String): Quiz {
        val file = File(path + name + ".json")
        //if(!file.canRead()) return null
        val gsonQuiz = file.readText()
        return GSON.GsonToQuiz(gsonQuiz)
    }

}