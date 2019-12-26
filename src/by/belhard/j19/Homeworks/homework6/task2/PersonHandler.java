package by.belhard.j19.Homeworks.homework6.task2;

import java.util.ArrayList;
import java.util.List;

public class PersonHandler {
    private List<Person> persons = new ArrayList<>();

    public List<Person> getPersons() {
        return persons;
    }

    public Person getPerson(String name) {
        for (Person p : persons) {
            if (p.name.equals(name)) {
                return p;
            }
        }
        return null;
    }
}
