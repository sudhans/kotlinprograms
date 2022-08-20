package sorting

class QuickSort {

    fun sort(input: Array<Int>) {
        quickSort(input, 0, input.size-1)
        println("After Sorting:: ${input.contentToString()}")
    }

    private fun quickSort(arr: Array<Int>, startIndex: Int, endIndex: Int) {
        if (arr.isEmpty()) {
            return
        }
        println("Array to be Sorted:: ${arr.contentToString()}")

        if (startIndex < endIndex) {
            val pivotIndex = partition(arr, startIndex, endIndex)
            quickSort(arr, startIndex, pivotIndex-1)
            quickSort(arr, pivotIndex+1, endIndex)
        }
    }

    private fun partition(arr: Array<Int>, startIndex: Int, endIndex: Int) : Int {
        val pivot = arr[endIndex]

        println("Pivot is $pivot")

        var i = startIndex  // index of smaller element, can be 0
        for (j in startIndex until endIndex) {
            println("j is $j, i is $i, comparing ${arr[j]}")
            if (arr[j] <= pivot ) {
                if (i!=j) {
                    println("Swapping ${arr[i]} and ${arr[j]}")
                    arr[j] = arr[i].also { arr[i] = arr[j] } // swap numbers
                }
                i++
            }
        }

        println("Swapping ${arr[i]} and ${arr[endIndex]}")
        arr[i] = arr[endIndex].also {
            arr[endIndex] = arr[i]
        }

        return i;
    }
}