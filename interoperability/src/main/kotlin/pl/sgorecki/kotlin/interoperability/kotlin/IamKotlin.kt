package pl.sgorecki.kotlin.interoperability.kotlin

import pl.sgorecki.kotlin.interoperability.java.IamJava

class IamKotlin {

    var java: IamJava? = null

    fun tell() {
        println("Invoked from Kotlin!")
        println("I can call Java code: " + java?.features())
    }

    fun features(): String = "100% interop, NPE, collections..."

}