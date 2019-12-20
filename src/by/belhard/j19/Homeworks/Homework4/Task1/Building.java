package by.belhard.j19.HomeWorks.Homework4.Task1;

public class Building {
    String purpose;
    Address address;
    int floorNumber;
    boolean elevator;
    String material;
    int year;

    public Building(String purpose, Address address, int floorNumber, boolean elevator, String material, int year) {
        this.purpose = purpose;
        this.address = address;
        this.floorNumber = floorNumber;
        this.elevator = elevator;
        this.material = material;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Building{" +
                "purpose='" + purpose + '\'' +
                ", address=" + address +
                ", floorNumber=" + floorNumber +
                ", elevator=" + elevator +
                ", material='" + material + '\'' +
                ", year=" + year +
                '}';
    }
}
