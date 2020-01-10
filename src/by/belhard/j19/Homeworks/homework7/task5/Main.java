package by.belhard.j19.Homeworks.homework7.task5;

public class Main {
    public static void main(String[] args) {
        TransportFactory factory1 = new TransportFactory();
        Transport truck = factory1.getTransport(TransportTypes.TRUCK);
        truck.move();

    }
}
