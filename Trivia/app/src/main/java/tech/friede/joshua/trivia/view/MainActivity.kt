package tech.friede.joshua.trivia.view

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import tech.friede.joshua.trivia.R
import tech.friede.joshua.trivia.controller.Session
import tech.friede.joshua.trivia.model.Quiz
import tech.friede.joshua.trivia.model.QuizResponse
import tech.friede.joshua.trivia.model.TrueFalseAnswer
import tech.friede.joshua.trivia.model.TrueFalseTriviaQuestion

class MainActivity : QuizActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        //dummy code
        val dummyQuiz = Quiz("dummyQuiz")
        val a = TrueFalseAnswer("dummyQuestion1", true)
        val dummyQuestion = TrueFalseTriviaQuestion("dummyQuestion1", "The sky is blue:", a)
        dummyQuiz.addQuestion(dummyQuestion)

        Session.selectedQuiz = dummyQuiz//backend.getQuiz()
        Session.response = QuizResponse(quizName = Session.selectedQuiz.name)
        Session.currentQuestion = 0
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when(item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

}
