/*
Given a string s, return the longest palindromic substring in s.

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

 */
class LongestPalindrome {

    fun findLongestPalindrome(str: String): List<String> {
        val palindromeList = mutableListOf<String>()
        if (str.isEmpty()) {
            return palindromeList
        }
        for (i in 0..str.length) {
            val subString = str.substring(i)
            if (isPalindrome(subString)) {
                palindromeList.add(subString)
            }
        }
        println(palindromeList)
        return palindromeList
    }

    private fun isPalindrome(str: String): Boolean {
        return str.isNotEmpty() && str.isNotBlank() && str == str.reversed()
    }

}