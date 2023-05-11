// Functions: extension functions, default parameters, named arguments
package _05_functions

fun getFirstWord(string: String, separator: String): String {
    val index = string.indexOf(separator)
    return if (index < 0) string else string.substring(0, index)
}

fun main() {
    println(getFirstWord("Hello Warsaw!", " "))
    println(getFirstWord("Hello World!", " "))
    println(getFirstWord("dobry dzień!", " "))
    println(getFirstWord("first,second,third", ","))
}
