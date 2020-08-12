fun main() {
    val capital = mapOf(
            "Jakarta" to "Indonesia",
            "London" to "England",
            "New Delhi" to "India"
    )

    println(capital["Jakarta"]) //Indonesia
    println(capital.getValue("Jakarta")) //Indonesia

    val mapKeys = capital.keys
    val mapValues = capital.values

    println(mapKeys) // Jakarta, London, New Delhi
    println(mapValues) // Indonesia, England, India
}