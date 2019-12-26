package by.belhard.j19.Homeworks.homework5.task2;

public class Author {
    private String name;
    private String surname;
    private int age;

    public Author(String name, String surname, int age) {

        if (name == null) {
            this.name = "Cool author";
        } else {
            this.name = name;
        }
        if (surname == null) {
            this.surname = "Cool author's surname";
        } else {
            this.surname = surname;
        }
        if (age < 2) {
            this.age = 18;
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
