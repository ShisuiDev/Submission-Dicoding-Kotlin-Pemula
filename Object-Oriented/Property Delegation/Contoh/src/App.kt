import kotlin.reflect.KProperty


class DelegateName {
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Animal {
    var name: String by DelegateName()
}

class Person {
    var name: String by DelegateName()
}

class Hero {
    var name: String by DelegateName()
}

fun main() {
    val animal = Animal()
    animal.name = "Dicoding Miaw"
    println("Nama Hewan: ${animal.name}")
    /* Nilai name dari: Default akan berubah menjadi Dicoding Miaw
    Fungsi ini sama seperti getter untuk properti name pada class Animal@1d56ce6a
    Nama Hewan: Dicoding Miaw */

    val person = Person()
    person.name = "Dimas"
    println("Nama Orang: ${person.name}")
    /*  Nilai name dari: Default akan berubah menjadi Dimas
    Fungsi ini sama seperti getter untuk properti name pada class Person@5197848c
    Nama Orang: Dimas */

    val hero = Hero()
    hero.name = "Gatotkaca"
    println("Nama Pahlawan: ${hero.name}")
    /*  Nilai name dari: Default akan berubah menjadi Gatotkaca
    Fungsi ini sama seperti getter untuk properti name pada class Hero@17f052a3
    Nama Pahlawan: Gatotkaca*/
}