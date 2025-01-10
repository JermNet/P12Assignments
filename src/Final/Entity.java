package Final;

/**This is meant to be an object representing a player or enemy character
 *
 * @author jwhitenect
 *
 */
public class Entity
{
    private int attack, defense, health, pSI;

    public Entity()
    {
        attack = 1;
        defense = 1;
        health = 1;
        pSI = 1;
    }

    public Entity(int a, int d, int h, int p)
    {
        attack = a;
        defense = d;
        health = h;
        pSI = p;
    }

    public void changeAttack(int a)
    {
        attack = a;
    }

    public int returnAttack()
    {
        return attack;
    }

    public void changeDefense(int d)
    {
        defense = d;
    }

    public int returnDefense()
    {
        return defense;
    }

    public void changeHealth(int h)
    {
        health = h;
    }

    public int returnHealth()
    {
        return health;
    }

    public void changePSI(int p)
    {
        pSI = p;
    }

    public int returnPSI()
    {
        return pSI;
    }

    public int takeDamage(int d)
    {
        health -= (d-defense);

        if(health <= 0)
        {
            health = 0;
        }

        return health;
    }

    public int usePSI(int p)
    {
        pSI -= p;

        if(pSI <= 0)
        {
            pSI = 0;
        }
        return pSI;
    }

    public void attackUp(int a)
    {
        attack += a;
    }

    public void defenseUp(int d)
    {
        defense += d;
    }

    public void pSIUp(int p)
    {
        pSI += p;
    }

    public void healthUp(int h)
    {
        health += h;
    }

    public void attackDown(int a)
    {
        attack -= a;
    }

    public void defenseDown(int d)
    {
        defense -= d;
    }

    public String toString()
    {
        return "Attack: " + attack + "\nDefense: " + defense + "\nHealth: " + health + "\nPSI: " + pSI;
    }


}