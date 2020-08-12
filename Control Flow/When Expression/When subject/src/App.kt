import kotlin.random.Random

// main function
fun main() {
    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }

    println(registerNumber)
    // hasilnya nilai random  * 100 atau 50
}

fun getRegisterNumber() = Random.nextInt(100)