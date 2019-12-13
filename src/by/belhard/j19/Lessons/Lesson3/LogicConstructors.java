package by.belhard.j19.Lessons.Lesson3;

public class LogicConstructors {

    public static void main(String[] args) {
        int a = -15;
        int b = 7;
       if (a>b+b) {
            System.out.println(a + a + " more than " + (b + b));
            System.out.println("Yes");
            int c;
        }
        int c=0;
        System.out.println(c);

        if (a>10){
            System.out.println(a=10);
        }
        System.out.println(a);
String result;
        if (a < 10) {
            result="jacket";

        } else if (a < 18) {
            result="sweter";
        } else if (a < 25) {

            result ="pants";
        } else {
            result="nothing";
        }
        System.out.println(result);
b=a<10? -1:1;
        System.out.println(b);

    }
}
