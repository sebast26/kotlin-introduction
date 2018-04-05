package pl.sgorecki.kotlin.interoperability.kotlin

class KotlinHero(val name: String) : Hero {

    val heroes: MutableList<Hero> = mutableListOf()

    override fun introduceYourself() = "$name Kotlin Hero"

    override fun shout(): String {
        var msg = "AGHR!! I am $name Kotlin hero! "
        msg += "Currently I am fighting side by side with "
        msg += heroes.map { it.introduceYourself() }.joinToString(", ")
        return msg
    }

    override fun cooperate(otherHero: Hero) {
        heroes.add(otherHero)
    }

    override fun fight(): String {
        return "${introduceYourself()} Kotlin fighting!!!"
    }
}