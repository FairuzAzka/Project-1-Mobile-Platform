package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuUtama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_utama)

        val btnmenu2 = findViewById<Button>(R.id.btnmenu2)
        val btnmenukalkulator = findViewById<Button>(R.id.btnmenukalkulator)
        val btncreator = findViewById<Button>(R.id.btncreator)
        val btnkembali = findViewById<Button>(R.id.btnkembali)

        btnmenu2. setOnClickListener {
            Intent(this, Treasure::class.java).also {
                startActivity(it)
            }
        }

        btnmenukalkulator. setOnClickListener {
            Intent(this, Kalkulator::class.java).also {
                startActivity(it)
            }
        }

        btncreator. setOnClickListener {
            Intent(this, Creator::class.java).also {
                startActivity(it)
            }
        }

        btnkembali.setOnClickListener {
            finish()
        }
    }
}