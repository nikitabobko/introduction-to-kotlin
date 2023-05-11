// Powerful stdlib
package _12_powerfulStdlib

fun String.getFirstWord(separator: String): String = TODO()

fun substringBefore() {
    val name = "John Cena"
    "John Cena".getFirstWord(" ")
}

fun lastN(string: String, n: Int): String = string.substring(string.length - n, string.length)

fun dropLast(string: String, n: Int): String = string.substring(0, string.length - n)

fun coerce(x: Int, up: Int, low: Int) {
    minOf(up, maxOf(low, x))
}

fun firstChar(str: String?): Char? {
    if (str != null && str != "") {
        return str[0]
    }
    return null
}

fun ifIsBlank(name: String): String = if (name.isBlank()) "John" else name

fun differenceBetweenAdjacentNumbers(list: List<Int>) {
    // imperative style
    val newList = ArrayList<Int>()
    for (i in 1 until list.size) {
        newList.add(list[i] - list[i - 1])
    }
    newList.forEach(::println)

    // functional style
    list.zip(list.drop(1)).map { it.second - it.first }.forEach(::println)
}

fun buildList(list: List<Int>) {
    val newList = ArrayList<Int>()
    for (i in 1 until list.size) {
        newList.add(list[i] - list[i - 1])
    }
    newList.forEach(::println)
}

fun joinToString(list: List<String>) {
    val stringBuilder = StringBuilder()
    stringBuilder.append("[")
    for ((index, item) in list.withIndex()) {
        if (index != 0) stringBuilder.append(",")
        stringBuilder.append(item)
    }
    stringBuilder.append("]")
}

fun partition(list: List<Int>) {
    val biggerThan5 = list.filter { it > 5 }
    val smallerThan5 = list.filter { it < 5 }
}

// Any questions?
