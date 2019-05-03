fun main() {
    val name = "Zaira"
    val type = " Pitbull"

    println(name + type)
    println("=========================")

    println("Zaira is a $type")
    println("=========================")

    val str = """My name is Zaira and I'm a Pitbull dog.
        |I like play with my dog.
        |This is a text test.
    """.trimMargin()

    println(str)

    println("=========================")

    println("LENGTH STRING ${name.length}")

}