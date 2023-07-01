package com.rajibul.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast

class CheckboxRadioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        var cbIAssure: CheckBox? = null

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkbox)

        cbIAssure = findViewById(R.id.cbIAssure)
        cbIAssure?.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Information verified", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Information not verified", Toast.LENGTH_LONG).show()
            }
        }
    }
}