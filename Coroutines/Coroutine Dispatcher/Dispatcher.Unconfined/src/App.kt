import kotlinx.coroutines.*

@ExperimentalCoroutinesApi
fun main() = runBlocking<Unit> {
    launch(Dispatchers.Unconfined) {
        println("Starting in ${Thread.currentThread().name}")
        delay(500)
        println("Resuming in ${Thread.currentThread().name}")
        delay(1000)
        println("end in ${Thread.currentThread().name}")
    }.start()

//    Starting in main
//    Resuming in kotlinx.coroutines.DefaultExecutor
//    end in kotlinx.coroutines.DefaultExecutor
}