package tech.friede.joshua.trivia.view

import android.os.Bundle
import android.util.Log
import android.view.View
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
        val answer = v.tag.toString().toBoolean()
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
