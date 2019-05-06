fun myName(name: String) {
    println("Hi $name")
}

fun myNameAge(name: String, age: Short) {
    println("Hey $name! I have $age years old!")
}

fun letterIndex(name: String, index: Int): Char {
    return name[index]
}

fun main() {
    myName("Nemo")
    myNameAge("Dori", 7)
    letterIndex("Bilu", 0)

    val str = "baby shark"

        str.toInt()
}