package tech.friede.joshua.trivia.view

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_true_false_question.*
import tech.friede.joshua.trivia.R
import tech.friede.joshua.trivia.controller.Session

class TrueFalseQuestionActivity : QuizActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_true_false_question)

        tf_question.text = Session.selectedQuiz.getQuestionN(Session.currentQuestion)!!.question
    }

}
