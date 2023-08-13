package com.example.products

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class Liquids : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liquids)

        val cocoilActivity = findViewById<Button>(R.id.lcobtn)
        cocoilActivity.setOnClickListener {
            val Intent = Intent(this,Coconut_Oil::class.java)
            startActivity(Intent)
        }

        val cocomilkActivity = findViewById<Button>(R.id.lcmbtn)
        cocomilkActivity.setOnClickListener {
            val Intent = Intent(this,Coconut_Milk::class.java)
            startActivity(Intent)
        }

        val cocovinigerActivity = findViewById<Button>(R.id.lcvbtn)
        cocovinigerActivity.setOnClickListener {
            val Intent = Intent(this,Coconut_Viniger::class.java)
            startActivity(Intent)
        }

    }
}