package by.belhard.j19.Homeworks.homework7.task4;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PurchaseList {
    Map<String, List<String>> purchaseList = new HashMap<>();

    public Map<String, List<String>> addPurchaseList(String s, List list) {
        purchaseList.put(s, list);
        return purchaseList;
    }

    public void getListProducts() {
        Map<String, Integer> mapProductsList = new HashMap<>();
        Collection<List<String>> listsOfProducts = purchaseList.values();
        for (List<String> list : listsOfProducts) {
            for (String s : list) {
                if (!mapProductsList.containsKey(s)) {
                    mapProductsList.put(s, 1);
                } else {
                    mapProductsList.put(s, mapProductsList.get(s) + 1);
                }
            }
        }
        for (Map.Entry<String, Integer> pair : mapProductsList.entrySet()) {
            System.out.println(pair);
        }


    }
}
