package by.belhard.j19.Homeworks.Homework3;

public class Task2Salaries {
    public static void main(String[] args) {
        int salary1 = 100;
        int salary2 = 200;
        int salary3 = 300;
        int maxSalary = salary1;
        int minSalary = salary1;


        if (salary2 > maxSalary) {
            maxSalary = salary2;
        }
        if (salary3 > maxSalary) {
            maxSalary = salary3;
        }

        if (salary2 < minSalary) {
            minSalary = salary2;
        }
        if (salary3 < minSalary) {
            minSalary = salary3;
        }

        System.out.println("The difference in salaries is " + (maxSalary - minSalary));
    }

}