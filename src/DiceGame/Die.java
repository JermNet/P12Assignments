package DiceGame;

/** This program creates a dice.
 *
 * @author jwhitenect
 *
 */
import java.util.Random;

public class Die {

    private int sides;

    public Die() {
        sides = 6;
    }

    public Die(int s) {
        sides = s;
    }

    public int roll() {
        Random rng = new Random();
        return rng.nextInt(6) + 1;
    }
}
