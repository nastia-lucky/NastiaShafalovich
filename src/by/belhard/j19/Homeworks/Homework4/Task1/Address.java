package by.belhard.j19.HomeWorks.Homework4.Task1;

public class Address {
    String street;
    int housenumber;

    Address(String street, int housenumber) {
        this.street = street;
        this.housenumber = housenumber;

    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", housenumber=" + housenumber +
                '}';
    }
}
