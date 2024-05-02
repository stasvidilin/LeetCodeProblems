package com.stasvidilin.leetcodeproblems.easy

/**
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 *
 * Example 1:
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 *
 * Example 2:
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 *
 * Example 3:
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 *
 * Constraints:
 * -231 <= x <= 231 - 1
 *
 * Follow up: Could you solve it without converting the integer to a string?
 *
 * @see com.stasvidilin.leetcodeproblems.easy.LP00009PalindromeNumberTest
 */

fun isPalindrome(x: Int): Boolean {
    if (x < 0) return false
    var y = 0
    var copyX = x
    while (copyX != 0) {
        y = y * 10 + copyX % 10
        copyX /= 10
    }
    return x == y
}