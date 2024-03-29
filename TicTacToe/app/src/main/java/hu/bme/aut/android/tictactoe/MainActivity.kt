package hu.bme.aut.android.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import hu.bme.aut.android.tictactoe.model.TicTacToeModel
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHighScore =
            findViewById<Button>(R.id.btnHighScore)
        btnHighScore.setOnClickListener {
            Toast.makeText(this, getString(R.string.toast_highscore), Toast.LENGTH_LONG)
        }

        val btnStart = findViewById<Button>(R.id.btnStart)
        btnStart.setOnClickListener {
            TicTacToeModel.resetModel()
            startActivity(Intent(this, GameActivity::class.java))
        }

        val btnAbout = findViewById<Button>(R.id.btnAbout)
        btnAbout.setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }
    }
}
