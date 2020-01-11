package by.belhard.j19.Homeworks.homework7.task1;

import java.util.ArrayList;

public class Method {
    public static ArrayList<String> getArrayList(ArrayList<String> list, int n) {
        ArrayList<String> newList = new ArrayList<String>();
        if (n > 0) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).length() < n) {
                    newList.add(list.get(i));
                }
            }
        } else {
            System.out.println("The list can't be created");
        }

        for (String s : newList) {
            System.out.print(s + " ");
        }

        return newList;

    }

}
