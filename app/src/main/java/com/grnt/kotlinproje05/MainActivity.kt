package com.grnt.kotlinproje05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.CheckBox
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val MARS = "mars"
    val JUPITER = "jupiter"
    val VENUS = "venus"
    var activeplanet = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Glide.with(this).load(R.drawable.planets).into(imgTitle)

        if(savedInstanceState == null) return;
        tvResult.text = savedInstanceState.getString("result").toString()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("result",tvResult.text.toString())
    }

    fun handleChangePlanet(v: View) {
        var personWeight = txtWeight.text
        var basicMath: BasicMath = BasicMath()
        if (personWeight != null) {
            if (!TextUtils.isEmpty(personWeight)) {
                var result = ""
                when (v.id) {
                    R.id.rdyMars -> {
                        result =
                            basicMath.onMars(personWeight.toString().toDouble()).formatla(2)
                                .toString()
                    }
                    R.id.rdyVenus -> {
                        result =
                            basicMath.onVenus(personWeight.toString().toDouble()).formatla(2)
                                .toString()
                    }
                    R.id.rdyJupiter -> {
                        result = basicMath.onJupiter(personWeight.toString().toDouble()).formatla(2)
                            .toString()
                    }
                    else -> {
                        result =
                            basicMath.onMars(personWeight.toString().toDouble()).formatla(2)
                                .toString()
                    }
                }
                tvResult.text = result

            }
        }
    }


    fun Double.formatla(howMany: Int) = java.lang.String.format("%.${howMany}f", this)


}