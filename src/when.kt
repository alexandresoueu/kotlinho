fun operation(a: Int, b: Int, c: String) {

//    when (c) {
//        "sum" -> return a + b
//        "minus" -> {
//            return a - b
//        }
//        else -> {
//            println("not a number")
//            return 0
//        }
//    }

    when {
        a > 0 && b > 0 -> {
            println("Variables more than zero")
        }
    }

    when (a) {
        in 1..99 -> {
            println("Century")
        }
    }
}

fun main() {

    operation(1, 10, "sum")
    //operation(1, 10, "minus")
    //operation(1, 10, "multi")
}