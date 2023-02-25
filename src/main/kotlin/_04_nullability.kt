// nullability, safe-chaining, nullability smart casts

package nullability

fun main() {
    val list: List<String> = listOf("Tree", "Graph", "Forest")

    val element: String = list.get(3)
    println(element)

    val elementLength = element.length
    println(elementLength)
}
