package pl.sgorecki.kotlin.interoperability.java;

import pl.sgorecki.kotlin.interoperability.kotlin.IamKotlin;

public class IamJava {

    private IamKotlin kotlin;

    public void setKotlin(IamKotlin kotlin) {
        this.kotlin = kotlin;
    }

    public void tell() {
        System.out.println("Invoking Java code");
        System.out.println("I can call Kotlin code: " + kotlin.features());
    }

    public String features() {
        return "Lambda, NIO, checked exceptions...";
    }

}
