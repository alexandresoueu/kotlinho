fun main() {
    println("2 + 2 = ${2 + 2}")
    println("2 - 2 = ${2 - 2}")
    println("2 / 2 = ${2 / 2}")
    println("2 * 2 = ${2 * 2}")
    println("10 % 4 = ${10 % 4}") // resto da divisão 10 / 4 = 2
    println("10 % 2 = ${10 % 2}") // resto da divisão 10 / 2 = 0

    var number = 10

    println("number++ = ${number++}")
    println("number-- = ${number--}")

    println("++number = ${++number}")
    println("--number = ${--number}")

    number += 2
    println("number += 2 = ${number}")

    number -= 2
    println("number -= 2 = ${number}")

    number /= 2
    println("number /= 2 = ${number}")

    number *= 2
    println("number *= 2 = ${number}")

    number %= 3
    println("number %= 3 = ${number}") // resto da multiplicação 3 * 3 = 9

}