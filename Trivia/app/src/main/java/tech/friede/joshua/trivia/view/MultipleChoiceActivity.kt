package tech.friede.joshua.trivia.view


import android.graphics.Color
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.util.Log
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_multiple_choice.*
import tech.friede.joshua.trivia.R
import tech.friede.joshua.trivia.controller.Session
import tech.friede.joshua.trivia.model.questions.MultipleChoice

class MultipleChoiceActivity : QuestionActivity() {

    private val q: MultipleChoice = Session.selectedQuiz.getQuestionN(Session.currentQuestion) as MultipleChoice

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiple_choice)

        question_text.text = q.text
        option_a.text = q.A
        option_b.text = q.B
        option_c.text = q.C
        option_d.text = q.D
    }

    fun onClick(v: View) {

        option_a.isClickable = false
        option_b.isClickable = false
        option_c.isClickable = false
        option_d.isClickable = false

        val answer = v.tag.toString().single()
        Session.response.putAnswer(q.id, answer)

        if(q.correctAnswer == answer) {
            Log.d("answered", "correct")
            v.setBackgroundColor(Color.GREEN)
            Snackbar.make(mc_container, "Correct!", Snackbar.LENGTH_INDEFINITE).setAction("Next") { next(v) }.show()
        }
        else {
            Log.d("answered", "incorrect")
            option_a.setBackgroundColor(Color.RED)
            option_b.setBackgroundColor(Color.RED)
            option_c.setBackgroundColor(Color.RED)
            option_d.setBackgroundColor(Color.RED)
            mc_container.findViewWithTag<Button>(q.correctAnswer.toString()).setBackgroundColor(Color.GREEN)
            Snackbar.make(mc_container, "Incorrect", Snackbar.LENGTH_INDEFINITE).setAction("Next") { next(v) }.show()
        }
    }
}
