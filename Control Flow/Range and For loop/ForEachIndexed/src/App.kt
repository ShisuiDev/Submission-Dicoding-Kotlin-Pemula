// main function
fun main() {
    val ranges = 1.rangeTo(10) step 3

    ranges.forEachIndexed { index, value ->
        println("value $value with index $index")
    }
    /*  value 1 with index 0
        value 4 with index 1
        value 7 with index 2
        value 10 with index 3*/
}