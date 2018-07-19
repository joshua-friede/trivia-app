package tech.friede.joshua.trivia.view

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.view.View
import tech.friede.joshua.trivia.controller.Session
import tech.friede.joshua.trivia.model.MultipleChoiceTriviaQuestion
import tech.friede.joshua.trivia.model.TrueFalseTriviaQuestion

abstract class QuizActivity: AppCompatActivity() {

    fun next(v: View) {
        Session.currentQuestion++
        val i = Intent()

        when( Session.selectedQuiz.getQuestionN(Session.currentQuestion) ) {
            is TrueFalseTriviaQuestion -> i.setClass(this, TrueFalseQuestionActivity::class.java)
            is MultipleChoiceTriviaQuestion -> i.setClass(this, MultipleChoiceTriviaQuestion::class.java)
            else -> i.setClass(this, Finished::class.java)
        }
        startActivity(i)
    }

    override fun onBackPressed() {
        Session.currentQuestion--
        super.onBackPressed()
    }
}