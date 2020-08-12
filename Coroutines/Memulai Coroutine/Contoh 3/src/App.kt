import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun getCapital(): Int {
    delay(1000L)
    return 50000
}

suspend fun getIncome(): Int {
    delay(1000L)
    return 75000
}

fun main() = runBlocking {
    val timeOne = measureTimeMillis {
        val capital = getCapital()
        val income = getIncome()
        println("Your profit is ${income - capital}")
//        your profit is 25000
    }

    val timeTwo = measureTimeMillis {
        val capital = async { getCapital() }
        val income = async { getIncome() }
        println("Your profit is ${income.await() - capital.await()}")
//        your profit is 25000
    }

    println("Completed in $timeOne ms vs $timeTwo ms")
//completed in 2038 ms vs 1029 ms
}