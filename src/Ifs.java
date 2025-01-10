import java.util.Scanner;

public class Ifs {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int age;
        System.out.println("Nice to meet ya! Mind telling me your age? This is only for those 18 or "
                + "bellow.");
        age = key.nextInt();

        if (age < 15) {
            System.out.println("14 or younger puts you in the 'optimisim' category. This means that you have"
                    + " a positive outlook on the future and take you take every insult with a grain \nof salt. This "
                    + "is a good way to see things but sometimes it can result in you not taking the criticism you "
                    + "need to grow. Your lucky number is 28.");
        } else if (age == 15) {
            System.out.println("15 puts you in the 'cautious' category. This means that you are a bit nervous"
                    + " when it comes to the future. The heavy responsibility of being able to have a \njob and "
                    + "learners is scary yet tempting to you. You're still very young though so not to much is yet "
                    + "expected of you. Your lucky number is 53");
        } else if (age == 16) {
            System.out.println("16 puts you in the 'reckless' category. This means that more often than not "
                    + "you do things that you probably shouldn't, potentialy hurting yourself or \nothers. It isn't "
                    + "all bad though, this can lead to you doing things that nobody else would, leading wonderful new"
                    + "ideas. But all in all it would be best to \ntone it down and use that pent up energy to be "
                    + "creative. Your lucky number is 64.");
        } else if (age == 17) {
            System.out.println("17 puts you in the 'realisation' category. This means that the you realise "
                    + "that the future is starting to catch up. You're starting to end your high school \ncareer and "
                    + "that also means the end of your free time with you son being in a job, university or college. "
                    + "You're lookng forward to it but at the same time\nit's nerve wracking but, in the end, you "
                    + "know that time must march on. Your lucky number is 08");
        } else if (age == 18) {
            System.out.println("18 puts you in the 'acceptance' category. This means that whether or"
                    + " not you're in school or working you know that the world can suck. But you know you \ncan't "
                    + "completely say everything is terrible and you can appreciate the small things. But you"
                    + " still have to worry about the stresses of life and deal with\nthem on a regular basis, just "
                    + "making sure they don't get you down all the time. Your lucky number is 91.");
        } else {
            System.out.println("Sorry to tell you but that age isn't valid in this program.");
        }
        key.close();
    }

}
