package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class Onboard3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard3)
        val btnGo = findViewById<ImageView>(R.id.btnGo)

        btnGo.setOnClickListener(View.OnClickListener {
            val _intent = Intent(this,Welcome::class.java)
            startActivity(_intent)
        })
    }
}