package Rectangular;

/**
 * This is meant to show the use of objects.
 *
 * @author jwhitenect
 *
 */
public class RectangularPrisim {
    private double length, width, height;

    public RectangularPrisim() {
        length = 1;
        width = 1;
        height = 1;
    }

    public RectangularPrisim(double h, double w, double l) {
        length = l;
        width = w;
        height = h;
    }

    public void changeHeight(double h) {
        height = h;
    }

    public void changeWidth(double w) {
        width = w;
    }

    public void changeLength(double l) {
        length = l;
    }

    public void scale(double s) {
        length = length * s;
        width = width * s;
        height = height * s;
    }

    public double areaCalculate() {
        return (length * width * 4) + (length * height * 2);
    }

    public double volumeCalculate() {
        return height * width * length;
    }

    public String toString() {
        return "\nLength: " + length + "\nWidth: " + width + "\nHeight: " + height;
    }
}
