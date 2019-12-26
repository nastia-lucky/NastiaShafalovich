package by.belhard.j19.Homeworks.homework5.task3;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        double[] newArray = Weather.getTemp(10.5, 2, 5);
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.print("{ ");
        for (double item : newArray) {
            System.out.print(df.format(item) + " ");
        }
        System.out.print("}");
    }
}
