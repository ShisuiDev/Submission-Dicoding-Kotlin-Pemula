// main function
fun main() {
    val someString = "123"
    val someInt = someString.toInt()
    val someOtherString = "12.34"
    val someDouble = someOtherString.toDouble()

    println(someInt is Int)
//    true
    println(someDouble is Double)
//    true
}