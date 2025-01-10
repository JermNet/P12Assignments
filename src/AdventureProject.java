/** This is meant to show the use of if statements, switches and their nested versions
 *
 * @author jwhitenect
 *
 */
import java.util.Scanner;

public class AdventureProject {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String name, food, input, cereal, end;
        int slowTime = 100;

        System.out.println("Do you hear that? It's being called, your name that is. What is it "
                + "that keeps on repeating?");
        name = key.nextLine();

        System.out.println("She's also saying your favorire food...");
        food = key.nextLine();

        System.out.println("" + name + ", " + name + " it's time to wake up, I have " + food + ""
                + ". It's your mother's voice but not her. Your clock has a record option that lets you"
                + " record the alarm sound and\nit seems she has done just that. It's more pleasant "
                + "than your standard 'beep beep' but you still don't want to wake up.\nWake up\nor"
                + "\nSleep in");
        input = key.nextLine().toLowerCase();

        if (input.equalsIgnoreCase("wake up")) {
            System.out.println("You sit up in your bed and glance at the no longer sounding "
                    + "clock. 'Six AM?' are the words that leave your mouth. You normally wake up at\n"
                    + "seven so this is an unwelcome suprise. Then, it occurs to you, it was daylight "
                    + "savings. 'Well there's no going back to bed now, might as\nwell have some of "
                    + "that cereal I have left.'");
            cereal = key.nextLine();

            System.out.println("You grab a bowl of " + cereal + " and sit down at the diner "
                    + "table, only to hear a knock at the door. You open up the door to find a "
                    + "newspaper\nat your feet. The front article reads...\n'Student Fails School"
                    + " System.'\n'New Ban on Earth Magic.'\n'Another Life Taken.'");
            input = key.nextLine().toLowerCase();

            if (input.equalsIgnoreCase("student fails school system")) {
                System.out.println("It's an article about how a student has started a club to"
                        + " change the school system for the better by the looks of it. You take the "
                        + "paper\nto your table and look over it a bit more. There's really nothing "
                        + "too interesting, just news. Not that you expected anything else. After\nyou"
                        + " finish eating you grab your bag and leave for school, it takes about 20"
                        + " minutes to get there so you should have time.");
                String timePass = "...";
                slowTime = 1800;
                typewriter(timePass, slowTime);
                System.out.println("\nYou reach the front of the school building with 5 minutes"
                        + " to spare. 'Turkey sandwich' are the first words that you hear standing "
                        + "\noutside of the school. You look beside you to see a woman and then you "
                        + "hear those words again, 'turkey sandwich'.\nTalk to her\nor\nDon't");
                input = key.nextLine().toLowerCase();

                if (input.equalsIgnoreCase("talk to her")) {
                    System.out.println("You go over to her and ask her 'what about a turkey"
                            + " sandwich?'. She seems suprised at first but then she says 'oh, I just"
                            + " forgot my lunch\nso I was thinking about what to buy. I'm Alice by "
                            + "the way.' You do your part and introduce yourself 'my name is " + name +
                            ", nice meeting\nyou.' You leave and shrug off the encounter as just "
                            + "something odd.");
                    typewriter(timePass, slowTime);
                    System.out.println("\nYou reach your class but right at the door you see "
                            + " the woman you met earlier. She notices you and waves. You head inside"
                            + " and go\nthroughout your classes. A week passes and you start having "
                            + "lunch with Alice. Then a few months with you starting to become closer "
                            + "to\neachother. On one Sunday evening the perfect moment presents itself."
                            + " 'The moon looks nice, don't you think?' she asks. 'Yeah' you say\nin "
                            + "response. Do you plan to ask her out?\nYes\nOr\nNo");
                    input = key.nextLine().toLowerCase();

                    switch (input) {
                        case "yes":
                            end = "Gathering up your courage you decide to ask her out."
                                    + " The word 'yes' greets your ears and a smile greets your face."
                                    + " Many long years pass and\neventually you and her get married.\n"
                                    + "Ending 2/9 'True Love': N.";
                            slowTime = 100;
                            typewriter(end, slowTime);
                            break;
                        case "no":
                            end = "Your words fail you, just staying silent for the rest of "
                                    + "the night. The two of you stay close friends for the remainder"
                                    + " of the school year but you end up drifting apart once both of"
                                    + " you graduate. In the end you never see one another again.\n"
                                    + "Ending 3/9 'A Sad End': P.";
                            slowTime = 100;
                            typewriter(end, slowTime);
                            break;
                    }

                } else if (input.equalsIgnoreCase("don't")) {
                    System.out.println("You walk past the odd woman and you go to the inside "
                            + "of the school building. It's the first day of the new semester so you"
                            + " take a glance at your course sheet. 'What class do I have right now?' "
                            + "you ask yourself.\nProgramming\nOr\nMath");
                    input = key.nextLine().toLowerCase();

                    if (input.equalsIgnoreCase("Programming")) {
                        System.out.println("By the looks of it you have your second programming"
                                + " class of the year. Luckily you already know the class and teacher "
                                + "so you go to the class as soon as possible. Sitting in your seat you"
                                + " did last year you place a sticky note on the corner of the computer"
                                + " screen. It's a password that reads 'password'. Booting up the "
                                + "computer it asks for the password.");
                        input = key.nextLine().toLowerCase();

                        if (input.equalsIgnoreCase("password")) {
                            end = "After putting in your password the class starts. 'Since all"
                                    + " of you where here last year or semester I'll start off with a "
                                    + "project. I would like you all to make a choose your own adventure"
                                    + ", if you have any questions, don't be afraid to ask.' You start "
                                    + "typing away with ideas floating in your head.\nEnding 4/9 'The "
                                    + "Meta One': L ";
                            slowTime = 100;
                            typewriter(end, slowTime);
                        } else if (input.equalsIgnoreCase("unplugged")) {

                        } else {
                            System.out.println("I'll let you in on a little secret. Get all "
                                    + "the endings, unscramble the letters and use the password.");
                        }
                    } else if (input.equalsIgnoreCase("Math")) {

                    } else {
                        System.out.println("Hate to break it to you but that wasn't an option. "
                                + "Spelling misteak maybe?");
                    }
                } else {
                    System.out.println("Hate to break it to you but that wasn't an option. "
                            + "Spelling misteak maybe?");
                }
            } else if (input.equalsIgnoreCase("new ban on earth magic")) {

            } else if (input.equalsIgnoreCase("another life taken")) {

            } else {
                System.out.println("Hate to break it to you but that wasn't an option. Spelling "
                        + "misteak maybe?");
            }
        } else if (input.equalsIgnoreCase("sleep in")) {
            end = "Whatever you have planned can wait, sleep is more important. "
                    + "You set your alarm to 10AM and drift back to sleep. Zzz.. Zzz... ...\nNever to "
                    + "wake up again.\nEnding 1/9 'Sleep Deprived': U.";
            typewriter(end, slowTime);
        } else {
            System.out.println("Hate to break it to you but that wasn't an option. Spelling "
                    + "misteak maybe?");
        }
        key.close();

    }

    public static void typewriter(String message, int pause) {
        try {
            for (int i = 0; i < message.length(); i++) {
                System.out.print(message.charAt(i));
                Thread.sleep(pause);
            }
        } catch (Exception evt) {
            System.out.println("error");
        }
    }

}