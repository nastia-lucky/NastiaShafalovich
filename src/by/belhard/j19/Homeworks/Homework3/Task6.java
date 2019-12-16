package by.belhard.j19.Homeworks.Homework3;

public class Task6 {
    public static void main(String[] args) {
        int[] massive = {10, 2, 3, 4, 6, 6, 7, 243, 9, 90};
        int i = 0;
        int result = 0;
        for (i = 0; i <= massive.length - 1; i++) {
            result = result + massive[i];
        }
        double average = result / massive.length;
        double central = massive.length / 2;
        System.out.println(central);
        System.out.println("Result of sum is " + result);
        System.out.println("Result of average is " + average);


    }
}
