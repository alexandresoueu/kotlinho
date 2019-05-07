fun media(vararg notes: Float) {

    if (notes.isNotEmpty()) {
        var sum = 0f
        for(note in notes) {
            sum += note
        }

        println("The media is: ${sum/notes.size}")
    }
}

fun <T> money(vararg values: T) {
    for(value in values) {
        println(value)
    }
}

fun main() {
    media(5f, 9f)
    media(4f, 5f, 8f, 3f)
    println("======================")
    money(1, 4f, "", false, "nome")
}