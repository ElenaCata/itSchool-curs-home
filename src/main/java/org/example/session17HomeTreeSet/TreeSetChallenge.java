package org.example.session17HomeTreeSet;

import java.util.*;

public class TreeSetChallenge {
    public static void main(String[] args) {

        // 1. Create a new tree set, add some colors (string) and print out the tree set.

        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        System.out.println("1. TreeSet: " + colors);

        // 2. Iterate through all elements in a tree set.

        System.out.println("\n2. Iterating through TreeSet:");
        for (String color : colors) {
            System.out.println(color);
        }

        // 3. Add all elements of a specified tree set to another tree set.

        TreeSet<String> moreColors = new TreeSet<>();
        moreColors.add("Cyan");
        moreColors.add("Magenta");
        moreColors.addAll(colors);
        System.out.println("\n3. Combined TreeSet: " + moreColors);

        // 4. Create a reverse order view of the elements contained in a given tree set.

        NavigableSet<String> descendingSet = colors.descendingSet();
        System.out.println("\n4. Reverse order view: " + descendingSet);

        // 5. Get the first and last elements in a tree set.

        System.out.println("\n5. First element: " + colors.first());
        System.out.println("Last element: " + colors.last());

        // 6. Clone a tree set list to another tree set.

        TreeSet<String> clonedSet = (TreeSet<String>) colors.clone();
        System.out.println("\n6. Cloned TreeSet: " + clonedSet);

        // 7. Get the number of elements in a tree set.

        System.out.println("\n7. Size of TreeSet: " + colors.size());

        // 8. Compare two tree sets.

        TreeSet<String> otherSet = new TreeSet<>();
        otherSet.add("Red");
        otherSet.add("Green");
        otherSet.add("Purple");
        System.out.println("\n8. Comparing two TreeSets:");
        System.out.println("colors.equals(otherSet)? " + colors.equals(otherSet));

        // 9. Find the numbers less than 7 in a tree set.

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println("\n9. Numbers less than 7: " + numbers.headSet(7));

        // 10. Get the element in a tree set which is greater than or equal to the given element.

        System.out.println("\n10. Element >= 5: " + numbers.ceiling(5));

        // 11. Get the element in a tree set which is less than or equal to the given element.

        System.out.println("\n11. Element <= 5: " + numbers.floor(5));

        // 12. Get the element in a tree set which is strictly greater than or equal to the given element.

        System.out.println("\n12. Element > 5: " + numbers.higher(5));

        // 13. Get an element in a tree set which is strictly less than the given element.

        System.out.println("\n13. Element < 5: " + numbers.lower(5));

        // 14. Retrieve and remove the first element of a tree set.

        Integer firstNum = numbers.pollFirst();
        System.out.println("\n14. Removed first element: " + firstNum);
        System.out.println("TreeSet after removing first: " + numbers);

        // 15. Retrieve and remove the last element of a tree set.

        Integer lastNum = numbers.pollLast();
        System.out.println("\n15. Removed last element: " + lastNum);
        System.out.println("TreeSet after removing last: " + numbers);

        // 16. Remove a given element from a tree set.

        numbers.remove(4);
        System.out.println("\n16. After removing element 4: " + numbers);
    }
}
