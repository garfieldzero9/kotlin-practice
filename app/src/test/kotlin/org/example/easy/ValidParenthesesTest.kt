package org.example.easy

import kotlin.test.Test
import org.junit.jupiter.api.Assertions

class ValidParenthesesTest {

    @Test
    fun validParentheses1() {
        val input = "()"
        val result = isValidParentheses(input)
        Assertions.assertTrue(result)
    }

    @Test
    fun validParentheses2() {
        val input = "()[]{}"
        val result = isValidParentheses(input)
        Assertions.assertTrue(result)
    }

    @Test
    fun validParentheses3() {
        val input = "(]"
        val result = isValidParentheses(input)
        Assertions.assertFalse(result)
    }

    @Test
    fun validParentheses4() {
        val input = "([)]"
        val result = isValidParentheses(input)
        Assertions.assertFalse(result)
    }

    @Test
    fun validParentheses5() {
        val input = "{[]}"
        val result = isValidParentheses(input)
        Assertions.assertTrue(result)
    }

    @Test
    fun validParentheses6() {
        val input = "}"
        val result = isValidParentheses(input)
        Assertions.assertFalse(result)
    }

    @Test
    fun validParentheses7() {
        val input = ""
        val result = isValidParentheses(input)
        Assertions.assertTrue(result)
    }
}
