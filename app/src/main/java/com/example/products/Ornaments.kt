package com.example.products

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Ornaments : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ornaments)

        val shellfishActivity = findViewById<Button>(R.id.oshbtn)
        shellfishActivity.setOnClickListener {
            val Intent = Intent(this,Coconut_shell_fish::class.java)
            startActivity(Intent)
        }

        val decotationActivity = findViewById<Button>(R.id.odbtn)
        decotationActivity.setOnClickListener {
            val Intent = Intent(this,Coconut_decorations::class.java)
            startActivity(Intent)
        }

        val jewalaryActivity = findViewById<Button>(R.id.orjbtn)
        jewalaryActivity.setOnClickListener {
            val Intent = Intent(this,coconut_jewelary::class.java)
            startActivity(Intent)
        }
    }
}