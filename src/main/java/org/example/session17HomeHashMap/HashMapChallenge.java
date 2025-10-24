package org.example.session17HomeHashMap;
import java.util.*;

public class HashMapChallenge {
    public static void main(String[] args) {

        // 1. Associate the specified value with the specified key in a HashMap.

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Blue");
        System.out.println("1. Initial HashMap: " + map);

        // 2. Count the number of key-value (size) mappings in a map.

        System.out.println("\n2. Size of the HashMap: " + map.size());

        // 3. Copy all mappings from the specified map to another map.

        HashMap<Integer, String> copyMap = new HashMap<>();
        copyMap.putAll(map);
        System.out.println("\n3. Copy of HashMap: " + copyMap);

        // 4. Remove all mappings from a map.

        HashMap<Integer, String> tempMap = new HashMap<>(map);
        tempMap.clear();
        System.out.println("\n4. After clearing tempMap: " + tempMap);

        // 5. Check whether a map contains key-value mappings (empty) or not.

        System.out.println("\n5. Is original map empty? " + map.isEmpty());
        System.out.println("Is cleared map empty? " + tempMap.isEmpty());

        // 6. Get a shallow copy of a HashMap instance.

        HashMap<Integer, String> shallowCopy = (HashMap<Integer, String>) map.clone();
        System.out.println("\n6. Shallow copy of HashMap: " + shallowCopy);

        // 7. Test if a map contains a mapping for the specified key.

        System.out.println("\n7. Does map contain key 2? " + map.containsKey(2));
        System.out.println("Does map contain key 5? " + map.containsKey(5));

        // 8. Test if a map contains a mapping for the specified value.

        System.out.println("\n8. Does map contain value 'Green'? " + map.containsValue("Green"));
        System.out.println("Does map contain value 'Yellow'? " + map.containsValue("Yellow"));

        // 9. Create a set view of the mappings contained in a map.

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        System.out.println("\n9. Set view of mappings:");
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // 10. Get the value of a specified key in a map.

        System.out.println("\n10. Value of key 1: " + map.get(1));
        System.out.println("Value of key 4 (not present): " + map.get(4)); // returns null

        // 11. Get a set view of the keys contained in this map.

        Set<Integer> keySet = map.keySet();
        System.out.println("\n11. Keys in the map: " + keySet);

        // 12. Get a collection view of the values contained in this map.

        Collection<String> values = map.values();
        System.out.println("\n12. Values in the map: " + values);
    }
}
