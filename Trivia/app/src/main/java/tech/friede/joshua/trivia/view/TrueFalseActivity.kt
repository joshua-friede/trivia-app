package tech.friede.joshua.trivia.view

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_true_false.*
import tech.friede.joshua.trivia.R
import tech.friede.joshua.trivia.controller.Session

class TrueFalseActivity : QuestionActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_true_false)

        question_text.text = Session.selectedQuiz.getQuestionN(Session.currentQuestion)!!.text
    }

}
