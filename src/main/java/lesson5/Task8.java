package lesson5;

import java.util.HashMap;
import java.util.Map;

public class Task8 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("watermelon", "berry");
        map.put("banana", "fruit");
        map.put("cherry", "berry");
        map.put("pineapple", "berry");
        map.put("melon", "vegetable");
        map.put("cranberry", "berry");
        map.put("apple", "berry");
        map.put("iris", "flower");
        map.put("potato", "vegetable");
        map.put("carrot", "vegetable");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals("vegetable"))
                System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
