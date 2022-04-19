package com.asi.unittesting

class Calculator(private val operator:Operators) {
     fun addTwoNumbers(a: Int, b: Int): Int = operator.add(a, b)

    fun subtractTwoNumbers(a: Int, b: Int): Int = operator.subtract(a, b)

    fun multiplyTwoNumbers(a: Int, b: Int): Int = operator.multiply(a, b)

    fun divideTwoNumbers(a: Int, b: Int): Int = operator.divide(a, b)
}