// main function
fun main() {
    val value: Int? = null

    println(value.slice)
    // hasilnya  = 0
}

val Int?.slice: Int
    get() = this?.div(2) ?: 0