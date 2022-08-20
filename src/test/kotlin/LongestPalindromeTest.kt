import puzzles.LongestPalindrome
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

internal class LongestPalindromeTest {
    private val longestPalindrome: LongestPalindrome = LongestPalindrome()

    @Test
    fun testEmptyString() {
        assertEquals(0, longestPalindrome.findLongestPalindrome("").size, "Empty String must be considered invalid")
    }

    @Test
    fun testValidPalindromeString() {
        assertTrue(
            longestPalindrome.findLongestPalindrome("amma").containsAll(listOf("amma")),
            "given word is a palindrome"
        )
    }

    @Test
    fun testStringWithTwoEqualLength() {
        assertTrue(
            longestPalindrome.findLongestPalindrome("babad").containsAll(listOf("bab", "aba")),
            "bab, aba are both valid answers"
        )
    }

    @Test
    fun testStringWithTwoEqualLengthButNotLongest() {
        assertTrue(
            longestPalindrome.findLongestPalindrome("babadda").containsAll(listOf("adda", "aba")),
            "bab, aba are both valid answers"
        )
    }
}