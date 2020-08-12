import kotlinx.coroutines.*

@ObsoleteCoroutinesApi
fun main() = runBlocking<Unit> {
    val dispatcher = newSingleThreadContext("myThread")
    launch(dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
//    jadi yang pertama jalan itu yang
//    Starting in myThread
//    lalu delay sedetik untuk jalanin tread kedua
//    Resuming in myThread
}