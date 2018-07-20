package tech.friede.joshua.trivia.view


import android.os.Bundle
import kotlinx.android.synthetic.main.activity_multiple_choice.*
import tech.friede.joshua.trivia.R
import tech.friede.joshua.trivia.controller.Session
import tech.friede.joshua.trivia.model.questions.MultipleChoice

class MultipleChoiceActivity : QuestionActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiple_choice)

        val q = Session.selectedQuiz.getQuestionN(Session.currentQuestion) as MultipleChoice
        question_text.text = q.text
        option_a.text = q.A
        option_b.text = q.B
        option_c.text = q.C
        option_d.text = q.D
    }
}
