package by.belhard.j19.Homeworks.Homework3;

public class Task1Clothes {
    public static void main(String[] args) {
        int temp = 30;

        if (temp < 10) {
            System.out.println("Put on the jacket");
        } else if (temp < 15) {
            System.out.println("Put on the windbreaker");
        } else if (temp < 20) {
            System.out.println("Put on the sweter");
        } else if (temp < 30) {
            System.out.println("Put on the T-shirt");
        } else {
            System.out.println("Go naked");
        }
    }

}