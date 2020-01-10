package by.belhard.j19.Homeworks.homework7.task5;

public class Truck implements Transport {

    public Truck() {
        System.out.println("The truck is created");
    }

    @Override
    public void move() {
        System.out.println("I am a truck- I am driving");
    }
}
