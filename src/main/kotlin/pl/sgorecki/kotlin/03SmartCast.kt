package pl.sgorecki.kotlin

sealed class Figure
class Square(val side: Int) : Figure()
class Rectangle(val a: Int, val b: Int) : Figure()

fun area(figure: Figure): Int {
    return when(figure) {
        is Square -> figure.side * figure.side
        is Rectangle -> figure.a * figure.b
    }
}