package Final;
/**This program is meant to be a simple random guessing game.
 *
 * @author jwhitenect
 *
 */
import java.util.Random;
import java.util.Scanner;

public class RiddleGame {
    public static void main(String args[]) {
        Random rng = new Random();
        Scanner key = new Scanner(System.in);

        int item, score, timesPlayed;
        String name, input;
        item = 0;
        score = 0;
        timesPlayed = 0;

        System.out.println(
                "Welcome to the item guessing game! You will get 3 guesses to guess a randomly generated item. The less guesses you use the higher score you get, "
                        + "\nyour name comes first though.");
        name = key.nextLine();
        while (true) {
            if (timesPlayed == 3) {
                timesPlayed = 0;
                System.out.println(name + ", after three rounds you have a score of " + score
                        + " (starts at 3 points per round and subtracts"
                        + " 1 for each wrong guess). Would you like to play again?\n[YES]\nOr\n[NO]");
                input = key.nextLine().toLowerCase();
                if (input.equalsIgnoreCase("yes")) {

                } else if (input.equalsIgnoreCase("no")) {
                    System.out.println("Thank's for playing The Guessing Game by: Jeremy Whitenect.");
                    break;
                } else {
                    System.out.println("That is not a valid option.");
                }
            }

            item = rng.nextInt(15);
            if (item == 0) {
                timesPlayed++;
                System.out.println("" + name + ", time to guess your item, your first hint is that it's green.");
                input = key.nextLine().toLowerCase();
                if (input.equalsIgnoreCase("hulk") || input.equalsIgnoreCase("the hulk")
                        || input.equalsIgnoreCase("the incredible hulk")) {
                    score += 3;
                    System.out.println("You guessed correctly.\nYour score is: " + score
                            + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {

                    } else if (input.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                        break;
                    } else {
                        System.out.println("That is not a valid option.");
                    }
                } else {
                    System.out.println("Second try, second hint: His real first inital is 'B'");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("hulk") || input.equalsIgnoreCase("the hulk")
                            || input.equalsIgnoreCase("the incredible hulk")) {
                        score += 2;
                        System.out.println("You guessed correctly.\nYour score is: " + score
                                + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                        input = key.nextLine().toLowerCase();
                        if (input.equalsIgnoreCase("yes")) {

                        } else if (input.equalsIgnoreCase("no")) {
                            System.out.println("Thank's for playing The Guessing Game by: Jeremy Whitenect.");
                            break;
                        } else {
                            System.out.println("That is not a valid option.");
                        }
                    } else {
                        System.out.println("This is your final chance, " + name
                                + ". You final hint is that he was originally a doctor.");
                        input = key.nextLine().toLowerCase();
                        if (input.equalsIgnoreCase("hulk") || input.equalsIgnoreCase("the hulk")
                                || input.equalsIgnoreCase("the incredible hulk")) {
                            score += 1;
                            System.out.println("You guessed correctly.\nYour score is: " + score
                                    + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("yes")) {

                            } else if (input.equalsIgnoreCase("no")) {
                                System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                                break;
                            } else {
                                System.out.println("That is not a valid option.");
                            }
                        } else {
                            System.out.println(
                                    "Sorry, you ran out of guesses, the answer was 'The Hulk'. Your final score is: "
                                            + score + ".\nWould you like to play again?\n[YES]\nOr\n[NO]");
                            if (input.equalsIgnoreCase("yes")) {

                            } else if (input.equalsIgnoreCase("no")) {
                                System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                                break;
                            } else {
                                System.out.println("That is not a valid option.");
                            }
                        }

                    }

                }

            } else if (item == 1) {
                timesPlayed++;
                System.out.println("Your first hint is that this object is a sphere.");
                input = key.nextLine().toLowerCase();
                if (input.equalsIgnoreCase("8 ball") || input.equalsIgnoreCase("eight ball")
                        || input.equalsIgnoreCase("8-ball")) {
                    score += 3;
                    System.out.println("You guessed correctly.\nYour score is: " + score
                            + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {

                    } else if (input.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                        break;
                    } else {
                        System.out.println("That is not a valid option.");
                    }
                } else {
                    System.out.println("Alrighty, " + name + " your second hint is that it's black and white.");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("8 ball") || input.equalsIgnoreCase("eight ball")
                            || input.equalsIgnoreCase("8-ball")) {
                        score += 2;
                        System.out.println("You guessed correctly.\nYour score is: " + score
                                + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                        input = key.nextLine().toLowerCase();
                        if (input.equalsIgnoreCase("yes")) {

                        } else if (input.equalsIgnoreCase("no")) {
                            System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                            break;
                        } else {
                            System.out.println("That is not a valid option.");
                        }
                    } else {
                        System.out.println(
                                "This is you last chance, " + name + ". Your final hint is that you ask it something.");
                        input = key.nextLine().toLowerCase();
                        if (input.equalsIgnoreCase("8 ball") || input.equalsIgnoreCase("eight ball")
                                || input.equalsIgnoreCase("8-ball")) {
                            score += 1;
                            System.out.println("You guessed correctly.\nYour score is: " + score
                                    + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("yes")) {

                            } else if (input.equalsIgnoreCase("no")) {
                                System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                                break;
                            } else {
                                System.out.println("That is not a valid option.");
                            }
                        } else {
                            System.out.println(
                                    "Sorry, you ran out of guesses, the answer was '8-ball'. Your final score is: "
                                            + score + ".\nWould you like to play again?\n[YES]\nOr\n[NO]");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("yes")) {

                            } else if (input.equalsIgnoreCase("no")) {
                                System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                                break;
                            } else {
                                System.out.println("That is not a valid option.");
                            }
                        }
                    }
                }
            } else if (item == 2) {
                timesPlayed++;
                System.out.println("Hint number one is that they are very cool.");
                input = key.nextLine().toLowerCase();
                if (input.equalsIgnoreCase(name) || input.equalsIgnoreCase("me")) {
                    score += 3;
                    System.out.println("You guessed correctly.\nYour score is: " + score
                            + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {

                    } else if (input.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                        break;
                    } else {
                        System.out.println("That is not a valid option.");
                    }
                } else {
                    System.out.println("Try number two, your hint is that you know this very well.");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase(name) || input.equalsIgnoreCase("me")) {
                        score += 2;
                        System.out.println("You guessed correctly.\nYour score is: " + score
                                + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                        input = key.nextLine().toLowerCase();
                        if (input.equalsIgnoreCase("yes")) {

                        } else if (input.equalsIgnoreCase("no")) {
                            System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                            break;
                        } else {
                            System.out.println("That is not a valid option.");
                        }
                    } else {
                        System.out.println("This is your last chance, this is yourself.");
                        input = key.nextLine().toLowerCase();
                        if (input.equalsIgnoreCase(name) || input.equalsIgnoreCase("me")) {
                            score += 1;
                            System.out.println("You guessed correctly.\nYour score is: " + score
                                    + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("yes")) {

                            } else if (input.equalsIgnoreCase("no")) {
                                System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                                break;
                            } else {
                                System.out.println("That is not a valid option.");
                            }
                        } else {
                            System.out.println(
                                    "Sorry, you ran out of guesses, the answer was '8-ball'. Your final score is: "
                                            + score + ".\nWould you like to play again?\n[YES]\nOr\n[NO]");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("yes")) {

                            } else if (input.equalsIgnoreCase("no")) {
                                System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                                break;
                            } else {
                                System.out.println("That is not a valid option.");
                            }
                        }

                    }
                }
            } else if (item == 3) {
                timesPlayed++;
                System.out.println(name + ", your first hint is that this is a fictional character.");
                input = key.nextLine().toLowerCase();
                if (input.equalsIgnoreCase("son goku") || input.equalsIgnoreCase("goku")) {
                    score += 3;
                    System.out.println("You guessed correctly.\nYour score is: " + score
                            + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {

                    } else if (input.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                        break;
                    } else {
                        System.out.println("That is not a valid option.");
                    }
                } else {
                    System.out.println("Your second hint of three is that this character has multiple forms.");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("son goku") || input.equalsIgnoreCase("goku")) {
                        score += 2;
                        System.out.println("You guessed correctly.\nYour score is: " + score
                                + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                        input = key.nextLine().toLowerCase();
                        if (input.equalsIgnoreCase("yes")) {

                        } else if (input.equalsIgnoreCase("no")) {
                            System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                            break;
                        } else {
                            System.out.println("That is not a valid option.");
                        }
                    } else {
                        System.out.println("This is the final guess, you hint is that this character has spikey hair.");
                        input = key.nextLine();
                        if (input.equalsIgnoreCase("son goku") || input.equalsIgnoreCase("goku")) {
                            score += 1;
                            System.out.println("You guessed correctly.\nYour score is: " + score
                                    + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("yes")) {

                            } else if (input.equalsIgnoreCase("no")) {
                                System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                                break;
                            } else {
                                System.out.println("That is not a valid option.");
                            }
                        } else {
                            System.out.println(
                                    "Sorry, you ran out of guesses, the answer was 'Goku'. Your final score is: "
                                            + score + ".\nWould you like to play again?\n[YES]\nOr\n[NO]");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("yes")) {

                            } else if (input.equalsIgnoreCase("no")) {
                                System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                                break;
                            } else {
                                System.out.println("That is not a valid option.");
                            }
                        }
                    }
                }
            } else if (item == 4) {
                timesPlayed++;
                System.out.println("You must guess an item, your hint is that it's red and white");
                input = key.nextLine().toLowerCase();
                if (input.equalsIgnoreCase("pokeball")) {
                    score += 3;
                    System.out.println("You guessed correctly.\nYour score is: " + score
                            + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {

                    } else if (input.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                        break;
                    } else {
                        System.out.println("That is not a valid option.");
                    }
                } else {
                    System.out.println("You got it wrong, your second hint is that it's a ball.");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("pokeball")) {
                        score += 2;
                        System.out.println("You guessed correctly.\nYour score is: " + score
                                + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                        input = key.nextLine().toLowerCase();
                        if (input.equalsIgnoreCase("yes")) {

                        } else if (input.equalsIgnoreCase("no")) {
                            System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                            break;
                        } else {
                            System.out.println("That is not a valid option.");
                        }
                    } else {
                        System.out.println("Final hint here: It's from a game.");
                        input = key.nextLine().toLowerCase();
                        if (input.equalsIgnoreCase("pokeball")) {
                            score += 1;
                            System.out.println("You guessed correctly.\nYour score is: " + score
                                    + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("yes")) {

                            } else if (input.equalsIgnoreCase("no")) {
                                System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                                break;
                            } else {
                                System.out.println("That is not a valid option.");
                            }
                        } else {
                            System.out.println(
                                    "Sorry, you ran out of guesses, the answer was 'Pokeball'. Your final score is: "
                                            + score + ".\nWould you like to play again?\n[YES]\nOr\n[NO]");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("yes")) {

                            } else if (input.equalsIgnoreCase("no")) {
                                System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                                break;
                            } else {
                                System.out.println("That is not a valid option.");
                            }
                        }
                    }
                }
            } else if (item == 5) {
                timesPlayed++;
                System.out.println("Here is your first hint: It's in most homes.");
                input = key.nextLine().toLowerCase();
                if (input.equalsIgnoreCase("computer")) {
                    score += 3;
                    System.out.println("You guessed correctly.\nYour score is: " + score
                            + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {

                    } else if (input.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                        break;
                    } else {
                        System.out.println("That is not a valid option.");
                    }
                } else {
                    System.out.println("The second hint is that it's an electronic.");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("computer")) {
                        score += 2;
                        System.out.println("You guessed correctly.\nYour score is: " + score
                                + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                        input = key.nextLine().toLowerCase();
                        if (input.equalsIgnoreCase("yes")) {

                        } else if (input.equalsIgnoreCase("no")) {
                            System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                            break;
                        } else {
                            System.out.println("That is not a valid option.");
                        }
                    } else {
                        System.out.println("This is your final hint, you are using one right now.");
                        input = key.nextLine().toLowerCase();
                        if (input.equalsIgnoreCase("computer")) {
                            score += 1;
                            System.out.println("You guessed correctly.\nYour score is: " + score
                                    + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("yes")) {

                            } else if (input.equalsIgnoreCase("no")) {
                                System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                                break;
                            } else {
                                System.out.println("That is not a valid option.");
                            }
                        } else {
                            System.out.println(
                                    "Sorry, you ran out of guesses, the answer was 'Computer'. Your final score is: "
                                            + score + ".\nWould you like to play again?\n[YES]\nOr\n[NO]");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("yes")) {

                            } else if (input.equalsIgnoreCase("no")) {
                                System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                                break;
                            } else {
                                System.out.println("That is not a valid option.");
                            }
                        }
                    }
                }
            } else if (item == 6) {
                timesPlayed++;
                System.out.println("Your first hint for your item is that it has two states.");
                input = key.nextLine().toLowerCase();
                if (input.equalsIgnoreCase("boolean")) {
                    score += 3;
                    System.out.println("You guessed correctly.\nYour score is: " + score
                            + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {

                    } else if (input.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                        break;
                    } else {
                        System.out.println("That is not a valid option.");
                    }
                } else {
                    System.out.println("Hint number two is that it's similar to yes and no.");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("boolean")) {
                        score += 2;
                        System.out.println("You guessed correctly.\nYour score is: " + score
                                + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                        input = key.nextLine().toLowerCase();
                        if (input.equalsIgnoreCase("yes")) {

                        } else if (input.equalsIgnoreCase("no")) {
                            System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                            break;
                        } else {
                            System.out.println("That is not a valid option.");
                        }

                    } else {
                        System.out.println("Hint number three is that it's a basic of programming.");
                        input = key.nextLine().toLowerCase();
                        if (input.equalsIgnoreCase("boolean")) {
                            score += 1;
                            System.out.println("You guessed correctly.\nYour score is: " + score
                                    + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("yes")) {

                            } else if (input.equalsIgnoreCase("no")) {
                                System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                                break;
                            } else {
                                System.out.println("That is not a valid option.");
                            }
                        } else {
                            System.out.println(
                                    "Sorry, you ran out of guesses, the answer was 'Boolean'. Your final score is: "
                                            + score + ".\nWould you like to play again?\n[YES]\nOr\n[NO]");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("yes")) {

                            } else if (input.equalsIgnoreCase("no")) {
                                System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                                break;
                            } else {
                                System.out.println("That is not a valid option.");
                            }
                        }
                    }
                }
            } else if (item == 7) {
                timesPlayed++;
                System.out.println("Hint number one, it is a movie.");
                input = key.nextLine().toLowerCase();
                if (input.equalsIgnoreCase("sonic") || input.equalsIgnoreCase("sonic movie")
                        || input.equalsIgnoreCase("the sonic movie")) {
                    score += 3;
                    System.out.println("You guessed correctly.\nYour score is: " + score
                            + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {

                    } else if (input.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                        break;
                    } else {
                        System.out.println("That is not a valid option.");
                    }
                } else {
                    System.out.println("The second hint is that this movie is based on a game.");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("sonic") || input.equalsIgnoreCase("sonic movie")
                            || input.equalsIgnoreCase("the sonic movie")) {
                        score += 2;
                        System.out.println("You guessed correctly.\nYour score is: " + score
                                + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                        input = key.nextLine().toLowerCase();
                        if (input.equalsIgnoreCase("yes")) {

                        } else if (input.equalsIgnoreCase("no")) {
                            System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                            break;
                        } else {
                            System.out.println("That is not a valid option.");
                        }
                    } else {
                        System.out.println("Your final hint is that the main character is blue.");
                        input = key.nextLine().toLowerCase();
                        if (input.equalsIgnoreCase("sonic") || input.equalsIgnoreCase("sonic movie")
                                || input.equalsIgnoreCase("the sonic movie")) {
                            score += 1;
                            System.out.println("You guessed correctly.\nYour score is: " + score
                                    + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("yes")) {

                            } else if (input.equalsIgnoreCase("no")) {
                                System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                                break;
                            } else {
                                System.out.println("That is not a valid option.");
                            }
                        } else {
                            System.out.println(
                                    "Sorry, you ran out of guesses, the answer was 'The Sonic Movie'. Your final score is: "
                                            + score + ".\nWould you like to play again?\n[YES]\nOr\n[NO]");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("yes")) {

                            } else if (input.equalsIgnoreCase("no")) {
                                System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                                break;
                            } else {
                                System.out.println("That is not a valid option.");
                            }
                        }
                    }
                }
            } else if (item == 8) {
                timesPlayed++;
                System.out.println("Hint number one of three is that it's yellow");
                input = key.nextLine().toLowerCase();
                if (input.equalsIgnoreCase("pacman") || input.equalsIgnoreCase("pac-man")) {
                    score += 3;
                    System.out.println("You guessed correctly.\nYour score is: " + score
                            + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {

                    } else if (input.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                        break;
                    } else {
                        System.out.println("That is not a valid option.");
                    }
                } else {
                    System.out.println("Hint number two of three is that he has a wife.");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("pacman") || input.equalsIgnoreCase("pac-man")) {
                        score += 2;
                        System.out.println("You guessed correctly.\nYour score is: " + score
                                + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                        input = key.nextLine().toLowerCase();
                        if (input.equalsIgnoreCase("yes")) {

                        } else if (input.equalsIgnoreCase("no")) {
                            System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                            break;
                        } else {
                            System.out.println("That is not a valid option.");
                        }
                    } else {
                        System.out.println("Hint number three of three is that he had more than one T.V. show.");
                        input = key.nextLine().toLowerCase();
                        if (input.equalsIgnoreCase("pacman") || input.equalsIgnoreCase("pac-man")) {
                            score += 1;
                            System.out.println("You guessed correctly.\nYour score is: " + score
                                    + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("yes")) {

                            } else if (input.equalsIgnoreCase("no")) {
                                System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                                break;
                            } else {
                                System.out.println("That is not a valid option.");
                            }
                        } else {
                            System.out.println(
                                    "Sorry, you ran out of guesses, the answer was 'Pac-Man'. Your final score is: "
                                            + score + ".\nWould you like to play again?\n[YES]\nOr\n[NO]");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("yes")) {

                            } else if (input.equalsIgnoreCase("no")) {
                                System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                                break;
                            } else {
                                System.out.println("That is not a valid option.");
                            }
                        }
                    }
                }
            } else if (item == 9) {
                timesPlayed++;
                System.out.println("Hint number one is that it is typically at a high temprature.");
                input = key.nextLine().toLowerCase();
                if (input.equalsIgnoreCase("coffee")) {
                    score += 3;
                    System.out.println("You guessed correctly.\nYour score is: " + score
                            + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {

                    } else if (input.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                        break;
                    } else {
                        System.out.println("That is not a valid option.");
                    }
                } else {
                    System.out.println("Most put white granules in it.");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("coffee")) {
                        score += 2;
                        System.out.println("You guessed correctly.\nYour score is: " + score
                                + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                        input = key.nextLine().toLowerCase();
                        if (input.equalsIgnoreCase("yes")) {

                        } else if (input.equalsIgnoreCase("no")) {
                            System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                            break;
                        } else {
                            System.out.println("That is not a valid option.");
                        }
                    } else {
                        System.out.println("It is a commonly drunk in the morning.");
                        input = key.nextLine().toLowerCase();
                        if (input.equalsIgnoreCase("coffee")) {
                            score += 1;
                            System.out.println("You guessed correctly.\nYour score is: " + score
                                    + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("yes")) {

                            } else if (input.equalsIgnoreCase("no")) {
                                System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                                break;
                            } else {
                                System.out.println("That is not a valid option.");
                            }
                        } else {
                            System.out.println(
                                    "Sorry, you ran out of guesses, the answer was 'Coffee'. Your final score is: "
                                            + score + ".\nWould you like to play again?\n[YES]\nOr\n[NO]");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("yes")) {

                            } else if (input.equalsIgnoreCase("no")) {
                                System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                                break;
                            } else {
                                System.out.println("That is not a valid option.");
                            }
                        }
                    }
                }
            } else if (item == 10) {
                timesPlayed++;
                System.out.println("Hint number one is that he is blue");
                input = key.nextLine().toLowerCase();
                if (input.equalsIgnoreCase("mega man") || input.equalsIgnoreCase("megaman")) {
                    score += 3;
                    System.out.println("You guessed correctly.\nYour score is: " + score
                            + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {

                    } else if (input.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                        break;
                    } else {
                        System.out.println("That is not a valid option.");
                    }
                } else {
                    System.out.println("Number two is that he shoots things with many different weapons");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("mega man") || input.equalsIgnoreCase("megaman")) {
                        score += 2;
                        System.out.println("You guessed correctly.\nYour score is: " + score
                                + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                        input = key.nextLine().toLowerCase();
                        if (input.equalsIgnoreCase("yes")) {

                        } else if (input.equalsIgnoreCase("no")) {
                            System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                            break;
                        } else {
                            System.out.println("That is not a valid option.");
                        }
                    } else {
                        System.out.println("Final chance, " + name + ". Your hint is that he is from Capcom.");
                        input = key.nextLine().toLowerCase();
                        if (input.equalsIgnoreCase("mega man") || input.equalsIgnoreCase("megaman")) {
                            score += 1;
                            System.out.println("You guessed correctly.\nYour score is: " + score
                                    + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("yes")) {

                            } else if (input.equalsIgnoreCase("no")) {
                                System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                                break;
                            } else {
                                System.out.println("That is not a valid option.");
                            }
                        } else {
                            System.out.println(
                                    "Sorry, you ran out of guesses, the answer was 'Megaman'. Your final score is: "
                                            + score + ".\nWould you like to play again?\n[YES]\nOr\n[NO]");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("yes")) {

                            } else if (input.equalsIgnoreCase("no")) {
                                System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                                break;
                            } else {
                                System.out.println("That is not a valid option.");
                            }
                        }
                    }
                }
            } else if (item == 11) {
                timesPlayed++;
                System.out.println("The first hint is that he is a lawyer.");
                input = key.nextLine().toLowerCase();
                if (input.equalsIgnoreCase("saul") || input.equalsIgnoreCase("saul goodman")) {
                    score += 3;
                    System.out.println("You guessed correctly.\nYour score is: " + score
                            + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {

                    } else if (input.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                        break;
                    } else {
                        System.out.println("That is not a valid option.");
                    }
                } else {
                    System.out.println("Hint number two is that he is from a spin-off show.");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("saul") || input.equalsIgnoreCase("saul goodman")) {
                        score += 2;
                        System.out.println("You guessed correctly.\nYour score is: " + score
                                + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                        input = key.nextLine().toLowerCase();
                        if (input.equalsIgnoreCase("yes")) {

                        } else if (input.equalsIgnoreCase("no")) {
                            System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                            break;
                        } else {
                            System.out.println("That is not a valid option.");
                        }
                    } else {
                        System.out.println("His initals are 'S.G.'");
                        input = key.nextLine().toLowerCase();
                        if (input.equalsIgnoreCase("saul") || input.equalsIgnoreCase("saul goodman")) {
                            score += 1;
                            System.out.println("You guessed correctly.\nYour score is: " + score
                                    + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("yes")) {

                            } else if (input.equalsIgnoreCase("no")) {
                                System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                                break;
                            } else {
                                System.out.println("That is not a valid option.");
                            }
                        } else {
                            System.out.println(
                                    "Sorry, you ran out of guesses, the answer was 'Saul Goodman'. Your final score is: "
                                            + score + ".\nWould you like to play again?\n[YES]\nOr\n[NO]");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("yes")) {

                            } else if (input.equalsIgnoreCase("no")) {
                                System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                                break;
                            } else {
                                System.out.println("That is not a valid option.");
                            }
                        }
                    }
                }
            } else if (item == 12) {
                timesPlayed++;
                System.out.println("He is a superhero, that is your first hint.");
                input = key.nextLine().toLowerCase();
                if (input.equalsIgnoreCase("spiderman") || input.equalsIgnoreCase("spider-man")
                        || input.equalsIgnoreCase("spider man")) {
                    score += 3;
                    System.out.println("You guessed correctly.\nYour score is: " + score
                            + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {

                    } else if (input.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                        break;
                    } else {
                        System.out.println("That is not a valid option.");
                    }
                } else {
                    System.out.println("His powers are based off of a bug-like creature.");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("spiderman") || input.equalsIgnoreCase("spider-man")
                            || input.equalsIgnoreCase("spider man")) {
                        score += 2;
                        System.out.println("You guessed correctly.\nYour score is: " + score
                                + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                        input = key.nextLine().toLowerCase();
                        if (input.equalsIgnoreCase("yes")) {

                        } else if (input.equalsIgnoreCase("no")) {
                            System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                            break;
                        } else {
                            System.out.println("That is not a valid option.");
                        }
                    } else {
                        System.out.println("The last hint is that this superhero is from Marvel.");
                        input = key.nextLine().toLowerCase();
                        if (input.equalsIgnoreCase("spiderman") || input.equalsIgnoreCase("spider-man")
                                || input.equalsIgnoreCase("spider man")) {
                            score += 1;
                            System.out.println("You guessed correctly.\nYour score is: " + score
                                    + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("yes")) {

                            } else if (input.equalsIgnoreCase("no")) {
                                System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                                break;
                            } else {
                                System.out.println("That is not a valid option.");
                            }
                        } else {
                            System.out.println(
                                    "Sorry, you ran out of guesses, the answer was 'Spider-Man'. Your final score is: "
                                            + score + ".\nWould you like to play again?\n[YES]\nOr\n[NO]");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("yes")) {

                            } else if (input.equalsIgnoreCase("no")) {
                                System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                                break;
                            } else {
                                System.out.println("That is not a valid option.");
                            }
                        }
                    }
                }
            } else if (item == 13) {
                timesPlayed++;
                System.out.println("Hint number one is that is made by the company Nintendo");
                input = key.nextLine().toLowerCase();
                if (input.equalsIgnoreCase("nintendo 64")) {
                    score += 3;
                    System.out.println("You guessed correctly.\nYour score is: " + score
                            + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {

                    } else if (input.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                        break;
                    } else {
                        System.out.println("That is not a valid option.");
                    }
                } else {
                    System.out.println("Hint number two is that it is a console.");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("nintendo 64")) {
                        score += 2;
                        System.out.println("You guessed correctly.\nYour score is: " + score
                                + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                        input = key.nextLine().toLowerCase();
                        if (input.equalsIgnoreCase("yes")) {

                        } else if (input.equalsIgnoreCase("no")) {
                            System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                            break;
                        } else {
                            System.out.println("That is not a valid option.");
                        }
                    } else {
                        System.out.println("Your final hint is that is asociated with a number that starts with '6'.");
                        input = key.nextLine().toLowerCase();
                        if (input.equalsIgnoreCase("nintendo 64")) {
                            score += 1;
                            System.out.println("You guessed correctly.\nYour score is: " + score
                                    + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("yes")) {

                            } else if (input.equalsIgnoreCase("no")) {
                                System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                                break;
                            } else {
                                System.out.println("That is not a valid option.");
                            }
                        } else {
                            System.out.println(
                                    "Sorry, you ran out of guesses, the answer was 'Nintendo 64'. Your final score is: "
                                            + score + ".\nWould you like to play again?\n[YES]\nOr\n[NO]");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("yes")) {

                            } else if (input.equalsIgnoreCase("no")) {
                                System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                                break;
                            } else {
                                System.out.println("That is not a valid option.");
                            }
                        }
                    }
                }
            } else if (item == 14) {
                timesPlayed++;
                System.out.println("First chance, " + name + ". Your hint is that it can fly");
                input = key.nextLine().toLowerCase();
                if (input.equalsIgnoreCase("pigeon") || input.equalsIgnoreCase("a pigeon")) {
                    score += 3;
                    System.out.println("You guessed correctly.\nYour score is: " + score
                            + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {

                    } else if (input.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                        break;
                    } else {
                        System.out.println("That is not a valid option.");
                    }
                } else {
                    System.out.println("Your second hint is that it is grey.");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("pigeon") || input.equalsIgnoreCase("a pigeon")) {
                        score += 2;
                        System.out.println("You guessed correctly.\nYour score is: " + score
                                + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                        input = key.nextLine().toLowerCase();
                        if (input.equalsIgnoreCase("yes")) {

                        } else if (input.equalsIgnoreCase("no")) {
                            System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                            break;
                        } else {
                            System.out.println("That is not a valid option.");
                        }
                    } else {
                        System.out.println("Your final hint is that it is common in New York");
                        input = key.nextLine().toLowerCase();
                        if (input.equalsIgnoreCase("pigeon") || input.equalsIgnoreCase("a pigeon")) {
                            score += 1;
                            System.out.println("You guessed correctly.\nYour score is: " + score
                                    + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("yes")) {

                            } else if (input.equalsIgnoreCase("no")) {
                                System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                                break;
                            } else {
                                System.out.println("That is not a valid option.");
                            }
                        } else {
                            System.out.println(
                                    "Sorry, you ran out of guesses, the answer was 'A crow'. Your final score is: "
                                            + score + ".\nWould you like to play again?\n[YES]\nOr\n[NO]");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("yes")) {

                            } else if (input.equalsIgnoreCase("no")) {
                                System.out.println("Thanks for playing The Guessing Game by: Jeremy Whitenect.");
                                break;
                            } else {
                                System.out.println("That is not a valid option.");
                            }
                        }
                    }
                }
            }

        }
        key.close();
    }
}
