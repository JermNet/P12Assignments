package Final;

/**This is meant to be an object representing a video game version of a basketball player
 *
 * @author jwhitenect
 *
 */
//Sport = Basketball
public class Athlete
{
    private double power, speed, jumpHeightFeet, shotDistanceFeet;
    private int shotsMade, shotsMissed;

    public Athlete()
    {
        shotsMade = 0;
        shotsMissed = 0;
        power = 0;
        speed = 0;
        jumpHeightFeet = 0;
        shotDistanceFeet = 0;
    }

    public Athlete(double p, double s, double jHF, double sDF, int sMA, int sMI)
    {
        power = p;
        speed = s;
        jumpHeightFeet = jHF;
        shotDistanceFeet = sDF;
        shotsMade = sMA;
        shotsMissed = sMI;
    }

    public void changePower(double d)
    {
        power = d;
    }

    public double returnPower()
    {
        return power;
    }

    public void changeSpeed(double d)
    {
        speed = d;
    }

    public double returnSpeed()
    {
        return speed;
    }

    public void changeJumpHeight(double d)
    {
        jumpHeightFeet = d;
    }

    public double returnJumpHeight()
    {
        return jumpHeightFeet;
    }

    public void changeShotDistance(double d)
    {
        shotDistanceFeet = d;
    }

    public double returnShotDistance()
    {
        return shotDistanceFeet;
    }

    public void changeShotsMade(int i)
    {
        shotsMade = i;
    }

    public int returnShotsMade()
    {
        return shotsMade;
    }

    public void changeShotsMissed(int i)
    {
        shotsMissed = i;
    }

    public int returnShotsMissed()
    {
        return shotsMissed;
    }

    public double getAverage()
    {
        return shotsMade/shotsMissed;
    }

    public double getAccuracy()
    {
        return (power*jumpHeightFeet)/(shotDistanceFeet/2);
    }

    public double getPassAccuracy()
    {
        return (power*speed) + shotDistanceFeet;
    }

    public String toString()
    {
        return "POWER: " + power + "\nSPEED: " + speed + "\nJUMP HEIGHT: " + jumpHeightFeet + "\nSHOT DISTANCE" + shotDistanceFeet + "\nSHOTS MADE: " + shotsMade + "\nSHOTS MISSED:"
                + " " + shotsMissed;
    }
}
