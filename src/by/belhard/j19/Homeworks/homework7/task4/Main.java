package by.belhard.j19.Homeworks.homework7.task4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PurchaseList list = new PurchaseList();

        List<String> list1 = Arrays.asList("butter", "beer", "bread", "sour cream");
        List<String> list2 = Arrays.asList("butter", "beer", "wine");

        list.addPurchaseList("Vasia", list1);
        list.addPurchaseList("Masha", list2);
        list.getListProducts();

    }
}
