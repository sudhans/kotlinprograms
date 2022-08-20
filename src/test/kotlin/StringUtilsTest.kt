import utils.StringUtils
import kotlin.test.Test
import kotlin.test.assertTrue

internal class StringUtilsTest {

    private val stringUtils = StringUtils()
    @Test
    fun testGetAllSubStrings() {
        val allSubStrings = stringUtils.getAllSubStrings("good")
        assertTrue("ood" in allSubStrings, "ood is one of the valid sub-strings of good")
    }
}