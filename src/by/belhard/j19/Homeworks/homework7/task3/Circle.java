package by.belhard.j19.Homeworks.homework7.task3;

public class Circle implements Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        double s = 3.14 * this.radius * this.radius;
        return s;
    }

    @Override
    public double perimetr() {
        double p = 2 * 3.14 * this.radius;
        return p;
    }
}
