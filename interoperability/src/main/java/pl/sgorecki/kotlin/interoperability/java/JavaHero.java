package pl.sgorecki.kotlin.interoperability.java;

import org.jetbrains.annotations.NotNull;
import pl.sgorecki.kotlin.interoperability.kotlin.Hero;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaHero implements Hero  {

    private final String name;
    private final List<Hero> heroes = new ArrayList<>();

    public JavaHero(String name) {
        this.name = name;
    }

    @NotNull
    @Override
    public String shout() {
        String msg = "AGHR!! I am " + name + " Java hero! ";
        msg += "Currently I am fighting side by side with ";
        msg += heroes.stream().map(Hero::introduceYourself).collect(Collectors.joining(", "));
        return msg;
    }

    @Override
    public void cooperate(@NotNull Hero otherHero) {
        heroes.add(otherHero);
    }

    @NotNull
    @Override
    public String introduceYourself() {
        return name + " Java Hero";
    }

    @NotNull
    @Override
    public String fight() {
        return introduceYourself() + " Java is not dead!!";
    }
}
