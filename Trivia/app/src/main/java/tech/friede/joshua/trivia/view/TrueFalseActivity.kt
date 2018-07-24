package tech.friede.joshua.trivia.view

import android.graphics.Color
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import kotlinx.android.synthetic.main.activity_true_false.*
import tech.friede.joshua.trivia.R
import tech.friede.joshua.trivia.controller.Session
import tech.friede.joshua.trivia.model.questions.TrueFalse



class TrueFalseActivity : QuestionActivity() {

    private val q: TrueFalse = Session.selectedQuiz.getQuestionN(Session.currentQuestion) as TrueFalse

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_true_false)

        question_text.text = q.text
    }

    fun onClick(v: View) {

        option_true.isClickable = false
        option_false.isClickable = false

        val answer = v.tag.toString().toBoolean()
        Session.response.putAnswer(q.id, answer)

        if(q.correctAnswer == answer) {
            Log.d("answered", "correct")
            v.setBackgroundColor(Color.GREEN)
            popupMessage(v, "Correct!")
        }
        else {
            Log.d("answered", "incorrect")
            option_true.setBackgroundColor(Color.RED)
            option_false.setBackgroundColor(Color.RED)
            tf_container.findViewWithTag<Button>(q.correctAnswer.toString()).setBackgroundColor(Color.GREEN)
            popupMessage(v, "Incorrect")
        }
    }

}
