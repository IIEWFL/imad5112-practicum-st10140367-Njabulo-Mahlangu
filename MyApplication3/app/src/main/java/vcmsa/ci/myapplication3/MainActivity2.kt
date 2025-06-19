package vcmsa.ci.myapplication3

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.system.exitProcess

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

    }
private lateinit var Button:Button
    private lateinit var questionTextView: TextView
    private lateinit var Button: Button
    private lateinit var EditText: TextView
    private lateinit var button: Button
    private var score=0

    companion object {
        val questions = arrayOf(
            " Harry styles, As it was; Rating 4 ;comments Blues"
            "Lizzo, Truth hurt; Rating 3 ;comments RNB"
            "Harry Nilsson, Without you; Rating 5 ;comments; Best love song"
            "Carly Simon, You're So Vain; Rating 2; comments; Rap"

        )
        val answers = booleanArrayOf(true, true, true, true)
    }

    private var currentQuestionIndex = 0
    private var score = 0

    exitButton.setOnClickListener{
        finishAffinity()//terminate the app
        exitProcess(0)

val mainbutton6 = findViewById<Button>(R.id.mainbutton6)
        val exitbutton= findViewById<Button>(R.id.exitbtn)