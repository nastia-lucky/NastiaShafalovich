package by.belhard.j19.Homeworks.Homework3;

public class Task4 {
    public static void main(String[] args) {
        final double startSum = 100;
        final double proc = 0.05;
        final int years = 5;
        final double tax = startSum * 0.01;
        double result = startSum;


        for (int i = 1; i <= years; i++) {
            result = result + (result * proc) - tax;

        }
        System.out.println(result);
    }

}
