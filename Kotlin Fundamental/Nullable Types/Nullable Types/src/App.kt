fun main() {
    val text: String? = "Eat"

    //val textLength = text.length // compile time error

    if (text != null){
        val textLength = text.length
        println(textLength)// ready to go
//        3
    }
}