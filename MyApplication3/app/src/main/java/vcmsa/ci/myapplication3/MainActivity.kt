package vcmsa.ci.myapplication3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        }
        val button=findViewById<Button>(R.id.button1)
        val button2= findViewById<Button>(R.id.button2)
        val exit =findViewById<Button>(R.id.exitbtn)

// set click listener for the start button
         Button.setOnClickListener
        val intent = Intent(this, mainactivity2::class.java)


         Exitbtn.setOnclickListener
        exitProcess(status 0 )






