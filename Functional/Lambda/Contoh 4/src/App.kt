// main function
fun main() {
    printResult(10){ value ->
        value + value
    }
    // valuenya 20
}

fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}