class InsertionSort {

    fun sort(arr: IntArray): IntArray {

        for (i in 1 until arr.size ) {
            for (j in i downTo 1) {
               if (arr[j] < arr[j-1]) {
                   // swap number
                   arr[j] = arr[j-1].also {
                       arr[j-1] = arr[j]
                   }
               }else {
                   break
               }

            }
        }
        return arr
    }
}