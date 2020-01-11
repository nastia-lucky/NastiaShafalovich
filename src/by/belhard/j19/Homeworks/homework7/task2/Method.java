package by.belhard.j19.Homeworks.homework7.task2;

import java.util.*;

public class Method {
    public static Map<Character, Integer> getCharacters(String string) {
        Map<Character, Integer> newMap = new HashMap<>();
        Set<Character> punctuationMarks = new HashSet<>(Arrays.asList('[', '(', '{', '.', '!', '-', ':', '?', '}', ')', ']'));
        char[] charArray = string.toLowerCase().toCharArray();
        for (char c : charArray) {
            char key = c;
            if (punctuationMarks.contains(c)) {
                key = '?';
            }
            if (!newMap.containsKey(key)) {
                newMap.put(key, 1);
            } else {
                newMap.put(key, newMap.get(key) + 1);
            }
        }
        System.out.println(newMap);
        return newMap;

    }
}
