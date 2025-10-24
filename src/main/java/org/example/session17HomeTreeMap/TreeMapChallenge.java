package org.example.session17HomeTreeMap;

import java.util.*;

public class TreeMapChallenge {
    public static void main(String[] args) {

        // 1. Associate the specified value with the specified key in a TreeMap.
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "Red");
        map.put(3, "Green");
        map.put(2, "Blue");
        System.out.println("1. Initial TreeMap: " + map);

        // 2. Copy a TreeMap content to another TreeMap.

        TreeMap<Integer, String> copyMap = new TreeMap<>(map);
        System.out.println("\n2. Copied TreeMap: " + copyMap);

        // 3. Search a key in a TreeMap.

        System.out.println("\n3. Does key 2 exist? " + map.containsKey(2));

        // 4. Search a value in a TreeMap.

        System.out.println("\n4. Does value 'Green' exist? " + map.containsValue("Green"));

        // 5. Get all keys from a TreeMap.

        Set<Integer> keys = map.keySet();
        System.out.println("\n5. Keys in TreeMap: " + keys);

        // 6. Delete all elements from a given TreeMap.

        TreeMap<Integer, String> tempMap = new TreeMap<>(map);
        tempMap.clear();
        System.out.println("\n6. After clearing tempMap: " + tempMap);

        // 7. Sort keys in TreeMap by using comparator.

        TreeMap<Integer, String> reverseMap = new TreeMap<>(Collections.reverseOrder());
        reverseMap.putAll(map);
        System.out.println("\n7. TreeMap sorted by reverse order: " + reverseMap);

        // 8. Get a key-value mapping associated with the greatest key and the least key.

        System.out.println("\n8. Greatest key mapping: " + map.lastEntry());
        System.out.println("Least key mapping: " + map.firstEntry());

        // 9. Get the first (lowest) key and the last (highest) key currently in a map.

        System.out.println("\n9. First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());

        // 10. Get a reverse order view of the keys contained in a given map.

        NavigableMap<Integer, String> descendingMap = map.descendingMap();
        System.out.println("\n10. Reverse order view of keys: " + descendingMap);

        // 11. Get a key-value mapping associated with the greatest key less than or equal to the given key.

        System.out.println("\n11. Entry <= 2: " + map.floorEntry(2));

        // 12. Get the greatest key less than or equal to the given key.

        System.out.println("\n12. Greatest key <= 2: " + map.floorKey(2));

        // 13. Get the portion of a map whose keys are strictly less than a given key.

        System.out.println("\n13. Portion with keys < 3: " + map.headMap(3, false));

        // 14. Get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.

        System.out.println("\n14. Portion with keys <= 3: " + map.headMap(3, true));

        // 15. Get the least key strictly greater than the given key.

        System.out.println("\n15. Least key > 2: " + map.higherKey(2));

        // 16. Get a key-value mapping associated with the greatest key strictly less than the given key.

        System.out.println("\n16. Entry < 3: " + map.lowerEntry(3));

        // 17. Get the greatest key strictly less than the given key.

        System.out.println("\n17. Greatest key < 3: " + map.lowerKey(3));
    }
}
