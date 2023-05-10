// Basic syntax
package _01_basicSyntax

fun maxOf(a: Int, b: Int)  = if (a > b) a else b

fun describe(any: Any)  = when (any) {
    "Hello" -> "Greeting"
    is String -> "String"
    is Long, is Number -> "Integer"
    else -> "Something else"
}

class User(val name: String, val age: Int)

fun loops() {
    // Kotlin doesn't have C-style for loop! for (int i = 0; i < size; i++)
    for ((index, fruit) in listOf("Apple", "Banana", "Cherry").withIndex()) {
        println(fruit)
    }

    // But Kotlin has ranges as a replacement!
    for (i in 0..100) {
        println(i)
    }

    val fruits = listOf("Apple", "Banana", "Cherry")
    var i = 0
    while (i < fruits.size) {
        println(fruits[i])
        i++
    }
}