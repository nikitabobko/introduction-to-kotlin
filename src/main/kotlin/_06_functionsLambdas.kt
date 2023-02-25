// Functions: lambdas, single parameter lambda, last parameter lambda, inline functions (measure time, repeat)

fun main() {
    repeat(6, { // what concerns do you have regarding this style?
        println("mooi code!")
    })
    listOf(1, 2, 3)
        .map({ x -> x * 2 })
        .forEach({ x -> println(x) })
}
