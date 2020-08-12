// main function
fun main() {
    printResult(10 ,sum)
    // hasilnya 20
}

fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

var sum: (Int) -> Int = { value -> value + value }