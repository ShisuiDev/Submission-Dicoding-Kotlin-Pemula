import kotlinx.coroutines.*

suspend fun getCapital(): Int {
    delay(1000L) //delay 1 detik
    return 50000
}

suspend fun getIncome(): Int {
    delay(1000L) //delay 1 detik
    return 75000
}

fun main() = runBlocking {
    val capital = getCapital()
    val income = getIncome()
    println("Your profit is ${income - capital}")
//    your profit is 25000
}
