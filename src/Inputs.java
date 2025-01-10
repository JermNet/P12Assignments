import java.util.Scanner;

public class Inputs {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String characterOne, characterTwo, characterThree, name, evil, verb, weapon, location, town;
        int year;
        System.out.println("Hey, how's it going? Do me a favor and give me a year.");
        year = key.nextInt();
        System.out.println("I think I would do well with your name next.");
        key.nextLine();
        name = key.nextLine();
        System.out.println("Okay " + name + " give a town name.");
        town = key.nextLine();
        System.out.println("Who's your favorite video game character?");
        characterOne = key.nextLine();
        System.out.println("Can't say I've heard of " + characterOne + " but that doesn't matter. Now I think"
                + " a celeb would be funny.");
        characterTwo = key.nextLine();
        System.out.println("Alright, I think one more character would be nice, doesn't matter where from.");
        characterThree = key.nextLine();
        System.out.println("Thanks for that, now a verb with 'ing' if you don't mind.");
        verb = key.nextLine();
        System.out.println("A company is next up, a real or made up.");
        evil = key.nextLine();
        System.out.println("We're getting close to the finish line, a fictional weapon is on the list.");
        weapon = key.nextLine();
        System.out.println("This is the last one, a location is needed.");
        location = key.nextLine();

        System.out.println("The year is " + year + " it seems that in " + location + ", all hope is lost."
                + " But one brave hero decides make people smile once again, " + name + "! It's up to you!"
                + " After " + name + "\ntravels through the town of " + town + " they meet up with two more "
                + "heros, " + characterOne + " and " + characterTwo + ". Together the three "
                + "heroes " + name + ", " + characterOne + " and, of course,\n" + characterTwo + " encounter"
                + " the most fearsome foe " + characterThree + "! After " + verb + " them to the ground, they "
                + "where defeated. After the defeat of " + characterThree + " the three heroes take their\n"
                + "weapon, " + weapon + "! With this they aproach the final boss, " + evil + ". Because "
                + "of their newly obtained weapon our heroes defeat " + evil + " in one blow, \nsaving the "
                + "land of " + location + " for good! \nThe end.");
        key.close();
    }

}
