/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah kode yang sudah ada.
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */
fun main() {

    // TODO 1
    val vehicle = mapOf<String, String>(
            "type" to "Motorcycle",
            "maxSpeed" to "230Km/s",
            "maxTank" to "10Ltr"
    )

    // TODO 2
    val type = vehicle.getValue("type")
    val maxSpeed = vehicle.getValue("maxSpeed")
    val maxTank = vehicle.getValue("maxTank")

    // TODO 3
    println("Vehicle\nType: $type\nMaximal Speed: $maxSpeed\nMaximal Tank: $maxTank")
}