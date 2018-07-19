package tech.friede.joshua.trivia.view

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*
import tech.friede.joshua.trivia.R
import tech.friede.joshua.trivia.controller.Backend
import tech.friede.joshua.trivia.model.Quiz
import tech.friede.joshua.trivia.model.TrueFalseQuestion

class MainActivity : AppCompatActivity() {

    lateinit var selectedQuiz: Quiz

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        val backend = Backend()

        //dummy code
        val dummyQuiz = Quiz()
        val dummyQuestion = TrueFalseQuestion(0, "The sky is blue:")
        dummyQuiz.addQuestion(dummyQuestion)
        selectedQuiz = dummyQuiz//backend.getQuiz()
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

    fun startQuiz(v: View, q: Quiz = selectedQuiz) {
        val i = Intent(this, TrueFalseQuestionActivity::class.java)
        //i.putExtra("backend", backend);
        startActivity(i)
    }
}
