/** This is meant to show the use of switches
 *
 * @author jwhitenect
 *
 */
import java.util.Scanner;

public class Switches {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String rhyme;
        System.out.println("I would like you to select one of these three nursery rhymes.\nFor"
                + " Mary Had a Little Lamb type 'mary'.\nFor Hey Diddle Diddle type 'diddle'.\nFor Old "
                + "MacDonald Had a Farm type 'macdonald'.");

        rhyme = key.nextLine().toLowerCase();

        switch (rhyme) {
            case "mary":
                System.out.println("\t\tMary had a little lamb,\n\t       little lamb, little "
                        + "lamb,\n\t\tMary had a little lamb,\n\t     It's fleece was white as snow"
                        + "\n\t       Everywhere that Mary went,\n\t\t  Mary went, Mary went\n"
                        + "\t       Everywhere that Mary went,\n\t\tThe lamb was sure to go.");
                break;

            case "diddle":
                System.out.println("\t\tHey diddle diddle\n\t      The cat and the fiddle\n\t\t"
                        + "  The cow jumped\n\t\t  Over the moon.\n\t      The little dog laughed\n\t"
                        + "\tTo see such a sport.\n\t\t   And the dish\n\t     Ran away with the "
                        + "spoon.");
                break;

            case "macdonald":
                System.out.println("\t\tOld MacDonald had a farm\n\t\t       E I E I O\n\t  "
                        + "     And on that farm there were\n\t\t       Some ducks\n\t\t       E "
                        + "I E I O\n\t\t With a quack quack here\n\t\t And a quack quack there\n\t\t"
                        + "Here a quack, there a quack\n\t\t Everywhere a quack-quack \n\t\tOld "
                        + "MacDonald had a farm\n\t\t       E I E I O");

        }
        key.close();
    }

}
