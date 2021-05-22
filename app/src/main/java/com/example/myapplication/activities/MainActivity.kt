package com.example.myapplication.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.Constants
import com.example.myapplication.R
import com.example.myapplication.showToast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    companion object{
        val TAG: String = MainActivity::class.java.simpleName
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnShowToast.setOnClickListener {
            Log.i(TAG,"Button was clicked !")
            showToast("Button was clicked !", Toast.LENGTH_LONG)

        }
        btnSendMsgToNextActivity.setOnClickListener {

            val message: String = etUserMessage.text.toString()
            val intent = Intent(this, SecondActivity::class.java)  //explicit intent
            intent.putExtra(Constants.USER_MSG_KEY,message)
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

       btnRecycleView.setOnClickListener {
           val intent = Intent(this, HobbiesActivity::class.java)
           startActivity(intent)
       }
    }
}