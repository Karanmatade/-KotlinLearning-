package src.Asssignments



    fun assignment2() {
        val name1: String? = "Umer"
        val name2: String? = null

        printLength(name1)
        printLength(name2)
    }

    fun printLength(str: String?) {
        if (str != null) {
            println("Length of string: ${str.length}")
        } else {
            println("String is null")
        }
    }

    fun main()
    {
        println("\nRunning Assignment 2:")
        assignment2()
    }
