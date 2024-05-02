package com.stasvidilin.leetcodeproblems.easy

/**
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * Constraints:
 *
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 *
 * Only one valid answer exists.
 *
 * Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */

fun twoSum(nums: IntArray, target: Int): IntArray {
    val result = IntArray(2)
    val map = HashMap<Int, Int>()
    nums.forEachIndexed { index, num ->
        if (!map.containsKey(target - num)) {
            map[num] = index
        } else {
            result[0] = map[target - num]!!
            result[1] = index
            return result
        }
    }
    return result
}