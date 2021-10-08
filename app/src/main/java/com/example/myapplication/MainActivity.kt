 package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


 class MainActivity : AppCompatActivity() {

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addListenerOnText()
         intent = Intent(this,SignInActivity::class.java)
         startActivity(intent)

     }
     private fun addListenerOnText(){

          val editText1: TextView = findViewById(R.id.editText1)
          editText1.addTextChangedListener( object : TextWatcher {
             override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                     
             }

             override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

             }

              override fun afterTextChanged(s: Editable?) {


              }

          })

     }
 }

