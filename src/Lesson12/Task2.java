package Lesson12;

import java.util.HashMap;
import java.util.Map;

/**
 * Задача 4: Объединение двух Map с суммированием значений
 * Объединить Map<String, Int>, суммируя повторяющиеся ключи.
 */
public class Task2 {
    public static void main(String[] args) {
        Map<String,Integer> mapText1 = new HashMap<>();
        Map<String,Integer> mapText2 = new HashMap<>();
        mapText1.put("яблоко", 2);
        mapText1.put("банан", 1);
        mapText1.put("киви", 5);
        mapText1.put("арбуз", 18);

        mapText2.put("яблоко", 7);
        mapText2.put("апельсин", 3);
        mapText2.put("арбуз", 13);
        mapText2.put("киви", 4);
        Map<String,Integer> mapText3 = new HashMap<>(mapText1);
        for (Map.Entry<String, Integer> entry : mapText2.entrySet()){
            if (mapText1.containsKey(entry.getKey())){
                int value1 = mapText1.get(entry.getKey());
                int value3 = value1+entry.getValue();
                mapText3.put(entry.getKey(), value3);
            }else {
                mapText3.put(entry.getKey(), entry.getValue());
            }


        }
        for (Map.Entry<String, Integer> entry : mapText3.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("----");

        }
    }
}
