class MergeSort {

    fun sort(arr: IntArray): IntArray {
        val size = arr.size
        mergeSort(arr, 0, size - 1)
        return arr
    }

    private fun mergeSort(arr: IntArray, leftIndex: Int, rightIndex: Int) {
        println("leftIndex: $leftIndex, rightIndex: $rightIndex")
        if (leftIndex >= rightIndex) {
            return
        }

        val mid = (leftIndex + rightIndex) / 2
        println("Mid Index = $mid")

        mergeSort(arr, leftIndex, mid)
        mergeSort(arr, mid + 1, rightIndex)

        merge(arr, leftIndex, mid, rightIndex)

        println("Sorted Array is ${arr.contentToString()}")

    }

    private fun merge(arr: IntArray, leftIndex: Int, mid: Int, rightIndex: Int) {

        val joined = IntArray(rightIndex - leftIndex + 1)
        println("Merging leftIndex = $leftIndex, mid = $mid, rightIndex = $rightIndex, arr = ${arr.contentToString()}")
        var i = leftIndex
        var j = mid + 1
        var k = 0
        while (i <= mid && j <= rightIndex) {
            println("Comparing ${arr[i]} and ${arr[j]}")
            if (arr[i] < arr[j]) {
                joined[k++] = arr[i++]
            } else {
                joined[k++] = arr[j++]
            }
        }

        while (i <= mid) {
            joined[k++] = arr[i++]
        }

        while (j <= rightIndex) {
            joined[k++] = arr[j++]
        }

        for (l in joined.indices) {
            arr[leftIndex + l] = joined[l]
        }

    }


}