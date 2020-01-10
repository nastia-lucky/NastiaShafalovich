package by.belhard.j19.Homeworks.homework8.task3;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double fullPrice=0;
        for (int i = 0; i < n; i++) {
            in = new Scanner(System.in);
            String line = in.nextLine();
            String[] array = line.split(" ");
            if (array.length!=3){
                System.out.println("The input is not valid");
            }
            String name = array[0];
            double price = Double.parseDouble(array[1]);
            double amount = Double.parseDouble(array[2]);
            double priceOfProducts = price * amount;
            fullPrice = fullPrice + priceOfProducts;
        }
        System.out.println(fullPrice);



    }
}
