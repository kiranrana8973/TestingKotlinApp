package com.kiran.testingkotlinapp

import junit.framework.Assert.assertTrue
import org.junit.Assert
import org.junit.Test

class ArithmeticTest {

    private lateinit var arithmetic: Arithmetic
    // Test method to test add function

    @Test
    fun testAddition(){
        arithmetic = Arithmetic()
        arithmetic.first = 2
        arithmetic.second = 3

        val expectedResult = 5
        val actualResult = arithmetic.add()
        // Check weather two values are equal or not
        Assert.assertEquals(expectedResult,actualResult)
    }

    // Test method to test subtraction function
    @Test
    fun testSubtraction(){
        arithmetic = Arithmetic()
        arithmetic.first = 2
        arithmetic.second = 3

        val expectedResult = 5
        val actualResult = arithmetic.subtract()
        // Check weather two values are equal or not
        Assert.assertEquals(expectedResult,actualResult)
    }

    @Test
    fun testEvenNumber(){
        arithmetic = Arithmetic()
        val actualResult = arithmetic.checkEven(4)
        assertTrue(actualResult)
    }
}