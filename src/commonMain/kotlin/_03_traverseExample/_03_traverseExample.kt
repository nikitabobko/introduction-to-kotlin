// sealed class, when expression, smart casts, local function
package _03_traverseExample

interface Element
class Container(vararg val children: Element) : Element
class Text(val label: String) : Element

fun traverseAndConcatText(element: Element): String {
    val stringBuilder = StringBuilder() // why do we use string builder?
    traverse(element, stringBuilder)
    return stringBuilder.toString()
}

private fun traverse(element: Element, stringBuilder: StringBuilder) {
    if (element is Container) {
        val contaner = element as Container
        for (child in contaner.children) {
            traverse(child, stringBuilder)
        }
    } else if (element is Text) {
        val text = element as Text
        stringBuilder.appendLine(text.label)
    } else {
        throw IllegalStateException("$element is unknown")
    }
}
