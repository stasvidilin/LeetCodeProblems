package com.stasvidilin.leetcodeproblems.easy

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

/**
 * @see com.stasvidilin.leetcodeproblems.easy.isPalindrome
 */

class LP00009PalindromeNumberTest {
    @Test
    fun testPalindromeNumber_case1() {
        assertEquals(true, isPalindrome(121))
    }

    @Test
    fun testPalindromeNumber_case2() {
        assertEquals(false, isPalindrome(-121))
    }

    @Test
    fun testPalindromeNumber_case3() {
        assertEquals(false, isPalindrome(10))
    }
}