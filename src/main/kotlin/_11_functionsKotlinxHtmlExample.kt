// Functions: kotlinx.html example
import kotlinx.html.*
import kotlinx.html.stream.createHTML

fun main() {
    val html = createHTML().html {
        head {
            title { +"HTML encoding with Kotlin!" }
        }
        body {
            h1 { +"HTML encoding with Kotlin" }
            p { +"this format can be used as an alternative markup to HTML" }

            // an element with attributes and text content
            a(href = "https://kotlinlang.org") { +"Kotlin" }

            // mixed content
            p {
                +"This is some"
                b { +"mixed" }
                +"text. For more see the"
                a(href = "https://kotlinlang.org") { +"Kotlin" }
                +"project"
            }
            p { +"some text" }
        }
    }
    println(html)
}