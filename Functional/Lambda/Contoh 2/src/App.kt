// main function
fun main() {
    val length = messageLength("Hello From lambda")
    println("Message length $length")
    // Message length 17
}

val messageLength = { message: String -> message.length }