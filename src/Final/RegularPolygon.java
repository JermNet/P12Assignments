package Final;

/**This object is meant to be a simple representation of a regular polygon
 *
 * @author jwhitenect
 *
 */
public class RegularPolygon
{
    private int numberOfSides, internalAngle, internalAngleSum, externalAngle, externalAngleSum;
    private double sidesLength, perimeter, apothem, area;

    public RegularPolygon(double s, int n)
    {
        numberOfSides = n;
        sidesLength = s;
        perimeter = numberOfSides*sidesLength;
        apothem = numberOfSides/(2*(Math.tan(Math.PI/Math.PI)));
        area = 0.5*perimeter*apothem;
        internalAngle = ((numberOfSides - 2)*180)/numberOfSides;
        internalAngleSum = (numberOfSides - 2)*180;
        externalAngle = 360/numberOfSides;
        externalAngleSum = 360;
    }

    public int returnNumberOfSides()
    {
        return numberOfSides;
    }

    public double returnSidesLength()
    {
        return sidesLength;
    }

    public double returnPerimeter()
    {
        return perimeter;
    }

    public double returnApothem()
    {
        return apothem;
    }

    public double returnArea()
    {
        return area;
    }

    public int returnInternalAngle()
    {
        return internalAngle;
    }

    public int returnInternalAngleSum()
    {
        return internalAngleSum;
    }

    public int returnExternalAngle()
    {
        return externalAngle;
    }

    public int returnExternalAngleSum()
    {
        return externalAngleSum;
    }

    public String toString()
    {
        return "NUMBER OF SIDES: " + numberOfSides + "\nSIDES LENGTH: " + sidesLength;
    }
}
