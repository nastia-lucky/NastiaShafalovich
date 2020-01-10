package by.belhard.j19.Homeworks.homework7.task5;

public class TransportFactory {
    public Transport getTransport(TransportTypes type) {
        Transport newVehicle = null;
        switch (type) {
            case CAR:
                newVehicle = new Car();
                break;
            case PLANE:
                newVehicle = new Plane();
                break;
            case SPEEDBOAT:
                newVehicle = new SpeedBoat();
                break;
            case TRUCK:
                newVehicle = new Truck();
                break;
            default:
                System.out.println("Such type of transport doesn't exist");
        }
        return newVehicle;

    }
}
