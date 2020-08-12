// main function
fun main() {
    val ranges = 1.rangeTo(10) step 3

    for (i in ranges ){
        println("value is $i!")
    }
    /*
    * value is 1!
    * value is 4!
    * value is 7!
    * value is 10!*/
}