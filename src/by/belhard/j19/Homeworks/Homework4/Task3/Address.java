package by.belhard.j19.Homeworks.Homework4.Task3;

public class Address {
    String street;
    int housenumber;
    int flatNumber;

    Address(String street, int housenumber, int flatNumber) {
        this.street = street;
        this.housenumber = housenumber;
        this.flatNumber = flatNumber;

    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", housenumber=" + housenumber +
                ", flatNumber=" + flatNumber +
                '}';
    }
}
