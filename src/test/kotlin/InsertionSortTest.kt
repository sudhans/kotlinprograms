import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

internal class InsertionSortTest {

    private val insertionSort = InsertionSort()
    @Test
    fun testInsertionSortSimple() {
        val arr = intArrayOf(1, 3, 2)
        assertTrue(intArrayOf(1, 2, 3) contentEquals insertionSort.sort(arr), "array is not sorted properly using insertion sort")
    }

    @Test
    fun testInsertionSortBig() {
        val arr = intArrayOf(1, 2, 6, 4, 1, 1, 9, 5, 3, 7)
        assertTrue(insertionSort.sort(arr) contentEquals intArrayOf(1, 1, 1, 2, 3, 4, 5, 6, 7, 9), "array is not sorted properly using insertion sort")
    }

    @Test
    fun testInsertionSortSmallComplex() {
        val arr = intArrayOf(0,0,0)
        assertTrue(insertionSort.sort(arr) contentEquals arr, "array is not sorted properly using insertion sort")
    }
}
