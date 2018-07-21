package tech.friede.joshua.trivia.view


import android.os.Bundle
import android.util.Log
import android.view.View
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
        val answer = v.tag.toString().single()
        Session.response.putAnswer(q.id, answer)

        if(q.correctAnswer == answer) {
            Log.d("answered", "correct")
            next(v)
        }
        else {
            Log.d("answered", "incorrect")
        }
    }
}
