@file:Suppress("UNUSED_CHANGED_VALUE")

// main function
fun main() {
    var vocal = 'A'

    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)

    /*
    A
    B
    C
    D
    C
    B
    A
    */
}