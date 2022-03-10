package com.example.mylist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val add : Button = findViewById(R.id.button)
        add.setOnClickListener {viewadd()}
    }

    private fun viewadd() {
        val intent = Intent(this, AddActivity::class.java)
        startActivity(intent)
    }

}