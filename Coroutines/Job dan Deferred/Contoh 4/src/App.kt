import kotlinx.coroutines.*

@InternalCoroutinesApi
fun main() = runBlocking {
    val job = launch {
        delay(5000)
        println("Start new job!")
    }

    delay(2000)
    job.cancel(cause = CancellationException("Time is up!"))
    println("Cancelling job...")
    if (job.isCancelled){
        println("Job is cancelled because ${job.getCancellationException().message}")
    }
//    job berhenti sebelum masuk ke launch karena di detik ke 2
//    job di cancel, sehingga job selanjutnya tidak dilanjutkan
//    Cancelling job...
//    Job is cancelled beccause Time is up!
}