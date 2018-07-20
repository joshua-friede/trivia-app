package tech.friede.joshua.trivia.view

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.view.View
import tech.friede.joshua.trivia.controller.Session
import tech.friede.joshua.trivia.model.questions.MultipleChoice
import tech.friede.joshua.trivia.model.questions.TrueFalse

abstract class QuestionActivity : AppCompatActivity() {

    fun next(v: View) {
        Session.currentQuestion++
        val i = Intent()

        when (Session.selectedQuiz.getQuestionN(Session.currentQuestion)) {
            is TrueFalse -> i.setClass(this, TrueFalseActivity::class.java)
            is MultipleChoice -> i.setClass(this, MultipleChoice::class.java)
            else -> i.setClass(this, Finished::class.java)
        }
        startActivity(i)
        finish()
    }

}