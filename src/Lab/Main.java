package Lab;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        GameCharacter Robin = new GameCharacter("Robin", Power.WEAPONS);

        GameCharacter Star_fire = new GameCharacter("Star_fire", Power.FLIGHT, Power.ENERGY_BLAST);

        GameCharacter Cyborg = new GameCharacter("Cyborg", Power.STRENGTH, Power.WEAPONS);

        GameCharacter Beast_boy = new GameCharacter("Beast_boy", Power.TRANSFORMATION);

        GameCharacter Raven = new GameCharacter("Raven", Power.MAGIC);

        GameCharacter charArray[] = new GameCharacter[]{Robin, Star_fire, Cyborg, Beast_boy, Raven};

        Set<GameCharacter> charSet = new HashSet<GameCharacter>(Arrays.asList(charArray));

        Player player = new Player(charSet);

        Set<GameCharacter> ch = player.chooseCharacters(Power.WEAPONS, Power.MAGIC);

        for (GameCharacter c : ch) {
            System.out.println(c.toString());
        }

        System.out.println(Arrays.asList(charArray));
        System.out.println(charSet);
    }
}
