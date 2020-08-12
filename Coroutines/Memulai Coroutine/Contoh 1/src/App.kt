import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking{
    launch {
        delay(1000L)
        println("Coroutines!")
    }
    println("Hello,")
    delay(2000L)
    /* Hello
    * setelah itu delay 1 detik untuk menampilkan
    * Coroutines
    * dan delay 2 detik terakhir untuk memunculkan ke layar*/
}