import kotlinx.coroutines.*

fun main() = runBlocking {

    // menggunakan launch()
    val jobLaunch = launch {
        val time = async {
            delay(10000)
            println("sweat today!")
        }
    }

    // menggunakan job()
    val job = Job()
}