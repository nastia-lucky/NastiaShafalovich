package by.belhard.j19.Homeworks.MyProject;

public class Pets {

    private int id;
    private String name;
    private String color;
    private int weight;
    private boolean rabbiesVaccination;

    public Pets(int id, String name, String color, int weight, boolean rabbiesVaccination) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.rabbiesVaccination = rabbiesVaccination;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isRabbiesVaccination() {
        return rabbiesVaccination;
    }

    public void setRabbiesVaccination(boolean rabbiesVaccination) {
        this.rabbiesVaccination = rabbiesVaccination;
    }
}
