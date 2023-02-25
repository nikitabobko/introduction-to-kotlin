// Basic syntax
fun maxOf(a: Int, b: Int): Int {
    var result: Int = 0
    if (a > b) {
        result = a
    } else {
        result = b
    }
    return result
}

fun describe(any: Any): String {
    when (any) {
        "Hello" -> return "Greeting"
        is String -> return "String"
        is Long, is Number -> return "Integer"
        else -> return "Something else"
    }
}

class User {
    val name: String
    val age: Int

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}

fun loops() {
    // Kotlin doesn't have C-style for loop! for (int i = 0; i < size; i++)
    for (fruit in listOf("Apple", "Banana", "Cherry")) {
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