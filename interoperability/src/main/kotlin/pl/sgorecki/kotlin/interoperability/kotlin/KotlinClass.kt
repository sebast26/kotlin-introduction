package pl.sgorecki.kotlin.interoperability.kotlin

import pl.sgorecki.kotlin.interoperability.java.JavaClass

class KotlinClass {
    fun kotlinDoSomething() {
        val javaClass = JavaClass()
        javaClass.javaDoSomething()
    }

    fun sayHello() {
        println("Hello")
    }

}

fun main(args : Array<String>) {
    KotlinClass().kotlinDoSomething()
}