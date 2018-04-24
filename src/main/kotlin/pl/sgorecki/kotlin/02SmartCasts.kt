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