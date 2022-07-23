package entities;

public class Esfera {
    public double radius;
    public static final double pi = 3.14159;
    public double circumference() {
        return 2 * pi * radius;
    }
    public double volume() {
        return 4 * pi * radius * radius * radius / 3;
    }
    public String toString() {
        return "Circumference = " + String.format("%.2f%n", circumference())
                + "Volume = " + String.format("%.2f%n", volume())
                + "PI value = " + pi;
    }
}