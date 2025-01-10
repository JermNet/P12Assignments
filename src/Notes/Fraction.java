package Notes;

public class Fraction {
    private int numerator, denominator;

    public Fraction() {
        denominator = 1;
    }

    public Fraction(int n, int d) {
        numerator = n;
        denominator = d;
    }

    public double getDecimal() {
        return (double) numerator / denominator;
    }

    public Fraction multiply(Fraction otherFraction) {
        int newNumerator = numerator * otherFraction.numerator;
        int newDenominator = denominator * otherFraction.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction divide(Fraction anotherFraction) {
        int newerNumerator = numerator * anotherFraction.denominator;
        int newerDenominator = denominator * anotherFraction.numerator;
        return new Fraction(newerNumerator, newerDenominator);
    }

    public Fraction add(Fraction fraction4) {
        int denominator4 = denominator * fraction4.denominator;
        int numerator4 = (numerator * fraction4.denominator) + (fraction4.numerator * denominator);
        return new Fraction(numerator4, denominator4);
    }

    public Fraction sub(Fraction fraction5) {
        int denominator5 = denominator * fraction5.denominator;
        int numerator5 = (numerator * fraction5.denominator) - (fraction5.numerator * denominator);
        return new Fraction(numerator5, numerator5);
    }

    public String toString() {
        return "" + numerator + "/" + denominator;
    }
}
