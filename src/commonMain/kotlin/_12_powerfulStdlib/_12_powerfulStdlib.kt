// Powerful stdlib
package _12_powerfulStdlib

fun substringBefore() {
    val name = "John Cena"
    "John Cena".substringBefore(" ")
}

fun lastN(string: String, n: Int): String = string.takeLast(n)

fun dropLast(string: String, n: Int): String = string.dropLast(n)

fun coerce(x: Int, up: Int, low: Int) {
    x.coerceIn(low, up)
}

fun firstChar(str: String?): Char? {
    if (!str.isNullOrBlank()) {
        return str[0]
    }
    return null
}

fun ifIsBlank(name: String): String = name.ifBlank { "John" }

fun differenceBetweenAdjacentNumbers(list: List<Int>) {
    // imperative style
    val newList = ArrayList<Int>()
    for (i in 1 until list.size) {
        newList.add(list[i] - list[i - 1])
    }
    newList.forEach(::println)

    // functional style
    list.zipWithNext().map { it.second - it.first }.forEach(::println)
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
