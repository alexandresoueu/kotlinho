fun main() {

    var index: Int = 0

    while (index <= 10) {
        println("Alexandre sou eu!")
        index++

        if (index == 9) {
            break
        }
    }

    var indox: Int = 1
    do {
        println("WOOOW : $indox")
        indox ++
    } while (indox < 9)

}