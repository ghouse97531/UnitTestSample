package com.example.unittestsample

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class CalculatorTest {

    private lateinit var calculator: Calculator

    @Before
    fun init() {
        calculator = Calculator()
    }

    @Test
    fun additionTest() {
        val result = calculator.add(2, 4)
        assertEquals(6, result)
    }

    @Test
    fun subtractionTest() {
        val result = calculator.subtract(10, 5)
        assertEquals(5, result)
    }

    @Test
    fun multiplyTest() {
        val result = calculator.multiply(10, 5)
        assertEquals(50, result)
    }

    @Test
    fun divisionTest() {
        val result = calculator.divide(10, 5)
        assertEquals(2, result)
    }
}