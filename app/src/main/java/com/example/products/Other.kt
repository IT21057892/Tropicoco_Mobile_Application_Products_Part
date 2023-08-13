package com.example.products

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Other : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        val coirfiberActivity = findViewById<Button>(R.id.opcfbtn)
        coirfiberActivity.setOnClickListener {
            val Intent = Intent(this,Coir_Fiber::class.java)
            startActivity(Intent)
        }

        val broomsActivity = findViewById<Button>(R.id.opbrbtn)
        broomsActivity.setOnClickListener {
            val Intent = Intent(this,Brooms::class.java)
            startActivity(Intent)
        }

        val strawBroomsActivity = findViewById<Button>(R.id.opspbrbtn)
        strawBroomsActivity.setOnClickListener {
            val Intent = Intent(this,Straw_Brooms::class.java)
            startActivity(Intent)
        }
    }
}