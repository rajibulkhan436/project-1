package com.rajibul.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox

class CheckboxRadioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        var cbIAssure: CheckBox?=null

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkbox)
        cbIAssure=findViewById(R.id.cbIAssure)


    }
}