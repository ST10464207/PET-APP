package com.example.mypet

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

//variable
    lateinit var buttonstart: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonstart=findViewById(R.id.bstart)
//onclick button
        buttonstart.setOnClickListener {

            val intent1= Intent(this, ControlActivity::class.java)
            startActivity(intent1)
        }

        }


    }





