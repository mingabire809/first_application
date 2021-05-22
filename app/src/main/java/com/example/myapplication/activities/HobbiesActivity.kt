package com.example.myapplication.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.adapters.HobbiesAdapter
import com.example.myapplication.R
import com.example.myapplication.models.Supplier
import kotlinx.android.synthetic.main.activity_hobbies.*

class HobbiesActivity: AppCompatActivity() {
    companion object{
        val TAG: String = HobbiesActivity::class.java.simpleName
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        setupRecycleView()


    }

    private fun setupRecycleView() {
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recycleView.layoutManager = layoutManager
        val adapter = HobbiesAdapter(this, Supplier.hobbies)
        recycleView.adapter = adapter
    }
}
