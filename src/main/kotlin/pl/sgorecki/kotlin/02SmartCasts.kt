package pl.sgorecki.kotlin

interface Mailer {
    fun sendMail(email: String, message: String)
}

fun sendMessageToClient(client: Client?, message: String, mailer: Mailer) {
    if (client?.personalInfo?.email == null) {
        return
    }

    mailer.sendMail(client.personalInfo.email, message)
}

open class Figure
class Square(val side: Int) : Figure()
class Rectangle(val a: Int, val b: Int): Figure()

fun area(figure: Figure): Int {
    return when (figure) {
        is Square -> figure.side * figure.side
        is Rectangle -> figure.a * figure.b
        else -> throw RuntimeException()
    }
}
