package by.belhard.j19.Homeworks.Homework4.Task3;

public class Main {


    public static void main(String[] args) {
        Address addressNumber1 = new Address("Avenue", 5, 55);

        Pet pet1 = new Pet(Type.DOG, "FUNNY", 1);

        pet1.setHost("Alex", addressNumber1);
        pet1.vaccinate();
        pet1.putOn("sweter");
        System.out.println(pet1.toString());


    }

}
