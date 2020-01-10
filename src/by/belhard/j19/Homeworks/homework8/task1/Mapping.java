package by.belhard.j19.Homeworks.homework8.task1;

import java.util.HashMap;
import java.util.Map;

public class Mapping {

    public static void getRussian(String s) {
    Map<Character, Character> mapping = new HashMap<>();
    mapping.put('A','A');
    mapping.put('a','a');
    mapping.put ('M', 'M');
    mapping.put ('m', 'м');
    mapping.put ('y', 'ы');
    mapping.put ('l', 'л');
    mapping.put ('r', 'р');
    mapping.put ('u','у');

    char [] chars = s.toCharArray();
    StringBuilder sb= new StringBuilder();

    for (char c: chars){
        if (!mapping.containsKey(c)){
            sb.append(c);
        }
        else {
            sb.append(mapping.get(c));
        }
    }
        System.out.println(sb);
}
}
