package sorting

class SelectionSort {

    fun sort(arr: IntArray): IntArray {
        for (i in arr.indices) {
            var min = arr[i]
            var minIndex = i
            for (j in i+1 until arr.size) {
                if (arr[j]< min) {
                    min = arr[j]
                    minIndex = j
                }
            }

            // swap min number to start
            arr[i] = arr[minIndex].also {
                arr[minIndex] = arr[i]
            }
        }
        return arr
    }
}