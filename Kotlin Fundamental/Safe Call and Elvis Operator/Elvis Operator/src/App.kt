fun main() {
    val text: String? = "stay with you"
    val textLength = text?.length ?: 7
    // kalo variabel null maka dikasih nilai default 7

    println(textLength)
//    13
}