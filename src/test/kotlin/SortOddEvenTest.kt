import org.junit.jupiter.api.Test
import sorting.SortOddEven
import kotlin.test.assertContentEquals

internal class SortOddEvenTest {

    private val sortOddEven = SortOddEven()


    @Test
    fun testSortTenNumbers() {
        val array = arrayOf(1, 2,3,4,5,6,7,8,9,10)
        val sortedArray = arrayOf(1,9, 3, 7, 5, 6, 4, 8, 2, 10)
        sortOddEven.sort(array)
        assertContentEquals(array, sortedArray)
    }

    @Test
    fun testSortElevenNumbers() {
        val array = arrayOf(1, 2,3,4,5,6,7,8,9,10,11)
        val sortedArray = arrayOf(1,11, 3, 9, 5, 7, 6, 8, 4, 10, 2)
        sortOddEven.sort(array)
        assertContentEquals(array, sortedArray)
    }
}