package pl.sgorecki.kotlin;

public class JavaClass {

    void printHello() {
        System.out.println("Hello, I'm Java class!");
    }


    public static void main(String[] args) {
        JavaClass javaClass = new JavaClass();
        javaClass.printHello();

        KotlinClass kotlinClass = new KotlinClass();
        kotlinClass.sayHello();
    }
}
