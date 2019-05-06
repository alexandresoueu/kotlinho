fun main() {

    val str = "Alexandre Oliveira"

    for (c in str) {
        println("$c ")
    }

    for (index in 1..15) {
        println("indexinho : $index")
    }

    for (indeX in 0..50 step 5) {
        println("INDEX : $indeX")
    }

    for (indeXX in 0..15 step 5) {
        if( indeXX != 10) {
            println(" INDEXX : $indeXX")
        }
    }

    for (indox in 50 downTo 40) {
        println("DownTo : $indox")
    }
}