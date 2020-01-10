package by.belhard.j19.Homeworks.homework8.task4;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        int operationIndex = -1;
        Integer result = null;
        if ((operationIndex = line.indexOf("+")) != -1) {
            int[] numbers = getNumbers(line, operationIndex);
            result = numbers[0] + numbers[1];
        } else if ((operationIndex = line.indexOf("-")) != -1) {
            int[] numbers = getNumbers(line, operationIndex);
            result = numbers[0] - numbers[1];
        } else if ((operationIndex = line.indexOf("/")) != -1) {
            int[] numbers = getNumbers(line, operationIndex);
            result = numbers[0] / numbers[1];
        } else if ((operationIndex = line.indexOf("*")) != -1) {
            int[] numbers = getNumbers(line, operationIndex);
            result = numbers[0] * numbers[1];
        } else {

        }
        System.out.println("The result is " + result);

    }

    private static int[] getNumbers(String line, int operationIndex) {
        try {
            int a = Integer.parseInt(line.substring(0, operationIndex).trim());
            int b = Integer.parseInt(line.substring(operationIndex + 1, line.length()).trim());
            return new int[]{a, b};
        } catch (Exception e) {
            System.out.println("Wrong Input");
            return null;
        }
    }

}
