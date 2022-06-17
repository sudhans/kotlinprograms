class StringUtils {

    fun getAllSubStrings(input: String): List<String> {
        val length = input.length
        val subStringList = mutableListOf<String>()
        for (i in length-1 downTo 1) {
            var j = 0
            while ((j + i) <= length) {
                subStringList.add(input.substring(j,i+j))
                j++
            }

        }
        println("SubStrings are $subStringList")
        return subStringList
    }
}