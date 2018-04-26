package pl.sgorecki.kotlin

val firstName: String = "always not null"
val secondName: String? = null

var address: String = "Poznan"
fun tryToNullify() {
//    address = null
}

class PersonalInfo(val email: String?)
class Client(val personalInfo: PersonalInfo?)

fun getEmailOrNull(client: Client?): String? {
    return client?.personalInfo?.email
}

