fun main() {
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(Int::isEvenNumber)

    println(evenNumbers)
//    2 4 6 8 10
}

fun Int.isEvenNumber() = this % 2 == 0