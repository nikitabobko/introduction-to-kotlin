// nullability, safe-chaining, nullability smart casts
package _04_nullability

fun getOrNull(list: List<String>, index: Int): String? {
    if (index < list.size) {
        list.get(index)
    }
    return null
}

fun main() {
    val list: List<String> = listOf("Tree", "Graph", "Forest")

    val element = getOrNull(list, 3)
    println(element)

    val elementLength = element?.length
    println(elementLength)
}
