// main function
fun main() {
    val rangeInt = 1..10 step 2

    rangeInt.forEach {
        print("$it ")
        // 1 3 5 7 9
    }

    println(rangeInt.step)
    // 1 3 5 7 9 2 (2 => stepnya)
}