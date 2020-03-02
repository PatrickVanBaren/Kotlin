package com.example.myapplication

import org.junit.Assert
import org.junit.Before
import org.junit.Test


class ExampleUnitTest {

    public val mCalculator = Calc()

    @Before
    open fun init(): Unit {
        simpleCalculator = SimpleCalculator()
    }

    @Test
    fun sumText() {
        Assert.assertEquals("Failed", 10, simpleCalculator.sum(5, 5))
    }

    @Test
    fun diffTest() {
        Assert.assertEquals("Failed", 0, simpleCalculator.diff(5, 5))
    }

    @Test
    fun multiplyText() {
        Assert.assertEquals("Failed", 25, simpleCalculator.multiply(5, 5))
    }

    @Test
    fun divText() {
        Assert.assertEquals("Failed", 1, simpleCalculator.div(5, 5))
    }

}
