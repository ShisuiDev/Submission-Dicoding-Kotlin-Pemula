import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch {
        val job = launch {
            delay(500)
            println("start!")
        } //then this code is second launch
    }

    launch(Dispatchers.Default) {
        val dispacther = launch {
            delay(1000)
            println("end")
        } // last code to launch
    }

    println("Dispatcher Default") // this code is first to launch
//    Dispatcher Default
//    start!
//    end
}