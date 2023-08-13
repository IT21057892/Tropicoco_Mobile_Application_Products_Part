package com.example.products

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Sweets : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sweets)

        val cakeActivity = findViewById<Button>(R.id.scbtn)
        cakeActivity.setOnClickListener {
            val Intent = Intent(this,Coconut_Cake::class.java)
            startActivity(Intent)
        }

        val toffeeActivity = findViewById<Button>(R.id.stbtn)
        toffeeActivity.setOnClickListener {
            val Intent = Intent(this,Coconut_Toffee::class.java)
            startActivity(Intent)
        }

        val chocalateActivity = findViewById<Button>(R.id.schbtn)
        chocalateActivity.setOnClickListener {
            val Intent = Intent(this,Coconut_Chocolate::class.java)
            startActivity(Intent)
        }
    }
}