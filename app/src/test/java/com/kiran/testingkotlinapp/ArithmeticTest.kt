package com.kiran.testingkotlinapp

import org.junit.Assert
import org.junit.Test

class ArithmeticTest {

    // Test method to test add function
    @Test
    fun testAddition(){
        val arithmetic = Arithmetic()
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
        val arithmetic = Arithmetic()
        arithmetic.first = 2
        arithmetic.second = 3

        val expectedResult = 5
        val actualResult = arithmetic.subtract()
        // Check weather two values are equal or not
        Assert.assertEquals(expectedResult,actualResult)
    }
}