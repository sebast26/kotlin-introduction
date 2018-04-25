package pl.sgorecki.kotlin;

class JavaClass {

    public void sayHello() {
        System.out.println("Hello from Java class!");
    }

    public static void main(String[] args) {
        final JavaClass javaClass = new JavaClass();
        javaClass.sayHello();

        final KotlinClass kotlinClass = new KotlinClass();
        kotlinClass.sayHello();
        System.out.println(kotlinClass.getName());
        final int age = kotlinClass.getAge();
        System.out.println(age);
        System.out.println(kotlinClass.getBirthday());
    }
}
