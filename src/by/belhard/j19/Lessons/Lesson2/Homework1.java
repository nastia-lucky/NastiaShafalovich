package by.belhard.j19.Lessons.Lesson2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Homework1 {

    static byte b = 127;
    static short sh = 30000;
    static int i = 3000000;
    static long l = 100000000000l;
    static float f = 1.5f;
    static double d = 5.500000;
    static char c = 'c';
    static boolean b1 = true;
    static boolean b2 = false;

    static int r = 3; // radius of a circle
    static double square = r * r * 3.14;//calculation of square of a circle
    static double length = 2 * 3.14 * r;//calculation of a length of a circle

    public static void main(String[] args) {
        int q = b + sh;
        int w = sh / b;
        long e = l + i;
        boolean r = f > d;
        double t = d / f;
        short y = ++sh;
        int p = --i;

        System.out.println("q=" + q + "; w=" + w + "; e=" + e + "; r=" + r + "; t=" + t + "; y=" + y + "; p=" + p);
        System.out.println("Square of a circle is " + square);
        System.out.println("Length of a circle is " + length);

    }

}

