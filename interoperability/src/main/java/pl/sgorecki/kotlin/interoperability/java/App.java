package pl.sgorecki.kotlin.interoperability.java;

import pl.sgorecki.kotlin.interoperability.kotlin.IamKotlin;
import pl.sgorecki.kotlin.interoperability.kotlin.KotlinHero;

public class App {

    public static void main(String[] args) {

        JavaHero lambda_man = new JavaHero("Lambda Man");
        JavaHero java10 = new JavaHero("Java 10");
        KotlinHero knigh_of_the_old_npe = new KotlinHero("Knigh of the Old NPE");
        KotlinHero pudliszki = new KotlinHero("Pudliszki");

        lambda_man.cooperate(knigh_of_the_old_npe);
        lambda_man.cooperate(pudliszki);

        pudliszki.cooperate(java10);

        knigh_of_the_old_npe.cooperate(java10);
        knigh_of_the_old_npe.cooperate(pudliszki);

        System.out.println(lambda_man.shout());
        System.out.println(java10.shout());
        System.out.println(knigh_of_the_old_npe.shout());
        System.out.println(pudliszki.shout());

        IamJava java = new IamJava();
        IamKotlin kotlin = new IamKotlin();
        java.setKotlin(kotlin);
        kotlin.setJava(java);

        java.tell();
        kotlin.tell();
    }
}
