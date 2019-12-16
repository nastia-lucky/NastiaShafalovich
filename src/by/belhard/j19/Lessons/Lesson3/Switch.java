package by.belhard.j19.Lessons.Lesson3;

public class Switch {
    public static void main(String[] args) {
        String inputdate = "wed";

        switch (inputdate) {
            case "mon":
                System.out.println("go to work- it's mon");
                break;

            case "tue":
                System.out.println("go to work- it's tue");
                break;

            case "wed":
                System.out.println("go to work- it's wed");
                break;
            case "thur":
                System.out.println("go to work- it's thur");
                break;
            case "fri":
                System.out.println("go to work- it's fri");
                break;
            case "sat":
            case "sun":
                System.out.println("stay home");
                break;
            default:
                System.out.println("day doesn't exist");


        }
    }
}
