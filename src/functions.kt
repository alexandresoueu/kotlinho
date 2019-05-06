fun calculateBonus(a: Int, b: Int, c: Int) {

    println("The bonus values is:  ${a + b * c * 2}")
}

fun hello(name: String) : String {
    return "Relou $name"
}

fun shortBonus(a: Int, b: Int) = a + b

fun shortHello(name: String) = "Welcome to the $name"

fun main() {
    val a = 10
    val b = 20
    val c = 30

    calculateBonus(a, b, c)

    println(hello("Jorge"))

    println("Result Sum is: " + shortBonus(2, 3))

    println(shortHello("Jaiminho"))
}
