package com.stasvidilin.leetcodeproblems.easy

import kotlin.test.Test
import kotlin.test.assertContentEquals

/**
 * @see com.stasvidilin.leetcodeproblems.easy.twoSum
 */

class LP00001TwoSumTest {
    @Test
    fun testTwoSum_case1() {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        val expectedResult = intArrayOf(0, 1)
        assertContentEquals(expectedResult, twoSum(nums, target))
    }

    @Test
    fun testTwoSum_case2() {
        val nums = intArrayOf(3, 2, 4)
        val target = 6
        val expectedResult = intArrayOf(1, 2)
        assertContentEquals(expectedResult, twoSum(nums, target))
    }

    @Test
    fun testTwoSum_case3() {
        val nums = intArrayOf(3, 3)
        val target = 6
        val expectedResult = intArrayOf(0, 1)
        assertContentEquals(expectedResult, twoSum(nums, target))
    }
}