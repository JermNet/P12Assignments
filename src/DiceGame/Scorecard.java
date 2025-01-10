package DiceGame;

/**
 * This program creates a scorecard.
 *
 * @author jwhitenect
 *
 */
public class Scorecard {

    String name;
    private int round, overall;

    public Scorecard() {
        round = 0;
        overall = 0;
    }

    public Scorecard(int r, int o) {
        round = r;
        overall = o;
    }

    public void keepName(String theName) {
        name = theName;
    }

    public String showName() {
        return name;
    }

    public void changeScore(int n) {
        round += n;
    }

    public int getRound() {
        return round;
    }

    public void resetScore() {
        round = 0;
    }

    public void addScoreToScore() {
        overall = round + overall;
    }

    public int getOverall() {
        return overall;
    }

    public String toString() {
        return "" + name + "!\nYou have " + overall + " overall points!";
    }
}
