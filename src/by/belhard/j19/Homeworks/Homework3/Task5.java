package by.belhard.j19.Homeworks.Homework3;

public class Task5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        for (int j = 1; j <= 100; j++) {
            if (j % 5 == 0 || j % 7 == 0) {
                if (j % 5 == 0 && j % 7 == 0) {
                    continue;
                } else {
                    System.out.print(j + " ");
                }
            }
        }
        System.out.println();
        for (int i = 1; i <= 100; i++) {
            if (i % 20 >= 10) {
                if (i % 5 == 0 || i % 7 == 0) {
                    if (i % 5 == 0 && i % 7 == 0) {
                        continue;
                    } else {
                        System.out.print(i + " ");
                    }
                }

            }
        }
    }
}
