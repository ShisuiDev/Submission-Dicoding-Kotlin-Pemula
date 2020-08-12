// main function
fun main() {
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()
    val descendingSort = kotlinChar.sortedDescending()

    println(ascendingSort) // i k l n o t
    println(descendingSort) // t o n l k i
}