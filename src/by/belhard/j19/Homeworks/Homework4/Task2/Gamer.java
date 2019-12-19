package by.belhard.j19.Homeworks.Homework4.Task2;

public class Gamer {
    String name;
    double x;
    double y;
    double c;

    Gamer(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    void setLocation(double x1, double y1) {
        x = x1;
        y = y1;
        System.out.println("The new coordinates are: x= " + x + ", y= " + y);
    }

    void printLocation() {
        System.out.println("The new coordinates are: x= " + x + ", y= " + y);
    }

    double calculateDistance(double x1, double y1) {
        double a = x1 - x;
        double b = y1 - y;
        c = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
        System.out.println(c);
        return c;

    }
}
