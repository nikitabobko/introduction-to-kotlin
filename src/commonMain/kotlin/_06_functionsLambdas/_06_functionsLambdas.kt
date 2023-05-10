// Functions: lambdas, single parameter lambda, last parameter lambda, inline functions (measure time, repeat)
package _06_functionsLambdas

import kotlinx.html.currentTimeMillis

fun main() {
    var fs = ""
    repeat(6) { // Q: what concerns do you have regarding this style?
        println(fs)   // A: performance! Show in bytecode viewer that it's optimized
        fs = ""
        println("piękny kod!")
    }
}

inline fun measureTime(body: (Int, String, Char) -> Unit): Long {
    val time = currentTimeMillis()
    body(1, "", 'f')
    return currentTimeMillis() - time
}