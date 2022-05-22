package com.ubisoft.based.calculator

class CalculatorViewModel {
    private var currentFirstString: String = " "
    private var currentSecondString: String = " "


    fun plus(): Int {
        return currentFirstString.toInt() + currentSecondString.toInt()
    }

    fun minus(): Int {
        return currentFirstString.toInt() - currentSecondString.toInt()
    }

    fun multiply(): Int {
        return currentFirstString.toInt() * currentSecondString.toInt()
    }

    fun divide(): Int {
        val second = currentSecondString.toInt()
        if (second != 0){
            return currentFirstString.toInt() / currentSecondString.toInt()
        } else {
            throw Exception("Not based")
        }


    }

    fun refreshFirst(value: String) {
        currentFirstString = value
    }

    fun refreshSecond(value: String) {
        currentSecondString = value
    }
}