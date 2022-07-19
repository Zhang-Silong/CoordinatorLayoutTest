package com.example.coordinatorlayouttest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val normal = findViewById<Button>(R.id.normal)
        normal.setOnClickListener {
            startActivity(Intent(this, NormalActivity::class.java))
        }
    }
}