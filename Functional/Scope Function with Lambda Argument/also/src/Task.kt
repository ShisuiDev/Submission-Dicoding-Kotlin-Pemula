fun main() {
    val text = "Hello Kotlin"
    val result = text.also {
        println("value length -> ${it.length}")
        // value length -> 12
    }

    println("text -> $result")
//    text -> Hello Kotlin
}