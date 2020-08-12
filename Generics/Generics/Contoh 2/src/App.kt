// main function
fun main() {
    val numbers = (1..100).toList()
    print(numbers.slice(1..10))
//    2 3 4 5 6 7 8 9 10 11
}

/*
public fun <T> List<T>.slice(indices: IntRange): List<T> {
    if (indices.isEmpty()) return listOf()
    return this.subList(indices.start, indices.endInclusive + 1).toList()
}
*/