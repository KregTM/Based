package com.ubisoft.based.calculator

class CalculatorViewModel {
    private var currentFirstString: String = ""
    private var currentSecondString: String = ""


    fun plus(): Int {
        checkParameters()
        return currentFirstString.toInt() + currentSecondString.toInt()
    }

    fun minus(): Int {
        checkParameters()
        return currentFirstString.toInt() - currentSecondString.toInt()
    }

    fun multiply(): Int {
        checkParameters()
        return currentFirstString.toInt() * currentSecondString.toInt()
    }

    fun divide(): Int {
        checkParameters()
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

    fun checkParameters(){
        if (currentFirstString == "" || currentSecondString == "") {
            throw Exception("2к узник не может справиться с калькулятором - всё ещё база.")
        }
    }
}