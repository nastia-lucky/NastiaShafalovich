package by.belhard.j19.Homeworks.Homework3;

public class Task7 {
    public static void main(String[] args) {


        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int result = i * j;
                System.out.print(result + " ");
                if (result < 10) {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }


}
