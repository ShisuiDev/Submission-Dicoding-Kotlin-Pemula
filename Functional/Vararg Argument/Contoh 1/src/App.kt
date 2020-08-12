// main function
fun main() {
    val number = sumNumbers(10, 20, 30, 40)
    print(number)
    //100
}

fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}