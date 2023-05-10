// Functions: extension functions, default parameters, named arguments
package _05_functions

fun String.getFirstWord(separator: String = " "): String {
    val index = indexOf(separator)
    return if (index < 0) this else substring(0, index)
}

fun main() {
    println("Hello Warsaw!".getFirstWord())
    println("Hello World!".getFirstWord())
    println("dobry dzień!".getFirstWord())
    println("first,second,third".getFirstWord(separator = ","))
}
