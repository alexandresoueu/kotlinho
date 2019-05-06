import java.lang.Exception
import java.lang.NumberFormatException

/*
Double  64
Float   32
Long    64
Int     32
Short   16
Byte    8
**/

fun main() {

    try {
        println("nemo".toInt())
    } catch (e: NumberFormatException) {
        println("The Value is not a INT.")

    } catch (e: Exception) {
            println("Something ir very wrong SHIBBY!")
    } finally {
        println(" end code.....")
    }

}