// main function
abstract class Vehicle(wheel: Int)

class Car(speed: Int) : Vehicle(4) {}

class MotorCycle(speed: Int) : Vehicle(2)

fun main() {
    val car = Car(200)
    println(car)
    val motorCycle = MotorCycle(100)
    println(motorCycle)
    var vehicle: Vehicle = car
    vehicle = motorCycle
//    Car@15db9742
//    MotorCycle@6d06d69c
}