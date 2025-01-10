import java.util.Scanner;

public class NestingIfs {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        String genre, slice, action, comedy;

        System.out.println("Hello user! This is known as the ARP (Anime Recomendation Program). The first part of"
                + " this process is for you to select a genre and we will do the rest. \nType 'slice' for slice of life. "
                + "\nType 'action' for action adventure. \nType 'comedy' for comedy/parody.");
        genre = key.nextLine();

        if (genre.equalsIgnoreCase("slice")) {
            System.out.println("Slice of life is a genre that revolves around what most would see as the the "
                    + "mundane. The program would like to suggest three anime of the slice of life \ngenre to you. \nTo "
                    + "learn more about Clannad type 'clannad'. \nTo learn more about K-On! type 'kon'. \nTo learn more "
                    + "about Mob Psycho 100 type 'mob'.");
            slice = key.nextLine();

            if (slice.equalsIgnoreCase("clannad")) {
                System.out.println("Clannad follows the story of Tomoya Okazaki, a high school delinquent with a"
                        + " troubled home life. He finds no point in school and hates the town he lives in\nuntil he meets "
                        + "Nagisa Furukawa he he bonds with. He finds a newfound appreciation for life but Nagisa's "
                        + "will lead to problems for both of them.\nPersonal ranking: 9/10.");
            } else if (slice.equalsIgnoreCase("kon")) {
                System.out.println("K-On! is a musicaly oriented anime where main character, Yui Hirasawa, "
                        + "discovers the Light Music Club. Yui misunderstands thinking that it's a club for \nplaying "
                        + "simple instuments for she doesn't know how to play any. The club actually is for playing light"
                        + " hearted music and Yui decides to learn the guitar, \nstarting her musical journey. \nPersonal"
                        + " ranking: 7/10.");
            } else if (slice.equalsIgnoreCase("mob")) {
                System.out.println("Shigeo Kageyama (known as Mob) seems like your normal eighth-grader but looks"
                        + " can be deceiving. In actuality Mob has psychic powers but he sees them as \nmore of a burden "
                        + "due to being told that they're dangerous at a young age. Mob, wanting to control his skills, "
                        + "becomes the apprentice of Reigen Arataka, a \ncon artist pretending to be psychic. Mob goes "
                        + "about his days exorcising spirits, going to school and dealing with his emotions. \nPersonal "
                        + "ranking: 8/10.");
            } else {
                System.out.println("That's not an option? Please restart.");
            }
        } else if (genre.equalsIgnoreCase("action")) {
            System.out.println("As you probably expected the action adventure genre consists of both action and "
                    + "adventure! The program would like to suggest three anime of the \naction adventure genre to you. "
                    + "\nTo learn more about One Piece type 'one'. \nTo learn more about Bleach type 'bleach'.\nTo learn "
                    + "more about Cowboy Bebop type 'cowboy'.");
            action = key.nextLine();

            if (action.equalsIgnoreCase("one")) {
                System.out.println("Before the death of Gol D. Roger 22 years ago he said that he left all of his "
                        + "treasure in One Piece, inciting the great pirate era. This brings us to \npresent day where "
                        + "Monkey D. Luffy goes off to sail to the Grand Line to find the Pirate King's treasure. Along "
                        + "the way Luffy meets new comrades like \nPirate Hunter Zoro, Cat Burglar Nami and Sniper Usopp. "
                        + "Together they, and many more fight fearsome foes on their quest for richies. \nPersonal "
                        + "ranking: 7.5/10.");
            } else if (action.equalsIgnoreCase("bleach")) {
                System.out.println("High schooler Ichigo Kurosaki has been able to see spirits all of his life "
                        + "and learned to accept that. But after encountering an evil spirit known as a\nHollow and a Soul"
                        + " Reaper sent to destory it, his life gets turned upside down. Ichigo is forced to become a Soul "
                        + "Reaper himself after absorbing the powers\nof Rukia Kuchiki, the one sent to destroy the "
                        + "Hollow. Ichigo is reluctant to accept his job but after saving the spirit of a young boy he "
                        + "learns to accept\nhis new role.\nPersonal ranking: 7/10.");
            } else if (action.equalsIgnoreCase("cowboy")) {
                System.out.println("In the distant future of 2071 the Earth has become unliveable and the human "
                        + "race has mastered space travel, colonizing many planets as a result. Space has\ngiven birth to"
                        + " space bounty hunters, commonly know as cowboys. Spike Spiegel and his partner Jet Black are "
                        + "some of these cowboys, going about their day to\nday lives collecting bountys on wanted "
                        + "criminals. Spike is a former member of the crime syndicate The Red Dragon Clan and because of "
                        + "this has some crazy\nskills. Along with Jet being a former police officer together they go "
                        + "down some wacky paths.\nPersonal ranking: 10/10.");
            } else {
                System.out.println("That's not an option? Please restart.");
            }

        } else if (genre.equalsIgnoreCase("comedy")) {
            System.out.println("The comedy/parody genre is either anime parodying an already existing genre and "
                    + "comedy coming from that or just straight comedy. The program would like to\nsuggest three anime of "
                    + "the comedy/parody genre to you.\nTo learn more about Konosuba type 'kono'.\nTo learn more about The"
                    + " Disastrous Life of Saiki K. type 'saiki'.\nTo learn more about Nichijou type 'nich'.");
            comedy = key.nextLine();

            if (comedy.equalsIgnoreCase("kono")) {
                System.out.println("If you don't know isekai is a genre of anime where the main character gets "
                        + "transported to another world, the person in this spin on the genre Kazuma Sato\nis the main "
                        + "character. Before traveling to this fantasy world Kazuma gets the pick one item to help him"
                        + " defeat the Demon King. In jest he picks the goddess\nAqua who told him about the Demon King "
                        + "but this is taken seriously and Aqua is forced to acompany Kazuma. With not a dime to their "
                        + "name and the highist\nstat of luck they must take on quests. This leads to the Two meeting the"
                        + " warrior Darkness and the Crimson Demon Megumin. Dispite their conflicitng\npersonalities the "
                        + "four become fast friends. \nPersonal ranking: 9/10.");
            } else if (comedy.equalsIgnoreCase("saiki")) {
                System.out.println("Saiki Kuso has every superpower you could imagine from x-ray vision to super"
                        + " strength. Most people would be overwhelmingly happy but these powers come with\nmore cons "
                        + "than pros. Saiki must wear special hairpins to prevent himself from releasin world destroying "
                        + "power, thin gloves to prevent seeing things memories\nby touching them and green glasses to "
                        + "prevent turning people to stone. To top it all of Saiki is trying desprately hard to not stand"
                        + " out so that nobody\nfinds out about his powers. It's a comedy of errors with a super powered "
                        + "main character.\nPersonal ranking: 8/10.");
            } else if (comedy.equalsIgnoreCase("nich")) {
                System.out.println("Nichijou may seem like your run of the mill high school anime but with a "
                        + "unique artsyle and aproach to humor, that couldn't be farther from the truth. \nThere are two "
                        + "trios of characters in this anime, the first are Mio, Yuuko and Mai. They're a group of high "
                        + "school girls who try to live their ordinary\nlives, which involves finding out that Mio's hair"
                        + " accesories are wanted by an evil orginisation and seeing the principle suplex a deer. The "
                        + "second trio of\ncharacters are child genius Hakase, her homemade robot mom Nano and the talking"
                        + " cat Sakamoto. Nano and Sakatmoto must deal with Hakase's wild inventions but\nin the end it's"
                        + " all too ordinary to them. \nPersonal ranking: 8/10.");
            } else {
                System.out.println("That's not an option? Please restart.");
            }

        } else {
            System.out.println("That's not an option? Please restart.");
        }
        key.close();
    }

}
