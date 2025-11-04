package org.example.easy

import kotlin.test.Test
import org.junit.jupiter.api.Assertions

class RomanIntegerTest {

    @Test
    fun testRomanIntegerTest() {
        val input = "II"
        val result = romanToInt(input)
        Assertions.assertEquals(2, result)
    }

    @Test
    fun testRomanIntegerTest2() {
        val input = "IV"
        val result = romanToInt(input)
        Assertions.assertEquals(4, result)
    }

    @Test
    fun testRomanIntegerTest3() {
        val input = "MCMXCIV"
        val result = romanToInt(input)
        Assertions.assertEquals(1994, result)
    }

    @Test
    fun testRomanIntegerTest4() {
        val input = "XI"
        val result = romanToInt(input)
        Assertions.assertEquals(11, result)
    }

}
