package pl.sgorecki.kotlin

import java.time.LocalDate

class KotlinClass {
    val name: String = "Seba"
    val age: Int = 34
    val birthday: LocalDate = LocalDate.of(1984, 2, 18)

    fun sayHello() {
        println("Hello from Kotlin class!")
    }
}

fun main(args: Array<String>) {
    val javaClass = JavaClass()
    javaClass.sayHello()
    val kotlinClass = KotlinClass()
    kotlinClass.sayHello()
}