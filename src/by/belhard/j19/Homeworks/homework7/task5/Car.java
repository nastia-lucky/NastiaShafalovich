package by.belhard.j19.Homeworks.homework7.task5;

public class Car implements Transport {

    public Car() {
        System.out.println("The car is created");
    }

    @Override
    public void move() {
        System.out.println("I am car - I am driving");
    }
}
