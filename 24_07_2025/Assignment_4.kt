package src.Asssignments

fun assignment4() {
    val pi = 3.14
    var radius = 5
    var area = pi * radius * radius
    println("Area with radius $radius: $area")

    radius = 7
    area = pi * radius * radius
    println("Area with radius $radius: $area")
}

fun main()
{
    println("\nRunning Assignment 4:")
    assignment4()
}