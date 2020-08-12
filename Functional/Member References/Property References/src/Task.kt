var message = "Kotlin"

fun main() {
    println(::message.name)
//    message
    println(::message.get())
//    Kotlin

    ::message.set("Kotlin Academy")

    println(::message.get())
//    Kotlin Academy
}