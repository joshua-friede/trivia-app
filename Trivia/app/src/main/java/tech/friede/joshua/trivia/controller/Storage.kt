package tech.friede.joshua.trivia.controller

import android.app.Application
import android.util.Log
import tech.friede.joshua.trivia.model.Quiz
import tech.friede.joshua.trivia.model.QuizResponse
import tech.friede.joshua.trivia.view.MainActivity
import java.io.File

object Storage : Application() {

    private val path = MainActivity.c.filesDir.absolutePath//applicationContext.filesDir.absolutePath
    private val quizDir = path + File.separator + "quizzes"
    private val responses = File(path + "responses.json")

    init {
        val q = File(quizDir)
        if (!q.exists()) {
            q.mkdirs()
        }
        responses.delete()
    }

    fun createQuiz(quiz: Quiz): Boolean {
        val file = File(quizDir + File.separator + quiz.id + ".json")
        Log.d("storage", file.canWrite().toString() + " " + file.absolutePath)
        file.writeText(GSON.QuizToGson(quiz))
        return true
    }

    fun getQuiz(id: String): Quiz {
        val file = File(quizDir + File.separator + id + ".json")
        //if(!file.canRead()) return null
        val gsonQuiz = file.readText()
        return GSON.GsonToQuiz(gsonQuiz)
    }

    fun createResponse(response: QuizResponse) {
        responses.appendText(GSON.toGson(response) + "\n")
    }

    fun getResponses(): List<QuizResponse> {
        val r = mutableListOf<QuizResponse>()
        Log.d("responses", responses.readText())
        responses.forEachLine { r.add(GSON.GsonToQuizResponse(it)) }
        return r
    }

}