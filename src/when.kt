fun operation(a: Int, b: Int, c: String): Int {

    when (c) {
        "sum" -> return a + b
        "minus" -> {
            return a - b
        }
        else -> {
            return 0
        }
    }

/*    when {
        a > 0 && b > 0 -> {
            println("Variables more than zero")
        }
    }

    when (a) {
        in 1..99 -> {
            println("Century")
        }
    }

 */
}

fun main() {

    val resultSum =operation(1, 10, "sum")
    val resultMinus = operation(1, 10, "minus")
    val resultOthers = operation(1, 10, "multi")

    println("Result to SUM: $resultSum")
    println("Result to MINUS: $resultMinus")
    println("Result to OTHERS: $resultOthers")
}