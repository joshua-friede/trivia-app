package tech.friede.joshua.trivia.view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import tech.friede.joshua.trivia.R
import tech.friede.joshua.trivia.controller.Session
import tech.friede.joshua.trivia.model.questions.MultipleChoice
import tech.friede.joshua.trivia.model.questions.TrueFalse

class MainActivity : AppCompatActivity() {

    companion object {
        lateinit var c: Context
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
    }

    override fun onResume() {
        super.onResume()
        c = applicationContext
        quiz_title.text = Session.selectedQuiz.title
        quiz_description.text = Session.selectedQuiz.description
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

    fun start(v: View) {
        Session.currentQuestion = 1

        val i = Intent()
        when( Session.selectedQuiz.getQuestionN(Session.currentQuestion) ) {
            is TrueFalse -> i.setClass(this, TrueFalseActivity::class.java)
            is MultipleChoice -> i.setClass(this, MultipleChoiceActivity::class.java)
            else -> i.setClass(this, Finished::class.java)
        }
        startActivity(i)

    }

}
