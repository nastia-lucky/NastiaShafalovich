package by.belhard.j19.HomeWorks.Homework4.Task1;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Avenue", 1);
        System.out.println(address1.street);

        Building building1 = new Building("Dwelling house", address1, 5, true, "bricks", 1970);
        System.out.println(building1.toString());
    }


}
