/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah struktur kode yang sudah ada. Kecuali:
 *    - Untuk melakukan improvisasi kode
 *    - Mengikuti perintah yang ada
 *
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */

import kotlinx.coroutines.*

// TODO 1
suspend fun sum(valueA: Int, valueB: Int): Int {
    delay(3000L) // didelay 3 detik
    return valueA + valueB
}

// TODO 2
suspend fun multiple(valueA: Int, valueB: Int): Int {
    delay(2000L) // didelay 2 detik
    return valueA * valueB
}

fun main() = runBlocking {

    println("Counting...")
//    counting...

    val resultSum = async { sum(10, 10) }
    val resultMultiple = async { multiple(20, 20) }

    // TODO 3
    println("""
        Result sum: ${resultSum.await()}
        Result multiple: ${resultMultiple.await()}
    """.trimIndent())
//    Result sum: 20
//    Result multiple: 400
}