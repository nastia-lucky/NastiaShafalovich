package by.belhard.j19.Homeworks.homework7.task3;

public class Rectangle implements Figure {
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double square() {
        double s = side1 * side2;
        return s;
    }

    @Override
    public double perimetr() {
        double p = (2 * side1) + (2 * side2);
        return p;
    }


}
