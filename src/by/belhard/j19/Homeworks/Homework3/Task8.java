package by.belhard.j19.Homeworks.Homework3;

public class Task8 {
    public static void main(String[] args) {
        int startInt = 1;
        int size = 4;
        int[][] matrix = new int[size][];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new int[i + 1];
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0 && j == 0) {
                    matrix[i][j] = startInt;
                } else if (j == 0) {
                    matrix[i][j] = matrix[i - 1][matrix[i - 1].length - 1] * 2;
                } else {
                    matrix[i][j] = matrix[i][j - 1] * 2;
                }
                System.out.print(matrix[i][j] + " ");

            }

            System.out.println();
        }
    }
}
