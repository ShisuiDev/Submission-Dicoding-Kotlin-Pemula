// main function
fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    print(numberList.count()) // 10
    print(numberList.count { it % 3 == 0 }) // 3
    //103
}