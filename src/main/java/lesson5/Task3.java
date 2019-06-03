package lesson5;

import java.util.HashMap;
import java.util.Map;

public class Task3 {

    public static void main(String[] args) {
        Map<String, Integer> map  = new HashMap<String, Integer>();

        map.put("BMV", 5);
        map.put("AUDI", 8);
        map.put("LADA", 9);

        for (Map.Entry<String, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
    }
}
