package src.Asssignments

fun assignment1() {
    println("Radha Krishna 1")
    println("Radha Krishna 2")
    println("Radha Krishna 3")
    println("Radha Krishna 4")
    println("Radha Krishna 5")

    checkNumber(10)
    checkNumber(-3)
    checkNumber(0)
}

fun checkNumber(num: Int) {
    if (num > 0) {
        println("$num is Positive")
    } else if (num < 0) {
        println("$num is Negative")
    } else {
        println("Number is Zero")
    }
}
fun main()
{
    println("\nRunning Assignment 1:")
    assignment1()
}
