package puzzles

import utils.StringUtils

/*
Given a string s, return the longest palindromic substring in s.

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

 */
class LongestPalindrome {

    fun findLongestPalindrome(str: String): List<String> {
        val palindromeList = mutableListOf<String>()
        if (isPalindrome(str)) {
            palindromeList.apply {
                add(str)
            }
        }

        StringUtils().getAllSubStrings(str)
            .filter {it.length>1}
            .filter{isPalindrome(it)}
            .toCollection(palindromeList)
        println("Palindrome List:: $palindromeList")
        return palindromeList
    }

    private fun isPalindrome(str: String): Boolean {
        return str.isNotEmpty() && str.isNotBlank() && str == str.reversed()
    }

}