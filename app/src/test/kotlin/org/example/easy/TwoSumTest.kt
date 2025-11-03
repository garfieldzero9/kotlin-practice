package org.example.easy

import kotlin.test.Test
import org.junit.jupiter.api.Assertions

class TwoSumTest {

    @Test
    fun testSolution1() {
        val twoSum = TwoSum()
        val result = twoSum.twoSum(intArrayOf(2, 7, 11, 15), 9)
        Assertions.assertEquals(0, result[0])
        Assertions.assertEquals(1, result[1])
    }

    @Test
    fun testSolution2() {
        val twoSum = TwoSum()
        val result = twoSum.twoSum2(intArrayOf(3, 2, 4), 6)
        Assertions.assertEquals(1, result[0])
        Assertions.assertEquals(2, result[1])
    }
}
