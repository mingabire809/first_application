package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnShowToast.setOnClickListener {
            Log.i("Main Activity", "Button was clicked !")
            Toast.makeText(this, "Button was Clicked!", Toast.LENGTH_SHORT).show()
        }
        btnSendMsgToNextActivity.setOnClickListener {

            val message: String = etUserMessage.text.toString()
            val intent = Intent(this,SecondActivity::class.java)  //explicit intent
            intent.putExtra("user_message",message)
            startActivity(intent)
        }
        
        btnsharetootherapps.setOnClickListener {
            val message: String = etUserMessage.text.toString()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,message)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Share to: "))
        }




    }

}