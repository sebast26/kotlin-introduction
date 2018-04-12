package pl.sgorecki.kotlin.interoperability.java;

import pl.sgorecki.kotlin.interoperability.kotlin.KotlinClass;

public class JavaClass {
    public void javaDoSomething() {
        new KotlinClass().sayHello();
    }

    public static void main(String[] args) {
        new JavaClass().javaDoSomething();
    }
}
