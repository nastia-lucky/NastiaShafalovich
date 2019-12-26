package by.belhard.j19.Homeworks.homework5.task1;

public class Main {
    public static void main(String[] args) {
        Table[] tableArray = new Table[5];


        for (int i = 0; i <= tableArray.length - 1; i++) {
            tableArray[i] = new Table(Math.round(Math.random() * 100 + 1), "material " + (i + 1), "type " + (i + 1), 5.5 * (i + 1));
            System.out.println(tableArray[i].toString());
        }
    }
}
