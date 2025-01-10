package Notes;

public class TypeNotes {

    public static void main(String[] args) {
        String messaging = "Epic gaming B";
        int pauseTime;
        pauseTime = 100;
        typewriter(messaging, pauseTime);

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
