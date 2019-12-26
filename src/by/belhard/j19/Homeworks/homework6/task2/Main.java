package by.belhard.j19.Homeworks.homework6.task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        PersonHandler personHandler = new PersonHandler();

        List<Person> allPersons = personHandler.getPersons();

        for (int i = 0; i < 5; i++) {
            allPersons.add(new Person("Name " + i));
        }

        Person p = personHandler.getPerson("hbnhbh");
        if (p == null) {
            System.out.println("Such object doesn't exist");
        } else {
            System.out.printf(p.toString());
        }


    }
}
