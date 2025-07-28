package src.Asssignments

fun assignment5() {
    val myCar = Car("Toyota", "Camry", 2022, 15000.0)

    println("Before driving:")
    myCar.details()

    myCar.drive(250.0)

    println("\nAfter driving 250 km:")
    myCar.details()
}

class Car(val make: String, val model: String, val year: Int, var mileage: Double) {
    fun details() {
        println("Make: $make")
        println("Model: $model")
        println("Year: $year")
        println("Mileage: $mileage km")
    }

    fun drive(miles: Double)
    {
        mileage += miles
    }
}

fun main()
{
    println("\nRunning Assignment 5:")
    assignment5()
}