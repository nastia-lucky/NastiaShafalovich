package by.belhard.j19.Homeworks.homework5.task3;

public class Weather {
    public static double[] getTemp(double startTemp, double dayDiff, int days) {
        double array[] = new double[days];
        array[0] = startTemp;
        for (int i = 1; i < array.length; i++) {
            array[i] = startTemp + (Math.random() * 2 * dayDiff - dayDiff);
        }
        return array;
    }

}
