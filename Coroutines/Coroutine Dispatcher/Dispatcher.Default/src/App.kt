import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch {
        val job = launch {
            delay(500)
            println("start!")
        }
    }

    launch(Dispatchers.Default) {
        val dispacther = launch {
            delay(1000)
            println("end")
        }
    }

    println("Dispatcher Default")
}