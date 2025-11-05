package org.example.easy

import kotlin.test.Test
import org.junit.jupiter.api.Assertions

class LongestCommonPrefixTest {

    @Test
    fun longestCommonPrefixTest_BasicCase() {
        val input = arrayOf("flower", "flow", "flight")
        val result = longestCommonPrefix(input)
        Assertions.assertEquals("fl", result)
    }

    @Test
    fun longestCommonPrefixTest_NoCommonPrefix() {
        val input = arrayOf("dog", "racecar", "car")
        val result = longestCommonPrefix(input)
        Assertions.assertEquals("", result)
    }

    @Test
    fun longestCommonPrefixTest_EmptyArray() {
        val input = arrayOf<String>()
        val result = longestCommonPrefix(input)
        Assertions.assertEquals("", result)
    }

    @Test
    fun longestCommonPrefixTest_SingleWord() {
        val input = arrayOf("lonely")
        val result = longestCommonPrefix(input)
        Assertions.assertEquals("lonely", result)
    }

    @Test
    fun longestCommonPrefixTest_FirstWordIsEmpty() {
        val input = arrayOf("", "flow", "flight")
        val result = longestCommonPrefix(input)
        Assertions.assertEquals("", result)
    }

    @Test
    fun longestCommonPrefixTest_LaterWordIsEmpty() {
        val input = arrayOf("flower", "", "flight")
        val result = longestCommonPrefix(input)
        Assertions.assertEquals("", result)
    }

    @Test
    fun longestCommonPrefixTest_FullFirstWordIsPrefix() {
        val input = arrayOf("apple", "applesauce", "applegate")
        val result = longestCommonPrefix(input)
        Assertions.assertEquals("apple", result)
    }
}
