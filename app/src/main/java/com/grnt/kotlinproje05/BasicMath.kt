package com.grnt.kotlinproje05

class BasicMath {

    private val KILO_TO_POUND:Double = 2.2045
    private val POUND_TO_KILO:Double = 0.45359237
    private val MARS:Double = 0.38
    private fun kilotoPound(kilo:Double): Double {
        return kilo * KILO_TO_POUND
    }
    private fun PoundToKilo(pound:Double): Double {
        return pound * POUND_TO_KILO
    }

    fun onMars(kilo:Double):Double{
        var pound = this.kilotoPound(kilo)
        var _kilo = pound * MARS
        return this.PoundToKilo(_kilo)
    }
}