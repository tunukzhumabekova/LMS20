package LMS20;

import static java.lang.Math.PI;

public class Cylinder {

    public static double calculateSurfaceArea(double radius, double height) {
        return (2 * PI * radius * (height + radius));
    }

    public static double calculateVolume(double radius, double height) {
        return PI * radius * radius * height;
    }
}
