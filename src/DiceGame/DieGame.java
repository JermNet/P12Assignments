package DiceGame;

/**This program is a basic die game using the "Die" and "Scorecard" objects
 *
 * @author jwhitenect
 *
 */
import java.util.Scanner;

public class DieGame {

    public static void main(String[] args) {
        int diceStore = 0;
        int type = 100;
        String input, computer;
        Scanner key = new Scanner(System.in);
        Scorecard playerOne = new Scorecard();
        Scorecard playerTwo = new Scorecard();
        Die dice = new Die();

        System.out.println("Welcome to die(game). The rules are simple, you get to roll a die "
                + "as many times as you like to get points valued at your roll but\nif you roll a one all"
                + " your points are forfeit. Whoever gets to 50 first wins! Would you like to play "
                + "against a human (PVP) or play\nagainst a computer (PVC)?");
        input = key.nextLine().toLowerCase();

        if (input.equalsIgnoreCase("pvp")) {
            System.out.println("Please put in your name player one.");
            playerOne.keepName(key.nextLine());

            System.out.println("Please put in your name player two.");
            playerTwo.keepName(key.nextLine());

            do {
                if (playerOne.getOverall() < 50 || playerTwo.getOverall() < 50) {
                    do {
                        diceStore = dice.roll();
                        playerOne.changeScore(diceStore);
                        System.out.println("\nYou rolled a " + diceStore + ", " + playerOne.toString() + ""
                                + "!\nYour current round score is: " + playerOne.getRound());

                        if (diceStore == 1) {

                            playerOne.resetScore();
                            System.out.println("Sorry, but you got a one. Your turn is now over.");
                            break;
                        } else if (diceStore != 1) {
                            System.out.println("Do you want to 'roll' or 'stop'?");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("stop")) {
                                playerOne.addScoreToScore();
                                playerOne.resetScore();
                                playerOne.getOverall();
                                System.out.println("You wanted to stop, " + playerOne.toString() + ""
                                        + "\nYour turn is now over.");
                                if (playerOne.getOverall() >= 50) {
                                    System.out.println("Congratz, you won the game!");

                                }
                                break;
                            }

                        }

                    } while (true);
                }
                if (playerOne.getOverall() >= 50) {
                    break;
                }
                if (playerOne.getOverall() < 50 || playerTwo.getOverall() < 50) {
                    do {
                        diceStore = dice.roll();
                        playerTwo.changeScore(diceStore);
                        System.out.println("\nYou rolled a " + diceStore + ", " + playerTwo.toString() + ""
                                + "!\nYour current round score is: " + playerTwo.getRound());

                        if (diceStore != 1) {
                            System.out.println("Do you want to 'roll' or 'stop'?");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("stop")) {
                                playerTwo.addScoreToScore();
                                playerTwo.resetScore();
                                playerTwo.getOverall();
                                System.out.println("You wanted to stop, " + playerTwo.toString() + ""
                                        + "\nYour turn is now over.");
                                break;
                            }

                        } else if (diceStore == 1) {
                            playerTwo.resetScore();
                            System.out.println("Sorry, but you got a one. Your turn is now over.");
                            break;
                        }

                    } while (true);

                }
                if (playerTwo.getOverall() >= 50) {
                    System.out.println("Congratz, you won the game!");
                    break;
                }
            } while (true);

        } else if (input.equalsIgnoreCase("pvc")) {
            System.out.println("Please put in your name player one.");
            playerOne.keepName(key.nextLine());

            do {
                if (playerOne.getOverall() < 50 || playerTwo.getOverall() < 50) {
                    do {
                        diceStore = dice.roll();
                        playerOne.changeScore(diceStore);
                        System.out.println("\nYou rolled a " + diceStore + ", " + playerOne.toString() + ""
                                + "!\nYour current round score is: " + playerOne.getRound());

                        if (diceStore != 1) {
                            System.out.println("Do you want to 'roll' or 'stop'?");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("stop")) {
                                playerOne.addScoreToScore();
                                playerOne.resetScore();
                                playerOne.getOverall();
                                System.out.println("You wanted to stop, " + playerOne.toString() + ""
                                        + "\nYour turn is now over.");
                                if (playerOne.getOverall() >= 50) {
                                    System.out.println("Congratz, you won the game!");

                                }
                                break;

                            }
                        }

                        else if (diceStore == 1) {
                            playerOne.resetScore();
                            System.out.println("Sorry, but you got a one. Your turn is now over.");
                            break;
                        }

                    } while (true);
                }
                if (playerOne.getOverall() >= 50 || playerTwo.getOverall() >= 50) {
                    break;
                }
                if (playerOne.getOverall() < 50 || playerTwo.getOverall() < 50) {
                    do {
                        diceStore = dice.roll();
                        playerTwo.changeScore(diceStore);
                        System.out.println("\nComputer rolled a " + diceStore + ""
                                + "!\nComputer's current round score is: " + playerTwo.getRound());

                        if (diceStore != 1) {
                            computer = "Computer is deciding on what to do next.";
                            typewriter(computer, type);
                            if (Math.random() > 0.75) {
                                playerTwo.addScoreToScore();
                                playerTwo.resetScore();
                                playerTwo.getOverall();
                                System.out.println("\nComputer wanted to stop! Computer's turn is now over.");
                                break;
                            }

                        } else if (diceStore == 1) {
                            playerTwo.resetScore();
                            System.out.println("\nComputer got a one. It's turn is now over.");
                            break;
                        }
                    } while (true);

                } else if (playerOne.getOverall() >= 50 || playerTwo.getOverall() >= 50) {
                    break;
                }
                if (playerTwo.getOverall() >= 50) {
                    System.out.println("Computer won the game!");
                    break;
                }
            } while (true);

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
