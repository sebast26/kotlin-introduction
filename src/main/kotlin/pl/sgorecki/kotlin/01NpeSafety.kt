package pl.sgorecki.kotlin

val firstName: String = "Seba"
val secondName: String? = null

class PersonalInfo(val email: String?)
class Client(val personalInfo: PersonalInfo?)

fun getEmailOrNull(client: Client?): String? {
    return client?.personalInfo?.email
}

