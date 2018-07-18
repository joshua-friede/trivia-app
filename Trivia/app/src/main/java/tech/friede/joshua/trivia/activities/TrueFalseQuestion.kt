package tech.friede.joshua.trivia.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import tech.friede.joshua.trivia.R

class TrueFalseQuestion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_true_false_question)
    }

    fun next(v: View) {
        val i = Intent(this, Finished::class.java)
        startActivity(i)
    }
}
