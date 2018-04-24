package pl.sgorecki.kotlin

fun foo(name: String, age: Number = 34, toUpperCase: Boolean = true) = "SEBA"

fun run() {
    foo("Seba") + foo("Seba", toUpperCase = false) + foo("Seba", age = 1, toUpperCase = false)
}

