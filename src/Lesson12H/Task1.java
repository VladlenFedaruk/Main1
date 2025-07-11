package Lesson12H;

import java.util.*;

public class Task1 {
    public static Map<Character, Integer> strToMap(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character symbol = Character.toLowerCase(str.charAt(i));
            int count = map.getOrDefault(symbol, 0) + 1;
            map.put(symbol, count);
        }
        return map;
    }

    public static boolean anagram(String str1, String str2) {
        Map<Character, Integer> map1 = strToMap(str1);
        Map<Character, Integer> map2 = strToMap(str2);
        if (map1.size() != map2.size()) return false;
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !map2.get(entry.getKey()).equals(entry.getValue())) return false;
        }
        return true;
    }

    public static void sortArray(String[] text) {
        LinkedList<String> list1 = new LinkedList<>();
        ArrayDeque<String> textS = new ArrayDeque<>();
        String[] textNotSort = text;
        String textSort = "";
        Map<String, Integer> map3 = new HashMap<>();
        for (int i = 0; i < textNotSort.length; i++) {
            list1.addLast(textNotSort[i]);
        }
        System.out.println(list1);
        while (!list1.isEmpty()) {
            String st1 = list1.pollFirst();
            textS.addFirst(st1);
            int l = list1.size();
            for (int c = 0; c <= l; c++) {
                if (!list1.isEmpty()) {
                    String st2 = list1.pollFirst();
                    if (anagram(st1, st2)) {
                        textS.addFirst(st2);
                    } else list1.addLast(st2);
                } else break;
            }
            int n = textS.size();
            for (int i = 0; i < n; i++) {
                String st2 = textS.getFirst();
                textS.removeFirst();
                textSort = textSort.concat(st2).concat(" ");
            }
            map3.put(textSort, n);
            textS.clear();
            textSort = "";

        }
        for (int t = text.length; t > 0; t--) {
            for (Map.Entry<String, Integer> entry : map3.entrySet()) {
                if (entry.getValue() == t) {
                    System.out.println(entry.getKey());
                }

            }

        }
    }


}

