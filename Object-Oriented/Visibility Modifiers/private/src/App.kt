class Animal(private var name: String, private val weight: Double, private val age: Int, private val isMammal: Boolean = true) {

    fun getName() = name

    fun setName(newName: String) {
        name = newName
    }
}

fun main() {
    val dicodingCat = Animal("Dicoding Miaw", 2.5, 2)

//     dicodingCat.name -> harus diakses melalui function yang ada di
//    class Animal
    println(dicodingCat.getName())
//    Dicoding Miaw
    dicodingCat.setName("Gooose")
    println(dicodingCat.getName())
//    Gooose
}