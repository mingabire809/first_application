package com.example.myapplication.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.Constants
import com.example.myapplication.R
import com.example.myapplication.showToast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity: AppCompatActivity() {
    companion object{
        val TAG: String = SecondActivity::class.java.simpleName
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //Safe Call ?.
        //Safe Call with let  ?.let{ }

       val bundle: Bundle? = intent.extras
        bundle?.let {

            val msg = bundle.getString(Constants.USER_MSG_KEY)
            if (msg != null) {
                showToast(msg)
            }
            txtUserMessage.text = msg
        }

        //Toast.makeText(this, msg,Toast.LENGTH_SHORT).show()

    }
}