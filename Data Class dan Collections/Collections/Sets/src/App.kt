// main function
fun main() {
    val integerSet = setOf(1, 2, 4, 2, 1, 5)
    println(integerSet)
    // 1 2 4 2 1 5

    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    println(setA == setB) // true

    println(5 in setA) //true

    val setC = setOf(1, 5, 7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(union) // 1 2 4 5 7
    println(intersect) // 1 5
}