package pl.sgorecki.kotlin

val firstName: String = "Seba"
val secondName: String? = null

var address: String = "Poznan"
fun tryToNullify() {
//    address = null
}

class PersonalInfo(val email: String?)
class Client(val personalInfo: PersonalInfo?)

fun getEmailOrNull(client: Client?): String? {
//    if (client == null) {
//        return null
//    }
//    if (client.personalInfo == null) {
//        return null
//    }
//    if (client.personalInfo.email == null) {
//        return null
//    }
//    return client.personalInfo.email
    return client?.personalInfo?.email
}