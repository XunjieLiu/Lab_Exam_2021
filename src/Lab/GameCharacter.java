package Lab;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class GameCharacter {
    private final String name;
    private final Set<Power> powers;

    public GameCharacter(String name,Power... power) {
        this.name = name;
        this.powers = new HashSet<Power>(Arrays.asList(power));
    }

    public String getName() {
        return name;
    }

    public Set<Power> getPowers() {
        return powers;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "Name=" + name +
                ", Powers=" + powers +
                "}";
    }

}
