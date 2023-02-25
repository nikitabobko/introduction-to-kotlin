// Functions: extension functions, default parameters, named arguments

fun getFirstWord(string: String, separator: String): String {
    val index = string.indexOf(separator)
    return if (index < 0) string else string.substring(0, index)
}

fun main() {
    println(getFirstWord("Hello Delft!", " "))
    println(getFirstWord("Hello World!", " "))
    println(getFirstWord("Goedemiddag allemaal!", " "))
    println(getFirstWord("first,second,third", ","))
}
