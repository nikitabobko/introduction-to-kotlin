// sealed class, when expression, smart casts, local function
package _03_traverseExample

sealed interface Element
class Container(vararg val children: Element) : Element
class Text(val label: String) : Element

fun traverseAndConcatText(element: Element): String {
    val stringBuilder = StringBuilder() // why do we use string builder?
    fun traverse(element: Element) {
        when (element) {
            is Container -> element.children.forEach(::traverse)
            is Text -> stringBuilder.appendLine(element.label)
        }
    }
    traverse(element)
    return stringBuilder.toString()
}

