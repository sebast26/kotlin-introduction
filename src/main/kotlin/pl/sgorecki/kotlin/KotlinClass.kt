package pl.sgorecki.kotlin

class KotlinClass {

    fun sayHello() {
        println("Hello, I'm Kotlin class!")
    }

}
fun main(args: Array<String>) {
    val javaClass = JavaClass()
    javaClass.printHello()
}
