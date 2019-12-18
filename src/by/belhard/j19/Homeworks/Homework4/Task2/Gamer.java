package by.belhard.j19.Homeworks.Homework4.Task2;

public class Gamer {
    String name;
    double x;
    double y;

    Gamer(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    void setLocation(double x1, double y2) {
        x = x1;
        y = y2;
    }

    void printLocation() {
        System.out.println("x= " + x + " : y= " + y);
    }

}
