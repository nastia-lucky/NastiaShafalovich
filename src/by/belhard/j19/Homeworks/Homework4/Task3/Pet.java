package by.belhard.j19.Homeworks.Homework4.Task3;

public class Pet {
    Type type;
    String name;
    String hostName;
    int age;
    boolean rabiesVaccination;
    Address address;
    String clothes;


    public Pet(Type type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }

    void setHost(String hostname1, Address address1) {
        hostName = hostname1;
        address = address1;
    }

    void vaccinate() {
        rabiesVaccination = true;
    }

    void putOn(String clothes1) {
        clothes = clothes1;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", hostName='" + hostName + '\'' +
                ", age=" + age +
                ", rabiesVaccination=" + rabiesVaccination +
                ", address=" + address +
                ", clothes='" + clothes + '\'' +
                '}';
    }
}
