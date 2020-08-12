import kotlinx.coroutines.*

@ObsoleteCoroutinesApi
fun main() = runBlocking<Unit> {
    val dispatcher = newFixedThreadPoolContext(3, "myPool")

    launch(dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
        delay(2000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
//  jadi yang jalan pertama itu
//  starting in myPool-1 terus didelay 1 detik untuk kethread selanjutnya
//  Resuming in myPool-2 terus didelay 2 detik untuk ketread terakhir
//  Resuming in myPool-1 dan thread akan selesai
}