package pl.sgorecki.kotlin

sealed class Figure
class Square(val side: Int) : Figure()
class Rectangle(val a: Int, val b: Int) : Figure()

fun area(figure: Figure): Int {
    throw RuntimeException()
}