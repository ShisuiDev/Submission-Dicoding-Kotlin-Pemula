// main function
fun main() {
    val fullName = getFullName(middle = " is " , first = "Kotlin", last = "Awesome")
    print(fullName)
    // kotlin is Awesome
}

fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}