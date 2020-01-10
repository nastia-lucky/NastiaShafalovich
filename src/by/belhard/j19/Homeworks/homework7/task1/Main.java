package by.belhard.j19.Homeworks.homework7.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> firstList = new ArrayList <String>();
        firstList.add("the dog");
        firstList.add("cat");
        firstList.add("Fedor");
        firstList.add("qwer");

        Method task1= new Method();

        task1.getArrayList (firstList, 6);

    }
}
