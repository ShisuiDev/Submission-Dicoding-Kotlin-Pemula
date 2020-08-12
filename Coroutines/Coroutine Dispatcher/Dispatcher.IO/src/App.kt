import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    launch(Dispatchers.IO) {
        delay(3000)
        println("adi is awesome")
    }

    println("Dispatcher IO")
//    Dispatcher IO
//    adi is awesome
}