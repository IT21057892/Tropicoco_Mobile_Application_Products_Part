package com.example.products
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.SearchView
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.products.databinding.ActivityBroomsBinding
import com.example.products.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val liquidActivity = findViewById<Button>(R.id.lbtn)
        liquidActivity.setOnClickListener {
            val Intent = Intent(this,Liquids::class.java)
            startActivity(Intent)
        }

        val sweetActivity = findViewById<Button>(R.id.sbtn)
        sweetActivity.setOnClickListener {
            val Intent = Intent(this,Sweets::class.java)
            startActivity(Intent)
        }

        val ornamentsActivity = findViewById<Button>(R.id.obtn)
        ornamentsActivity.setOnClickListener {
            val Intent = Intent(this,Ornaments::class.java)
            startActivity(Intent)
        }

        val otherActivity = findViewById<Button>(R.id.othbtn)
        otherActivity.setOnClickListener {
            val Intent = Intent(this,Other::class.java)
            startActivity(Intent)
        }

    }
}