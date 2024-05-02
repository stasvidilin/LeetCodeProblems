package com.stasvidilin.leetcodeproblems.medium

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

/**
 * @see com.stasvidilin.leetcodeproblems.medium.lengthOfLongestSubstring
 */

class LP00003LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    fun testLongestSubstringWithoutRepeatingCharacters_case1() {
        assertEquals(3, lengthOfLongestSubstring("abcabcbb"))
    }

    @Test
    fun testLongestSubstringWithoutRepeatingCharacters_case2() {
        assertEquals(1, lengthOfLongestSubstring("bbbbb"))
    }

    @Test
    fun testLongestSubstringWithoutRepeatingCharacters_case3() {
        assertEquals(3, lengthOfLongestSubstring("pwwkew"))
    }
}