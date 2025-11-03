package org.example.easy

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val ints = mutableListOf<Int>()
        for (i in nums.indices) {
            for (j in nums.indices) {
                if (i != j) {
                    val sum = nums[i] + nums[j]
                    if (sum == target) {
                        return intArrayOf(i, j)
                    }
                }
            }
        }
        return intArrayOf()
    }

    fun twoSum2(nums: IntArray, target: Int): IntArray {
        val seenNumbers = mutableMapOf<Int, Int>()

        for (i in nums.indices) {
            val currentNums = nums[i]
            val compResult = target - currentNums
            if (seenNumbers.contains(compResult)) {
                return intArrayOf(seenNumbers[compResult] ?: 0, i)
            }

            seenNumbers[currentNums] = i
        }

        return intArrayOf()
    }
}
