package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val toProfile = findViewById<Button>(R.id.LoginToFrofile)
        toProfile.setOnClickListener(){
            clickLogIn()
        }


    }
    private fun clickLogIn(){
        val editEmail = findViewById<EditText>(R.id.editTextTextEmailAddressForLogIn)
        val editPassword = findViewById<EditText>(R.id.editTextTextPassword)
        if( editEmail.text.toString() == "hogiahuy@gmail.com" &&  editPassword.text.toString() == "123456"){
            startActivity(Intent(this, Profile::class.java))
        }
        else{
            Toast.makeText(this, "Login Failed!!!", Toast.LENGTH_SHORT).show()
        }
    }
}