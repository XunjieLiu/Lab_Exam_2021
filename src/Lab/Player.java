package Lab;

import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class Player {

    Set<GameCharacter> characters;

    /**
     * @param characters
     */
    public Player(Set<GameCharacter> characters) {
        this.characters = characters;
    }

    /**
     * @return Set<GameCharacter></GameCharacter>
     */
    public Set<GameCharacter> getCharacters() {
        return characters;
    }

    /**
     * @param character
     */
    public void AddCharacter(GameCharacter character) {
        this.characters.add(character);
    }

    public Set<GameCharacter> chooseCharacters(Power... neededPowers) {
        Set<GameCharacter> ret = new HashSet<GameCharacter>();
        for (Power neededPower : neededPowers) {
            boolean find = false;
            for (GameCharacter gameCharacter : characters) {
                for (Power power : gameCharacter.getPowers()) {
                    if (power.equals(neededPower)) {
                        ret.add(gameCharacter);
                        find = true;
                        break;
                    }
                }
                if (find) {
                    break;
                }
            }
            if (!find) {
                return null;
            }
        }
        return ret;
    }

}
