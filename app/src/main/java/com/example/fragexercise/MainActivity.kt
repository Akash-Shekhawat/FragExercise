package com.example.fragexercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Get views reference
        val llbtn = findViewById<Button>(R.id.linearLayoutDemoBtn)
        val rlBtn = findViewById<Button>(R.id.relativeLayoutDemoBtn)
        val clBtn = findViewById<Button>(R.id.constraintLayoutDemoBtn)

        // open Linear layout demo activity
        llbtn.setOnClickListener {
            startActivity(Intent(this, LinearLayout::class.java))
        }

        // open Relative layout demo activity
        rlBtn.setOnClickListener {
            startActivity(Intent(this, Relative::class.java))
        }

        // open Linear layout demo activity
        clBtn.setOnClickListener {
            startActivity(Intent(this, ConstraintLayout::class.java))
        }
    }
}