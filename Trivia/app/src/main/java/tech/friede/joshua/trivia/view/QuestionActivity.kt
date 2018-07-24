package tech.friede.joshua.trivia.view

import android.content.Intent
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_true_false.*
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

    fun popupMessage(v: View, message: String) {
        // make snackbar bigger, use larger font size, and always fill parent width
        val params = v.layoutParams
        params.width = FrameLayout.LayoutParams.MATCH_PARENT
        var snackbar = Snackbar.make(v, message, Snackbar.LENGTH_INDEFINITE).setAction("Next >") { next(v) }
        snackbar.view.layoutParams.width = FrameLayout.LayoutParams.MATCH_PARENT
        snackbar.view.layoutParams.height = FrameLayout.LayoutParams.WRAP_CONTENT
        val sbText= snackbar.view.findViewById<TextView>(android.support.design.R.id.snackbar_text)
        sbText.textSize = 32.toFloat()
        snackbar.view.findViewById<Button>(android.support.design.R.id.snackbar_action).textSize = 32.toFloat()
        
        snackbar.show()
    }

}