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

    @Test
    fun testPalindromeNumberWIthBigInteger() {
        val input = 2147483647
        val result = isPalindromeBigInt(input)
        Assertions.assertEquals(false, result)
    }

    @Test
    fun testPalindromeNumberWIthBigInteger1() {
        val input = 12321
        val result = isPalindromeBigInt(input)
        Assertions.assertEquals(true, result)
    }

    @Test
    fun testPalindromeNumberWIthBigInteger2() {
        val input = 121
        val result = isPalindromeBigInt(input)
        Assertions.assertEquals(true, result)
    }

    @Test
    fun testPalindromeNumberEdgeCase1() {
        val input = 0
        val result = isPalindrome(input)
        Assertions.assertEquals(true, result)
    }

    @Test
    fun testPalindromeNumberEdgeCase2() {
        val input = 123443210
        val result = isPalindrome(input)
        Assertions.assertEquals(false, result)
    }
}
