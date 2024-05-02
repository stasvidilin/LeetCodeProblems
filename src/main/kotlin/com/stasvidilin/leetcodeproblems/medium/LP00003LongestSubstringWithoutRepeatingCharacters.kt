package com.stasvidilin.leetcodeproblems.medium

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 *
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 *
 * Example 3:
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 * Constraints:
 * - 0 <= s.length <= 5 * 104
 * - s consists of English letters, digits, symbols and spaces.
 */

fun lengthOfLongestSubstring(s: String): Int {
    val map = HashMap<Char, Int>()
    var lastRepeatPosition = -1
    var maxLength = 0
    s.forEachIndexed { index, c ->
        if (map.containsKey(c) && lastRepeatPosition < map[c]!!) {
            lastRepeatPosition = map[c]!!
        }
        if (index - lastRepeatPosition > maxLength ) {
            maxLength = index - lastRepeatPosition
        }
        map[c] = index
    }
    return maxLength
}
