class Animal{
    var name: String = "Dicoding Miaw"
        get(){
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value){
            println("Fungsi Setter terpanggil")
            field = value
        }
}

// main function
fun main(){
    val dicodingCat = Animal()
    println("Nama: ${dicodingCat.name}" )
//    fungsi getter terpanggil
//    Nama: Dicoding Miaw
    dicodingCat.name = "Goose"
//    fungsi setter terpanggil
    println("Nama: ${dicodingCat.name}")
//    fungsi getter terpanggil
//    Nama : Goose
}