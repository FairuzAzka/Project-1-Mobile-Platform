package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val enteryourname = findViewById<EditText>(R.id.enteryourname)
        val btnsayhello = findViewById<Button>(R.id.btnsayhello)
        val wellcome = findViewById<EditText>(R.id.welLcome)
        val btnnextmenu = findViewById<Button>(R.id.btnnextmenu)

        btnsayhello. setOnClickListener {
            val name = enteryourname.text.toString()
            wellcome.setText("Hello $name wellcome")

        }

        btnnextmenu. setOnClickListener {
            Intent(this, MenuUtama::class.java).also {
                startActivity(it)
            }
        }
    }
}