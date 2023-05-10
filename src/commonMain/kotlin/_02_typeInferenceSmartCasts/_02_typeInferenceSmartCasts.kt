// Type inference: Smart casts
package _02_typeInferenceSmartCasts

interface Animal {
    fun run()
}

class Cat : Animal {
    override fun run() = println("tap tap tap")
    fun meow() = println("meow")
}

class Dog : Animal {
    override fun run() = println("thump thump thump")
    fun woof() = println("woof")
}

fun runAndMakeSounds(animal: Animal) {
    animal.run()
    if (animal is Cat) {
        // In Java or any other statically typed
        // language that would be a compilation error
        animal.meow()
    }
    if (animal is Dog) {
        animal.woof()
    }
//    animal.meow() // compilation error in Kotlin (what if it was a dog?!)
}


















fun isNotEmptyString(str: Any): Boolean = str is String && str.length != 0
