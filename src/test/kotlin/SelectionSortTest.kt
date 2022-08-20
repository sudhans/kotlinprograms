import org.junit.jupiter.api.Test
import sorting.SelectionSort
import kotlin.test.assertTrue

internal class SelectionSortTest {

    private val selectionSort = SelectionSort()
    @Test
    fun testSelectionSortSimple() {
        val arr = intArrayOf(1, 3, 2)
        assertTrue(intArrayOf(1, 2, 3) contentEquals selectionSort.sort(arr), "array is not sorted properly using selection sort")
    }

    @Test
    fun testSelectionSortBig() {
        val arr = intArrayOf(1, 2, 6, 4, 1, 1, 9, 5, 3, 7)
        assertTrue(selectionSort.sort(arr) contentEquals intArrayOf(1, 1, 1, 2, 3, 4, 5, 6, 7, 9), "array is not sorted properly using selection sort")
    }

    @Test
    fun testSelectionSortSmallComplex() {
        val arr = intArrayOf(0,0,0)
        assertTrue(selectionSort.sort(arr) contentEquals arr, "array is not sorted properly using selection sort")
    }

}