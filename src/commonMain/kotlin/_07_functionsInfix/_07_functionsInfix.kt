// Functions: infix (to, until, step)
package _07_functionsInfix

fun capitalToCountry(): Map<String, String> {
    val map = HashMap<String, String>()
    map.put("Warsaw", "Poland")
    map.put("Amsterdam", "Netherlands")
    map.put("Paris", "France")
    map.put("Rome", "Italy")
    map.put("Canberra", "Australia")
    mapOf(
        "Amsterdam" to "Netherlands",
        "Paris" to "France"
    )
    return map
}

fun main() {
    for (i in 0 until 100 step 2) {
        println(i)
    }
}
