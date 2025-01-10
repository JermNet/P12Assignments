package GraphicalShapeV2;

/**
 * This is meant to show the use of static classes
 *
 * @author jwhitenect
 *
 */
public class Shapes {

    private Shapes() {

    }

    public static double sphereArea(double r) {
        return r * r * 4 * Math.PI;
    }

    public static double sphereVolume(double r) {
        return 1.33333333333 * r * r * r * Math.PI;
    }

    public static double pyramidArea(double l, double w, double h) {
        return (l * w + (1 * Math.pow(w, 2 * w * 0.5)) + (h * h * 0.5 * 0.5) + ((w) * l * l * 0.5) + (h * h * 0.5));
    }

    public static double pyramidVolume(double l, double w, double h) {
        return (l * w * h) / 3;
    }

    public static double cylinderArea(double r, double h) {
        return (2 * Math.PI * r * h) + (2 * Math.PI * r * r);
    }

    public static double cylinderVolume(double r, double h) {
        return Math.PI * r * r * h;
    }

}
