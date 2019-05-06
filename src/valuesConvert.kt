/*
Double  64
Float   32
Long    64
Int     32
Short   16
Byte    8
**/

fun test(n1: Int) {

}

fun main() {

    val n1: Double = Double.MAX_VALUE
    val b1: Byte = 100

    println(b1.toShort())
    println(b1.toLong())
    println(b1.toFloat())
    println(b1.toDouble())

    println("==========================")

    println("33".toInt())
    println("33".toFloat())
    println("33".toDouble())
    println("nemo".toInt())
}