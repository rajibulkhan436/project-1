package com.rajibul.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var etName :EditText?=null
    var etAboutCollege :EditText?=null
    var etPhoneNumber :EditText?=null
    var btnValidate : Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etName=findViewById(R.id.etName)
        etAboutCollege=findViewById(R.id.etAboutCollege)
        etPhoneNumber=findViewById(R.id.etPhoneNumber)
        btnValidate=findViewById(R.id.btnValidate)

        btnValidate?.setOnClickListener{
            if(etName?.text.isNullOrEmpty()){
                etName?.error="Enter your Number"
            } else if (etAboutCollege?.text.isNullOrEmpty()){
                etAboutCollege?.error="Enter something about college"
            }else if (etPhoneNumber?.text.toString().length<10){
                etPhoneNumber?.error="enter your phone Number"
            }else{
                Toast.makeText(this, "Form Validated Successfully", Toast.LENGTH_LONG).show()
            }
        }

    }

    //function part here

}