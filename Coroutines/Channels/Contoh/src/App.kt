import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

fun main() = runBlocking(CoroutineName("main")) {
    val channel = Channel<Int>()
    launch(CoroutineName("v1coroutine")){
        println("Sending from ${Thread.currentThread().name}")
        for (x in 1..5) channel.send(x * x)
//        Sending from main
//        1 -> 1*1, dan seterusnya sampai 5
    }

    repeat(5) { println(channel.receive()) }
//  jika udah sampe 5 times thread selanjutnya menerima informasi
    println("received in ${Thread.currentThread().name}")
//  received in main
}