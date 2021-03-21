package com.grnt.kotlinproje05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var personWeight = txtWeight.text
        var basicMath:BasicMath = BasicMath();

        btnCalc.setOnClickListener {
            println("personWeight " + personWeight.toString().toDouble() )
            if (personWeight != null) {
                    var result = basicMath.onMars(personWeight.toString().toDouble())
                    println(result)
                    tvResult.text = result.toString()
            }
        }


    }


}