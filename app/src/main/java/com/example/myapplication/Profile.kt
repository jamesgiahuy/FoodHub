package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class Profile:AppCompatActivity(){
    private lateinit var profileFUllName: EditText
    private lateinit var editInformation:EditText
    private lateinit var profileEmail:EditText
    private lateinit var profilePhone:EditText
    private lateinit var profileName: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        showDialogEditText()
    }
    private fun showDialogEditText(){
        profileFUllName = findViewById(R.id.fullNameProfile)
        profileEmail = findViewById(R.id.emailProfile)
        profilePhone = findViewById(R.id.phoneProfile)
        profileName = findViewById(R.id.textView24)


        profileFUllName.setOnClickListener(){
            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.dialog, null)
            editInformation = dialogLayout.findViewById<EditText>(R.id.changeInforation)
            with (builder) {

                setPositiveButton(R.string.confirm){dialog, which ->
                    confirmName()
                }
                setNegativeButton(R.string.cancel){dialog, which ->
                    Log.d("Main", "Negative Button Clicked")
                }
                setView(dialogLayout)
                show()
            }

        }

        profileEmail.setOnClickListener(){
            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.dialog, null)


            editInformation = dialogLayout.findViewById<EditText>(R.id.changeInforation)


            with (builder) {

                setPositiveButton(R.string.confirm){dialog, which ->
                    confirmEmail()
                }
                setNegativeButton(R.string.cancel){dialog, which ->
                    Log.d("Main", "Negative Button Clicked")
                }
                setView(dialogLayout)
                show()
            }

        }

        profilePhone.setOnClickListener(){
            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.dialog, null)
            editInformation = dialogLayout.findViewById<EditText>(R.id.changeInforation)
            with (builder) {

                setPositiveButton(R.string.confirm){dialog, which ->
                    confirmPhone()
                }
                setNegativeButton(R.string.cancel){dialog, which ->
                    Log.d("Main", "Negative Button Clicked")
                }
                setView(dialogLayout)
                show()
            }
        }




    }
    private fun confirmName(){
        if (editInformation.text.isNullOrBlank()){
            Toast.makeText(this, "Blank", Toast.LENGTH_SHORT).show()
        }
        else{
            profileFUllName.text = editInformation.text
            profileName.text = editInformation.text.toString()

        }
    }

    private fun confirmEmail(){
        if (editInformation.text.isNullOrBlank()){
            Toast.makeText(this, "Blank", Toast.LENGTH_SHORT).show()
        }
        else{
            profileEmail.text = editInformation.text
        }
    }

    private fun confirmPhone(){
        if (editInformation.text.isNullOrBlank()){
            Toast.makeText(this, "Blank", Toast.LENGTH_SHORT).show()
        }
        else{
            profilePhone.text = editInformation.text
        }
    }


}