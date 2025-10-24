package org.example.session17HomeHashSet;

import java.util.*;

public class HashSetChallenge {
    public static void main(String[] args) {

        // 1. Append the specified element to the end of a hash set.

        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println("1. Initial HashSet: " + colors);

        // 2. Iterate through all elements in a hash set.

        System.out.println("\n2. Iterating through all elements:");
        for (String color : colors) {
            System.out.println(color);
        }

        // 3. Get the number of elements in a hash set.

        System.out.println("\n3. Number of elements in the HashSet: " + colors.size());

        // 4. Empty a hash set.

        HashSet<String> tempSet = new HashSet<>(colors);
        tempSet.clear();
        System.out.println("\n4. After emptying the HashSet: " + tempSet);

        // 5. Test a hash set is empty or not.

        System.out.println("\n5. Is the original HashSet empty? " + colors.isEmpty());
        System.out.println("Is the cleared HashSet empty? " + tempSet.isEmpty());

        // 6. Clone a hash set to another hash set.

        HashSet<String> clonedSet = (HashSet<String>) colors.clone();
        System.out.println("\n6. Cloned HashSet: " + clonedSet);

        // 7. Convert a hash set to an array.

        String[] colorArray = new String[colors.size()];
        colors.toArray(colorArray);
        System.out.println("\n7. HashSet converted to array:");
        for (String c : colorArray) {
            System.out.println(c);
        }

        // 8. Convert a hash set to a tree set.

        TreeSet<String> treeSet = new TreeSet<>(colors);
        System.out.println("\n8. HashSet converted to TreeSet (sorted): " + treeSet);

        // 9. Convert a hash set to a List/ArrayList.

        ArrayList<String> colorList = new ArrayList<>(colors);
        System.out.println("\n9. HashSet converted to ArrayList: " + colorList);

        // 10. Compare two hash sets.

        HashSet<String> anotherSet = new HashSet<>();
        anotherSet.add("Red");
        anotherSet.add("Yellow");
        anotherSet.add("Blue");
        System.out.println("\n10. Comparing two HashSets:");
        System.out.println("First HashSet: " + colors);
        System.out.println("Second HashSet: " + anotherSet);
        System.out.println("Are they equal? " + colors.equals(anotherSet));

        // 11. Compare two sets and retain elements which are same on both sets.

        HashSet<String> intersection = new HashSet<>(colors);
        intersection.retainAll(anotherSet);
        System.out.println("\n11. Common elements between both sets: " + intersection);

        // 12. Remove all the elements from a hash set.

        colors.clear();
        System.out.println("\n12. After removing all elements, HashSet: " + colors);
    }
}

