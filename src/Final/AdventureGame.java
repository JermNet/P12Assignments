package Final;
/**This program is meant to be a short adventure game with RPG elements
 *
 * @author jwhitenect
 *
 */
import java.util.Scanner;
import java.util.Random;

public class AdventureGame {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        Random rng = new Random();
        String input, name;
        name = "The Player";
        boolean goop = false, defend = false, tryAgain = false, water = false;
        int battleRNG = 0;

        while (true) {
            System.out.println(
                    "Welcome to this text-adventure RPG, please select an option...\n[START GAME]\n[SET NAME]\n[QUIT]");
            input = key.nextLine().toLowerCase();
            if (input.equalsIgnoreCase("start game")) {
                break;
            } else if (input.equalsIgnoreCase("set name")) {
                System.out.println("Please input YOUR name, not the player's name.");
                name = key.nextLine();
            } else if (input.equalsIgnoreCase("quit")) {
                System.out.println("Thanks for playing my adventure game by: Jeremy Whitenect");
                System.exit(0);
            }
        }
        while (true) {
            goop = false;
            water = false;
            tryAgain = false;
            Entity death = new Entity(16, 7, 31, 10);
            Entity trashGoopDX = new Entity(14, 6, 27, 5);
            Entity dad = new Entity(8, 4, 11, 2);
            Entity trashGoop = new Entity(10, 4, 16, 4);
            Entity sandMan = new Entity(14, 7, 25, 7);
            Entity player = new Entity(10, 5, 20, 5);

            System.out.println(
                    "Weird things have been going on in the recently so you must go out and find some answers. Do you want to "
                            + "leave now or check out the kitchen.\n[LEAVE]\n[KITCHEN]\n(Press any key to check stats)");
            input = key.nextLine().toLowerCase();
            if (input.equalsIgnoreCase("kitchen")) {
                System.out.println(
                        "You go downstairs and take a look around the kitchen. Right when you think 'this is a stupid idea' you"
                                + " find a nice frypan, great for hitting\npeople with. \n(Attack + 1)\nAfter obtaining the pan you continue to the"
                                + " living room.");
                player.attackUp(1);
                input = "leave";
            }
            if (input.equalsIgnoreCase("leave")) {
                System.out.println(
                        "Before leaving you have to pass through the living room, encountering your dad. 'Hey sport, how about "
                                + "a spar with your old man?' He says\nthat to you.\n[YES]\n[NO]");
                input = key.nextLine();
                System.out.println("'Like you have any choice in the matter, bud!'\nDAD engages in a spar!");
                while (true) {
                    battleRNG = rng.nextInt(100) + 1;
                    if (defend == true) {
                        player.defenseDown(2);
                        defend = false;
                    }

                    if (player.returnHealth() <= 0) {
                        System.out.println("'Nice try sport, but you can't beat me.'\nTry again?\n[YES]\n[NO]");
                        input = key.nextLine().toLowerCase();
                        if (input.equalsIgnoreCase("yes")) {
                            tryAgain = true;
                            break;
                        } else if (input.equalsIgnoreCase("no")) {
                            System.out.println("Thanks for playing my adventure game by: Jeremy Whitenect");
                            System.exit(0);
                        }
                    }

                    System.out.println("[ATTACK]\n[MAGIC]\n[DEFEND]\n[CHECK]");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("attack")) {
                        System.out.println(
                                "Wack! DAD has " + dad.takeDamage(player.returnAttack()) + " health remaining!");
                    } else if (input.equalsIgnoreCase("magic")) {
                        if (player.returnPSI() > 0) {
                            System.out.println("Boom! Crash! DAD takes double damage, leaving "
                                    + dad.takeDamage(player.returnAttack() * 2) + " "
                                    + "health remaining!\nPSI remaining " + player.usePSI(1) + "!");
                        } else if (player.returnPSI() <= 0) {
                            System.out.println("Not enough PSI!");
                        }
                    } else if (input.equalsIgnoreCase("defend")) {
                        System.out.println("You cross you arms protecting your body.\n(defense +2 this turn)");
                        player.defenseUp(2);
                        defend = true;
                    } else if (input.equalsIgnoreCase("check")) {
                        System.out.println("It's your dad, a very cool fellow.\n" + dad.toString());
                    } else {
                        System.out.println(player.toString());
                    }

                    if (dad.returnHealth() <= 0) {
                        break;
                    }

                    if (battleRNG <= 70) {
                        System.out.println("DAD comes swinging with a whisk! " + player.takeDamage(dad.returnAttack())
                                + " health remaining!");
                    } else if (battleRNG > 70 && battleRNG <= 90) {
                        if (dad.returnPSI() > 0) {
                            System.out.println("DAD throws a cake at you for double damage! "
                                    + player.takeDamage(dad.returnAttack() * 2) + ""
                                    + " health remaining!");
                            dad.usePSI(1);
                        } else if (dad.returnPSI() <= 0) {
                            System.out.println("DAD tries to throw a cake at you but doesn't have enough PSI!");
                        }

                    } else if (battleRNG > 90) {
                        System.out.println("DAD trips over his pant leg and loses a turn!");
                    }

                }

                if (tryAgain == false) {
                    player.attackUp(2);
                    player.defenseUp(1);
                    player.healthUp(10);
                    player.pSIUp(1);
                    System.out.println(
                            "'Good job sport, you beat your old man.'\n(Attack +2, Defense +1, Health +10, PSI +1)\nAfter telling your"
                                    + " dad you're going to check out the town he tells you to be careful. After a bit of walking you make it the city. On your"
                                    + " left there's a sign that says \n'weird trash can this way', to your right there's a small store and straight ahead is deeper into the city.");

                    while (true) {
                        if (tryAgain == true) {
                            break;
                        }
                        if (tryAgain == false) {
                            System.out.println("[TRASH]\n[STORE]\n[CITY]");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("trash")) {
                                System.out.println(
                                        "The sign interests you so you decide to take a look. After walking a little distance you see the can"
                                                + " in question. It's just as it says,\nweird and is it moving?\n[PROVOKE IT]\n[GO BACK]");
                                input = key.nextLine().toLowerCase();
                                if (input.equalsIgnoreCase("provoke it")) {
                                    System.out.println(
                                            "You grab a stick off the ground and poke the blue liquid in the trash. The liquid seems angry. "
                                                    + "As you turn around to leave it jumps at you!\nTRASH GOOP engages in a spar!");
                                    while (true) {
                                        battleRNG = rng.nextInt(100) + 1;
                                        if (defend == true) {
                                            player.defenseDown(2);
                                        }

                                        if (player.returnHealth() <= 0) {
                                            System.out.println("'Blurp, blorp.'\nTry again?\n[YES]\n[NO]");
                                            input = key.nextLine().toLowerCase();
                                            if (input.equalsIgnoreCase("yes")) {
                                                tryAgain = true;
                                                break;
                                            } else if (input.equalsIgnoreCase("no")) {
                                                System.out.println(
                                                        "Thanks for playing my adventure game by: Jeremy Whitenect");
                                                System.exit(0);
                                            }
                                        }

                                        System.out.println("[ATTACK]\n[MAGIC]\n[DEFEND]\n[CHECK]");
                                        input = key.nextLine().toLowerCase();
                                        if (input.equalsIgnoreCase("attack")) {
                                            System.out.println("Slam! TRASH GOOP has "
                                                    + trashGoop.takeDamage(player.returnAttack())
                                                    + " health remaining!");
                                        } else if (input.equalsIgnoreCase("magic")) {
                                            if (player.returnPSI() > 1) {
                                                player.healthUp(10);
                                                System.out.println("A healing wave blows forth! Health up! "
                                                        + player.returnHealth() + " "
                                                        + "health remaining!\nPSI remaining " + player.usePSI(2) + "!");
                                            } else if (player.returnPSI() <= 1) {
                                                System.out.println("Not enough PSI!");
                                            }
                                        } else if (input.equalsIgnoreCase("defend")) {
                                            System.out.println(
                                                    "You cross you arms protecting your body.\n(defense +2 this turn)");
                                            player.defenseUp(2);
                                            defend = true;
                                        } else if (input.equalsIgnoreCase("check")) {
                                            System.out.println(
                                                    "It's a weird slime like creature, it smells like mouthwash.\n"
                                                            + trashGoop.toString());
                                        } else {
                                            System.out.println(player.toString());
                                        }

                                        if (trashGoop.returnHealth() <= 0) {
                                            goop = true;
                                            input = "city";
                                            System.out.println(
                                                    "You defeat the goop and most of it disolves into a puddle leaving a small bit left. You,"
                                                            + " the sane person you are, you grab the liquid and place\nit in your pocket for later.\n(Attack +3,"
                                                            + " Defense +2, Health +7, PSI +3)");
                                            player.attackUp(3);
                                            player.defenseUp(2);
                                            player.healthUp(7);
                                            player.pSIUp(3);
                                            break;
                                        }

                                        if (battleRNG <= 70) {
                                            System.out.println("TRASH GOOP flings part of it's body at you! "
                                                    + player.takeDamage(trashGoop.returnAttack())
                                                    + " health remaining!");
                                        } else if (battleRNG > 70 && battleRNG <= 90) {
                                            if (trashGoop.returnPSI() > 0) {
                                                System.out.println(
                                                        "TRASH GOOP summons a wave of slime for double damage! "
                                                                + player.takeDamage(trashGoop.returnAttack() * 2) + ""
                                                                + " health remaining!");
                                                trashGoop.usePSI(1);
                                            } else if (trashGoop.returnPSI() <= 0) {
                                                System.out.println(
                                                        "TRASH GOOP tries to make a slime wave but doesn't have enough PSI!");
                                            }

                                        } else if (battleRNG > 90) {
                                            System.out.println("TRASH GOOP is loafing around and loses a turn!");
                                        }
                                    }

                                } else if (input.equalsIgnoreCase("go back")) {
                                    System.out.print(
                                            "To be honest that trash can is a little bit too weird, even for you. You walk your way back to"
                                                    + " the start of the city and detour to the store\nbefore going deep into the city.");
                                    input = "store";
                                }
                            }
                            if (tryAgain == false) {

                                if (input.equalsIgnoreCase("store")) {
                                    System.out.println(
                                            " \nEven though you go to the store you don't really have any money so you just look around for a bit."
                                                    + " After looking for a bit a weird guy says\n'hey kid, want so perfectly normal water?' Despite the extremely odd "
                                                    + "statement, the water looks untampered with and it could come in \nuseful later.\n[TAKE]\n[DON'T]");
                                    input = key.nextLine().toLowerCase();
                                    if (input.equalsIgnoreCase("take")) {
                                        System.out.println(
                                                "You accept the perfectly normal water and go to leave the store, when you go to thank "
                                                        + "the man you find that he isn't there. Confused, you \nhead for the deeper city.");
                                        water = true;
                                        input = "city";
                                    } else if (input.equalsIgnoreCase("don't") || input.equalsIgnoreCase("dont")) {
                                        System.out.println(
                                                "The man seems... sus at best so you decide to ignore him and head for the deeper city");
                                        input = "city";
                                    }
                                }

                                if (input.equalsIgnoreCase("city")) {
                                    System.out.println(
                                            "Heading into the deeper city it gets a lot louder and the people all blend together but you see"
                                                    + " something odd, a guy that seems to be made of\nsand goes toward the bus stop. But this might be a trap, if there's"
                                                    + " an enemy base around it would likely be in the middle of the city.\n[BUS]\n[MIDDLE CITY]");
                                    input = key.nextLine().toLowerCase();
                                    if (input.equalsIgnoreCase("bus")) {
                                        System.out.println(
                                                "You walk over to the bus stop and the sand man in nowhere to be seen. You decide to "
                                                        + "take a look at the bus schedule, the bus for the\ndesert is leaving soon...\n[DESERT]\n[MIDDLE CITY]");
                                        input = key.nextLine().toLowerCase();
                                        if (input.equalsIgnoreCase("desert")) {
                                            System.out.print(
                                                    "The bus arives shortly and after the hour long bus ride you're in the desert, where everything looks the same..."
                                                            + "Well, time to get moving!\n[NORTH]\n[EAST]\n[SOUTH]\n[WEST]");
                                            input = key.nextLine();
                                            System.out.println(
                                                    "Everything looks the same.\n[NORTH]\n[EAST]\n[SOUTH]\n[WEST]");
                                            input = key.nextLine();
                                            System.out.println(
                                                    "Everything really looks the same.\n[NORTH]\n[EAST]\n[SOUTH]\n[WEST]");
                                            input = key.nextLine();
                                            System.out.println(
                                                    "Everything REALLY looks the same.\n[NORTH]\n[EAST]\n[SOUTH]\n[WEST]");
                                            input = key.nextLine();
                                            if (water == true) {
                                                System.out.println(
                                                        "You start to feel dehydrated but luckily you still have that water bottle in you bag! After drinking"
                                                                + " it up continue to wander the desert, finding\nsome weird, alien like ruins. 'This must be the aliens base' you think to "
                                                                + "yourself. But as you enter the ruins the door shuts behind you and\nthe sand man from eariler appears, making a threatening"
                                                                + " pose! SAND MAN engages in a spar!");
                                                while (true) {
                                                    battleRNG = rng.nextInt(100) + 1;
                                                    if (defend == true) {
                                                        player.defenseDown(2);
                                                        defend = false;
                                                    }

                                                    if (player.returnHealth() <= 0) {
                                                        System.out.println(
                                                                "'As you lay there, out of health, the sand man insults you.'\nTry again?\n[YES]\n[NO]");
                                                        input = key.nextLine().toLowerCase();
                                                        if (input.equalsIgnoreCase("yes")) {
                                                            tryAgain = true;
                                                            break;
                                                        } else if (input.equalsIgnoreCase("no")) {
                                                            System.out.println(
                                                                    "Thanks for playing my adventure game by: Jeremy Whitenect");
                                                            System.exit(0);
                                                        }
                                                    }

                                                    System.out.println("[ATTACK]\n[MAGIC]\n[DEFEND]\n[CHECK]");
                                                    input = key.nextLine().toLowerCase();
                                                    if (input.equalsIgnoreCase("attack")) {
                                                        System.out.println("Bam! SAND MAN has "
                                                                + sandMan.takeDamage(player.returnAttack())
                                                                + " health remaining!");
                                                    } else if (input.equalsIgnoreCase("magic")) {
                                                        if (player.returnPSI() > 0) {
                                                            System.out.println(
                                                                    "Slap! Chop! SAND MAN takes double damage, leaving "
                                                                            + sandMan.takeDamage(
                                                                            player.returnAttack() * 2)
                                                                            + " "
                                                                            + "health remaining!\nPSI remaining "
                                                                            + player.usePSI(1) + "!");
                                                        } else if (player.returnPSI() <= 0) {
                                                            System.out.println("Not enough PSI!");
                                                        }
                                                    } else if (input.equalsIgnoreCase("defend")) {
                                                        System.out.println(
                                                                "You cross you arms protecting your body.\n(defense +2 this turn)");
                                                        player.defenseUp(2);
                                                        defend = true;
                                                    } else if (input.equalsIgnoreCase("check")) {
                                                        System.out.println("It's a sandy man, not much else to say.\n"
                                                                + sandMan.toString());
                                                    } else {
                                                        System.out.println(player.toString());
                                                    }

                                                    if (sandMan.returnHealth() <= 0) {
                                                        break;
                                                    }

                                                    if (battleRNG <= 70) {
                                                        System.out.println("SAND MAN throws sand in your shorts! "
                                                                + player.takeDamage(sandMan.returnAttack())
                                                                + " health remaining!");
                                                    } else if (battleRNG > 70 && battleRNG <= 95) {
                                                        if (sandMan.returnPSI() > 0) {
                                                            System.out.println(
                                                                    "SAND MAN makes a hammer out of sand and hits you for double damage! "
                                                                            + player.takeDamage(
                                                                            sandMan.returnAttack() * 2)
                                                                            + ""
                                                                            + " health remaining!");
                                                            sandMan.usePSI(1);
                                                        } else if (sandMan.returnPSI() <= 0) {
                                                            System.out.println(
                                                                    "SAND MAN attempts to make a hammer out of sand but doesn't have enough PSI!");
                                                        }

                                                    } else if (battleRNG > 95) {
                                                        if (sandMan.returnPSI() > 0) {
                                                            System.out.println(
                                                                    "SAND MAN makes a knife out of sand and hits your arm for triple damage! "
                                                                            + player.takeDamage(
                                                                            sandMan.returnAttack() * 3)
                                                                            + ""
                                                                            + " health remaining!");
                                                            sandMan.usePSI(1);
                                                        } else if (sandMan.returnPSI() <= 0) {
                                                            System.out.println(
                                                                    "SAND MAN attempts to make a knife out of sand but doesn't have enough PSI!");
                                                        }
                                                    }

                                                }
                                                if (tryAgain == false) {
                                                    System.out.println(
                                                            "The man of sand turns to a pile of dust and is defeated. You believe that you have defeated the "
                                                                    + "weirdness going on but there could be more\ngoing on out there... Play again?\n[YES]\n[NO]");
                                                    input = key.nextLine().toLowerCase();
                                                    if (input.equalsIgnoreCase("yes")) {
                                                        tryAgain = true;
                                                        break;
                                                    } else if (input.equalsIgnoreCase("no")) {
                                                        System.out.println(
                                                                "Thanks for playing my adventure game by: Jeremy Whitenect");
                                                        System.exit(0);
                                                    }
                                                }
                                            } else if (goop == true) {
                                                System.out.print(
                                                        "You start to feel dehydrated.\n[NORTH]\n[EAST]\n[SOUTH]\n[WEST]");
                                                input = key.nextLine();
                                                System.out.println(
                                                        "You really don't want to do this but the dehydration is starting to get worse, that slime is still"
                                                                + " in your pocket. It's either this or die so\nyou grab the slime from your pocket and relectantly injest it. Everything "
                                                                + "seems in check.\n[NORTH]\n[EAST]\n[SOUTH]\n[WEST]");
                                                input = key.nextLine();
                                                System.out.println(
                                                        "HRCK! You fall into the desert sand. Turns out that the slime was poisonous. May you never find out the"
                                                                + " mysterious nature of the desert?\nPlay again?\n[YES]\n[NO]");
                                                input = key.nextLine().toLowerCase();
                                                if (input.equalsIgnoreCase("yes")) {

                                                } else if (input.equalsIgnoreCase("no")) {
                                                    System.out.println(
                                                            "Thanks for playing my adventure game by: Jeremy Whitenect");
                                                    System.exit(0);
                                                }
                                            } else if (goop == false && water == false) {
                                                System.out.println(
                                                        "You start to feel dehydrated.\n[NORTH]\n[EAST]\n[SOUTH]\n[WEST]");
                                                input = key.nextLine();
                                                System.out.println(
                                                        "You are feeling dehydated.\n[NORTH]\n[EAST]\n[SOUTH]\n[WEST]");
                                                input = key.nextLine();
                                                System.out.println(
                                                        "You are REALLY feeling dehydrated.\n[NORTH]\n[EAST]\n[SOUTH]\n[WEST]");
                                                input = key.nextLine();
                                                System.out.println(
                                                        "The dehydration gets to you and you lie dead in the desert. May you never find out the mysterious nature"
                                                                + " of the desert? play again?\n[YES]\n[NO]");
                                                input = key.nextLine().toLowerCase();
                                                if (input.equalsIgnoreCase("yes")) {
                                                    tryAgain = true;
                                                } else if (input.equalsIgnoreCase("no")) {
                                                    System.out.println(
                                                            "Thanks for playing my adventure game by: Jeremy Whitenect");
                                                    System.exit(0);
                                                }
                                            }
                                        } else if (input.equalsIgnoreCase("middle city")) {
                                            if (tryAgain == false) {
                                                if (water == true) {
                                                    System.out.println(
                                                            "You continue on into the city and sure enough, you find an odd looking building. Right before you hit the "
                                                                    + "buzzer on the front enterance, a demon king looking guy jumps out of a window and lands behind you. The demon king looking "
                                                                    + "guy takes the water bottle from your bag and evaporates it, then you. That's right, demons hate water THAT much. Try again?\n"
                                                                    + "[YES]\n[NO]");
                                                    input = key.nextLine().toLowerCase();
                                                    if (input.equalsIgnoreCase("yes")) {

                                                    } else if (input.equalsIgnoreCase("no")) {
                                                        System.out.println(
                                                                "Thanks for playing my adventure game by: Jeremy Whitenect");
                                                        System.exit(0);
                                                    }
                                                } else if (goop == true) {
                                                    System.out.println(
                                                            "You continue on into the city and sure enough, you");
                                                }
                                            }
                                        }
                                    } else if (input.equalsIgnoreCase("middle city")) {
                                        if (water == true) {
                                            System.out.println(
                                                    "You continue on into the city and sure enough, you find an odd looking building. Right before you hit the "
                                                            + "buzzer on the front enterance, a demon king looking guy jumps \nout of a window and lands behind you. The demon king looking "
                                                            + "guy takes the water bottle from your bag and evaporates it, then you. That's right, demons hate water THAT\nmuch. Try again?\n"
                                                            + "[YES]\n[NO]");
                                            input = key.nextLine().toLowerCase();
                                            if (input.equalsIgnoreCase("yes")) {
                                                tryAgain = true;
                                                break;
                                            } else if (input.equalsIgnoreCase("no")) {
                                                System.out.println(
                                                        "Thanks for playing my adventure game by: Jeremy Whitenect");
                                                System.exit(0);
                                            }
                                        } else if (goop == true) {
                                            System.out.println(
                                                    "You continue on into the city and sure enough, you find an odd looking"
                                                            + " building, and suddenly the slime in your pocket start glowing! TRASH GOOP DX engages in a spar!");
                                            while (true) {
                                                battleRNG = rng.nextInt(100) + 1;
                                                if (defend == true) {
                                                    player.defenseDown(2);
                                                }

                                                if (player.returnHealth() <= 0) {
                                                    System.out.println("'Blurp, blorp DX.'\nTry again?\n[YES]\n[NO]");
                                                    input = key.nextLine().toLowerCase();
                                                    if (input.equalsIgnoreCase("yes")) {
                                                        tryAgain = true;
                                                        break;
                                                    } else if (input.equalsIgnoreCase("no")) {
                                                        System.out.println(
                                                                "Thanks for playing my adventure game by: Jeremy Whitenect");
                                                        System.exit(0);
                                                    }
                                                }

                                                System.out.println("[ATTACK]\n[MAGIC]\n[DEFEND]\n[CHECK]");
                                                input = key.nextLine().toLowerCase();
                                                if (input.equalsIgnoreCase("attack")) {
                                                    System.out.println("Slam! TRASH GOOP DX has "
                                                            + trashGoopDX.takeDamage(player.returnAttack())
                                                            + " health remaining!");
                                                } else if (input.equalsIgnoreCase("magic")) {
                                                    if (player.returnPSI() > 2) {
                                                        player.healthUp(15);
                                                        System.out.println("A healing wave blows forth! Health up! "
                                                                + player.returnHealth() + " "
                                                                + "health remaining!\nPSI remaining " + player.usePSI(3)
                                                                + "!");
                                                    } else if (player.returnPSI() <= 2) {
                                                        System.out.println("Not enough PSI!");
                                                    }
                                                } else if (input.equalsIgnoreCase("defend")) {
                                                    System.out.println(
                                                            "You cross you arms protecting your body.\n(defense +2 this turn)");
                                                    player.defenseUp(2);
                                                    defend = true;
                                                } else if (input.equalsIgnoreCase("check")) {
                                                    System.out.println(
                                                            "It's a weird slime like creature, it smells like better mouthwash.\n"
                                                                    + trashGoopDX.toString());
                                                } else {
                                                    System.out.println(player.toString());
                                                }

                                                if (trashGoopDX.returnHealth() <= 0) {
                                                    System.out.println(
                                                            "You beat the werider goo and the town has returned to nor"
                                                                    + "mal, for now...\nTry again?\n[YES]\n[NO]");
                                                    input = key.nextLine().toLowerCase();
                                                    if (input.equalsIgnoreCase("yes")) {
                                                        tryAgain = true;
                                                        break;
                                                    } else if (input.equalsIgnoreCase("no")) {
                                                        System.out.println(
                                                                "Thanks for playing my adventure game by: Jeremy Whitenect");
                                                        System.exit(0);
                                                    }
                                                }

                                                if (battleRNG <= 70) {
                                                    System.out.println("TRASH GOOP DX flings part of it's body at you! "
                                                            + player.takeDamage(trashGoopDX.returnAttack())
                                                            + " health remaining!");
                                                } else if (battleRNG > 70 && battleRNG <= 95) {
                                                    if (trashGoopDX.returnPSI() > 2) {
                                                        System.out.println(
                                                                "TRASH GOOP summons a wave of slime for triple damage! "
                                                                        + player.takeDamage(
                                                                        trashGoopDX.returnAttack() * 3)
                                                                        + ""
                                                                        + " health remaining!");
                                                        trashGoopDX.usePSI(3);
                                                    } else if (trashGoopDX.returnPSI() <= 2) {
                                                        System.out.println(
                                                                "TRASH GOOP DX tries to make a slime wave but doesn't have enough PSI!");
                                                    }

                                                } else if (battleRNG > 95) {
                                                    System.out.println(
                                                            "TRASH GOOP DX is loafing around and loses a turn!");
                                                }
                                            }
                                        } else if (goop == false && water == false) {
                                            System.out.println(
                                                    "Sure enough, after entering the city you find a weird building. You enter the building and"
                                                            + " take the elevator to the top floor. The office on the 70th floor is\ncompletely empty except for an ordinary"
                                                            + " looking guy with his back faced to you. He turns around and introduces himself as the CEO of Death! Who knew"
                                                            + " he'd look this\nnormal! CEO OF DEATH engages in a spar!");
                                            while (true) {
                                                battleRNG = rng.nextInt(100) + 1;
                                                if (defend == true) {
                                                    player.defenseDown(2);
                                                    defend = false;
                                                }

                                                if (player.returnHealth() <= 0) {
                                                    System.out.println(
                                                            "'That kinda sucks dude, but I am death.'\nTry again?\n[YES]\n[NO]");
                                                    input = key.nextLine().toLowerCase();
                                                    if (input.equalsIgnoreCase("yes")) {
                                                        tryAgain = true;
                                                        break;
                                                    } else if (input.equalsIgnoreCase("no")) {
                                                        System.out.println(
                                                                "Thanks for playing my adventure game by: Jeremy Whitenect");
                                                        System.exit(0);
                                                    }
                                                }

                                                System.out.println("[ATTACK]\n[MAGIC]\n[DEFEND]\n[CHECK]");
                                                input = key.nextLine().toLowerCase();
                                                if (input.equalsIgnoreCase("attack")) {
                                                    System.out.println("Kick! CEO OF DEATH has "
                                                            + death.takeDamage(player.returnAttack())
                                                            + " health remaining!");
                                                } else if (input.equalsIgnoreCase("magic")) {
                                                    if (player.returnPSI() > 2) {
                                                        System.out.println("With the power of " + name
                                                                + " you do triple damage to CEO OF DEATH leaving"
                                                                + " " + death.takeDamage(player.returnAttack() * 3)
                                                                + " health! " + player.usePSI(3) + " PSI remaining!");

                                                    } else if (player.returnPSI() <= 2) {
                                                        System.out.println("Not enough PSI!");
                                                    }
                                                } else if (input.equalsIgnoreCase("defend")) {
                                                    System.out.println(
                                                            "You cross you arms protecting your body.\n(defense +2 this turn)");
                                                    player.defenseUp(2);
                                                    defend = true;
                                                } else if (input.equalsIgnoreCase("check")) {
                                                    System.out.println("The CEO of Death, a weirdly normal fellow.\n"
                                                            + death.toString());
                                                } else {
                                                    System.out.println(player.toString());
                                                }

                                                if (death.returnHealth() <= 0) {
                                                    System.out.println(
                                                            "CEO OF DEATH melts into a pile and the city is back to normal, that's thanks to you, "
                                                                    + name + "! Play again?"
                                                                    + "\n[YES]\n[NO]");
                                                    input = key.nextLine().toLowerCase();
                                                    if (input.equalsIgnoreCase("yes")) {
                                                        tryAgain = true;
                                                        break;
                                                    } else if (input.equalsIgnoreCase("no")) {
                                                        System.out.println(
                                                                "Thanks for playing my adventure game by: Jeremy Whitenect");
                                                        System.exit(0);
                                                    }
                                                }

                                                if (battleRNG <= 70) {
                                                    System.out.println("CEO OF DEATH slaps you hard! "
                                                            + player.takeDamage(death.returnAttack())
                                                            + " health remaining!");
                                                } else if (battleRNG > 70 && battleRNG <= 99) {
                                                    if (death.returnPSI() > 1) {
                                                        System.out.println(
                                                                "CEO OF DEATH punches you in the gut for triple damage! "
                                                                        + player.takeDamage(death.returnAttack() * 2)
                                                                        + ""
                                                                        + " health remaining!");
                                                        dad.usePSI(2);
                                                    } else if (dad.returnPSI() <= 2) {
                                                        System.out.println(
                                                                "CEO OF DEATH tries to punch you but doesn't have enough PSI!");
                                                    }

                                                } else if (battleRNG > 99) {
                                                    player.changeHealth(0);
                                                    System.out.println("CEO OF DEATH shoots a beam of death at you! "
                                                            + player.returnHealth() + " health remaining!");
                                                }

                                            }
                                        }

                                    }

                                }

                            }
                            key.close();
                        }

                    }

                }

            } else {
                System.out.println(player.toString());
            }

        }

    }

}