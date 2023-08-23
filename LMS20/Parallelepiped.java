package LMS20;

public class Parallelepiped {
    public static double calculateSurfaceArea(double length, double width, double height) {
        return 2 * ((height * length) + (length * width) + (height * width));
    }

    public static double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }
}

