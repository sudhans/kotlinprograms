package sorting

// A rental car service has 50 cars. Of them, 25 are yellow and 25 are white
// The cars are currently parked by alternate colors in a straight line . Eg. Yellow car followed by white car and then by yellow car etc.
// The owner wants to park the cars in such a way that all yellow cars should come first and the white cars at the end
// Help the owner park the cars efficiently.
class SortOddEven {

    fun sort(array: Array<Int>) {
        var j = array.size - 1
        var i = 0
        while (i <= j) {
            println("$i --> $j --> ${array.contentToString()}")
            if (array[i] % 2 == 0) {

                while (j > i) {
                    if (array[j] % 2 == 1) {
                        array[i] = array[j].also {
                            array[j] = array[i]
                        }
                        break
                    }
                    j--
                }
            }
            i++
        }

    }
}