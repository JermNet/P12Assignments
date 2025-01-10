package Notes;

public class TestFraction {

    public static void main(String[] args) {
        Fraction firstFraction = new Fraction(3, 4);
        System.out.println("The fraction is: " + firstFraction);

        Fraction secondFraction = new Fraction(2, 5);
        System.out.println("The second fraction: " + secondFraction);

        Fraction thirdFraction = firstFraction.divide(secondFraction);
        System.out.println("The fraction is: " + thirdFraction);

    }

}
