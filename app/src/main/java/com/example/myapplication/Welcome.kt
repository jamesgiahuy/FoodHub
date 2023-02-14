package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class Welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val txtSignin = findViewById<TextView>(R.id.txtSignin)

        txtSignin.setOnClickListener(View.OnClickListener {
            val _intent = Intent(this,Login::class.java)
            startActivity(_intent)
        })
    }
}