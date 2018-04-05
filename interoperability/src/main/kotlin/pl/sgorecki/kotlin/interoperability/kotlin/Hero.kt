package pl.sgorecki.kotlin.interoperability.kotlin

interface Hero {
    fun introduceYourself(): String
    fun shout(): String
    fun cooperate(otherHero: Hero)
    fun fight(): String
}