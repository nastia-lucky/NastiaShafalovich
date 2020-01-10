package by.belhard.j19.Homeworks.homework7.task5;

public class Plane implements Transport {

    public Plane() {
        System.out.println("The plane is created");
    }

    @Override
    public void move() {
        System.out.println("I am a plane - I am flying");
    }
}
