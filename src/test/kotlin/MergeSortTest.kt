import sorting.MergeSort
import kotlin.test.Test
import kotlin.test.assertTrue

internal class MergeSortTest {

    private val mergeSort = MergeSort()

    @Test
    fun mergeSortSimpleArray() {
        val arr = intArrayOf(1,3,2)
        assertTrue(mergeSort.sort(arr) contentEquals intArrayOf(1,2,3), "array is not sorted properly using merge sort")
    }

    @Test
    fun mergeSortSmallComplexArray() {
        val arr = intArrayOf(0,0,0)
        assertTrue(mergeSort.sort(arr) contentEquals arr, "array is not sorted properly using merge sort")
    }

    @Test
    fun mergeSortSimpleBigArray() {
        val arr = intArrayOf(10, 2, 6, 4, 8, 1, 9, 5, 3, 7)
        assertTrue(mergeSort.sort(arr) contentEquals intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), "array is not sorted properly using merge sort")
    }

    @Test
    fun mergeSortComplexBigArray() {
        val arr = intArrayOf(1, 2, 6, 4, 1, 1, 9, 5, 3, 7)
        assertTrue(mergeSort.sort(arr) contentEquals intArrayOf(1, 1, 1, 2, 3, 4, 5, 6, 7, 9), "array is not sorted properly using merge sort")
    }

}