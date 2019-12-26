package by.belhard.j19.Homeworks.homework5.task1;

public class Table {
    int legsNumber = 4;
    double height;
    String material;
    String type;
    double price;

    Table(double height, String material, String type, double price) {
        this.height = height;
        this.material = material;
        this.type = type;
        this.price = price;

    }


    @Override
    public String toString() {
        return "Table{" +
                "legsNumber=" + legsNumber +
                ", height=" + height +
                ", material='" + material + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}

