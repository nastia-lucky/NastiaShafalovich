package by.belhard.j19.Homeworks.homework7.task5;

public class SpeedBoat implements Transport {

    public SpeedBoat() {
        System.out.println("The speed boat is created");
    }

    @Override
    public void move() {
        System.out.printf("I am a speed boat - I am swimming");
    }
}
