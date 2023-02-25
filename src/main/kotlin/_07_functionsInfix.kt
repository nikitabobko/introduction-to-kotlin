// Functions: infix (to, until, step)

fun capitalToCountry(): Map<String, String> {
    val map = HashMap<String, String>()
    map.put("Amsterdam", "Netherlands")
    map.put("Paris", "France")
    map.put("Rome", "Italy")
    map.put("Canberra", "Australia")
    return map
}

fun main() {
    for (i in 0..100) {
        println(i)
    }
}
