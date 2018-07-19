package tech.friede.joshua.trivia.view

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import tech.friede.joshua.trivia.R

class Finished : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finished)
    }

    fun reset(v: View) {
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
        finish()
    }


}
