package com.example.linah_alkhurayyif_persistentcalculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var multiplicationResult =0f
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submit.setOnClickListener {
            if (doublenum.text.toString() == "" || floatnum.text.toString() == "") {
                Toast.makeText(this, "Please enter a valid", Toast.LENGTH_SHORT).show()

            }else{
                result.isVisible = true
                multiplicationResult = doublenum.text.toString().toFloat() * floatnum.text.toString().toFloat()
                resultText.text= multiplicationResult.toString()

                }

        }
    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putFloat("multiplicationResult", multiplicationResult)
    }
    override fun onRestoreInstanceState(savedInstanceState: Bundle){
        super.onRestoreInstanceState(savedInstanceState)
        multiplicationResult = savedInstanceState.getFloat("multiplicationResult", 0f)
        resultText.text= multiplicationResult.toString()
    }
}