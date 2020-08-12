class Animal(val name: String,
             val weight: Double,
             val age: Int,
             val isMammal: Boolean) {

    fun eat() {
        println("$name makan!")
    }

    fun sleep() {
        println("$name tidur!")
    }
}

// main function
fun main() {
    val dicodingCat = Animal("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
//    nama : Dicoding Miaw, Berat: 4.2, Umur: 2, mamalia: true
    dicodingCat.eat()
//    Dicoding miaw makan!
    dicodingCat.sleep()
//    Dicoding miaw tidur!
}