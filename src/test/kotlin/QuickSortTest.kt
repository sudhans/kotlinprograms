
import sorting.QuickSort
import kotlin.test.Test
import kotlin.test.assertTrue

internal class QuickSortTest {

    private val quickSort = QuickSort()

    @Test
    fun testQuickSortSimple() {
        val arrayToBeSorted = arrayOf(2, 1, 0)
        quickSort.sort(arrayToBeSorted)
        assertTrue(arrayOf(0, 1, 2) contentEquals arrayToBeSorted)
    }

    @Test
    fun testQuickSortMedium() {
        val arrayToBeSorted = arrayOf(12, 31, 20, 2, 7, 1)
        quickSort.sort(arrayToBeSorted)
        assertTrue(arrayOf(1, 2, 7, 12, 20, 31) contentEquals arrayToBeSorted)
    }

    @Test
    fun testQuickSortMediumComplex() {
        val arrayToBeSorted = arrayOf(0, 1, 1, 0, 1, 0)
        quickSort.sort(arrayToBeSorted)
        assertTrue(arrayOf(0,0,0,1,1,1) contentEquals arrayToBeSorted)
    }

    @Test
    fun testQuickSortBig() {
        val arrayToBeSorted = arrayOf(1, 10, 20, 40, 80, 60, 90, 0, 100, 100, 190)
        quickSort.sort(arrayToBeSorted)
        assertTrue(arrayOf(0, 1, 10, 20, 40, 60, 80, 90, 100, 100, 190) contentEquals arrayToBeSorted)
    }
}