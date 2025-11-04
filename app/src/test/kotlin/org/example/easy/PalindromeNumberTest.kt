package org.example.easy

import kotlin.test.Test
import org.junit.jupiter.api.Assertions

class PalindromeNumberTest {

    @Test
    fun testPalindromeNumber1() {
        val input = 121
        val result = isPalindrome(input)
        Assertions.assertEquals(true, result)
    }

    @Test
    fun testPalindromeNumber2() {
        val input = -121
        val result = isPalindrome(input)
        Assertions.assertEquals(false, result)
    }

    @Test
    fun testPalindromeNumber3() {
        val input = 10
        val result = isPalindrome(input)
        Assertions.assertEquals(false, result)
    }
}
