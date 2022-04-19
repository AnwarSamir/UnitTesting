package com.asi.unittesting

import android.util.Log
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class CalculatorTest {

    lateinit var calculator: Calculator

    @Mock
    lateinit var operator:Operators

    @Before
    fun setUp() {
        calculator = Calculator(operator)
    }

    @Test
    fun `given valid input to add must call add operator`(){
        val num1 = 10
        val num2  = 20
        calculator.addTwoNumbers(num1,num2)
        verify(operator).add(num1,num2) // verify if add called or not
    }

    @Test
    fun `given valid input to multiply must call multiply operator`(){
        val num1 = 1;
        val num2 = 2;
        calculator.multiplyTwoNumbers(num1,num2)
        verify(operator).multiply(num1,num2)
    }

    @After
    fun tearDown() {
    }



}