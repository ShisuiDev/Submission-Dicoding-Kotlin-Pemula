// main function
fun main() {
    val fullName = getFullName()
    print(fullName)
//    Kotlin is awesome
}

fun getFullName(
        first: String = "Kotlin",
        middle: String = " is ",
        last: String = "Awesome"): String {
    return "$first $middle $last"
}