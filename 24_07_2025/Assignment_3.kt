package src.Asssignments

import Assignments.assignment3

fun assignment3()
{
    val student1 = Student("Umer", 1, 85)
    val student2 = Student("Ayesha", 2, 67)
    val student3 = Student("Ali", 3, 42)

    println("${student1.name} (${student1.roll}) got Grade: ${student1.getGrade()}")
    println("${student2.name} (${student2.roll}) got Grade: ${student2.getGrade()}")
    println("${student3.name} (${student3.roll}) got Grade: ${student3.getGrade()}")
}

class Student(val name: String, val roll: Int, val marks: Int) {
    fun getGrade(): String {
        return when {
            marks >= 75 -> "A"
            marks >= 50 -> "B"
            else -> "C"
        }
    }
}

fun main()
{
    println("\nRunning Assignment 3:")
    assignment3()
}