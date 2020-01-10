package by.belhard.j19.Homeworks.homework7.task3;

public class CalculationUtils {
    public static double getSquare(Figure f) {
        double s = f.square();
        System.out.println("The square of figure is " + s);
        return s;
    }

    public static double getPerimeter(Figure f) {
        double p = f.perimetr();
        System.out.printf("The perimeter of figure is " + p);
        return p;
    }
}
