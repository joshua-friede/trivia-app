package tech.friede.joshua.trivia.view

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import tech.friede.joshua.trivia.R
import tech.friede.joshua.trivia.controller.Session
import tech.friede.joshua.trivia.model.QuizResponse

class Finished : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finished)
    }

    fun restartQuiz() {
        Session.currentQuestion = 0
        Session.response = QuizResponse(quizName = Session.selectedQuiz.name)
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
        finishAffinity()
    }

    fun next(v: View) {
        restartQuiz()
    }

    override fun onBackPressed() {
        restartQuiz()
    }


}
