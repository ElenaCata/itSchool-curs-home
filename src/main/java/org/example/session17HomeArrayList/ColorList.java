package org.example.session17HomeArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ColorList {
    public static void main(String[] args) {
        // 1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Purple");
        colors.add("Gray");
        colors.add("Burgundy");
        colors.add("Red");

        System.out.println("The colors in the list are: " + colors);

        // 2. Write a Java program to iterate through all elements in an array list.
        System.out.println("\nColors in the list:");
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println();

        //3. Write a Java program to insert an element into the array list at the first position.
        colors.add(0, "Orange");
        System.out.println("After inserting 'Orange' at the beginning:");
        for (String color : colors) {
            System.out.println(color);
        }


        //4. Write a Java program to retrieve an element (at a specified index) from a given array list.
        String secondColor = colors.get(1);
        System.out.println("\nElement at index 1: " + secondColor);
        System.out.println("----------------");

        //5. Write a Java program to update specific array element by given element.
        int indexToUpdate = colors.indexOf("Gray");
        if (indexToUpdate != -1) {
            colors.set(indexToUpdate, "Silver");
            System.out.println("After updating 'Gray' to 'Silver':");
            System.out.println(colors);
        } else {
            System.out.println("'Gray' not found in the list.");
        }
        System.out.println("----------------");

        //6. Write a Java program to remove the third element from an arraylist.
        if (colors.size() >= 3) {
            String removeColor = colors.remove(2);
            System.out.println("Third element removed : " + removeColor);
            System.out.println("After removal: " + colors);
        } else {
            System.out.println("The list has fewer than 3 elements.");
        }
        System.out.println("----------------");

        // 7. Write a Java program to search an element in a array list.
        String elementToSearch = "Red";
        if (colors.contains(elementToSearch)) {
            System.out.println("The color '" + elementToSearch + "' was found in the list.");
        } else {
            System.out.println("The color '" + elementToSearch + "' is NOT in the list.");
        }


        // 8. Write a Java program to sort a given array list.
        Collections.sort(colors);
        System.out.println("\nSorted list of colors:");
        for (String color : colors) {
            System.out.println(color);
        }

        //9. Write a Java program to copy one array list into another.
        ArrayList<String> copiedColors = new ArrayList<>(colors);
        System.out.println("\nCopied list of colors:");
        for (String color : copiedColors) {
            System.out.println(color);
        }
        // 10. Shuffle elements in an array list.
        Collections.shuffle(copiedColors);
        System.out.println("\nShuffled list of colors:");
        for (String color : copiedColors) {
            System.out.println(color);
        }

        // 11. Reverse elements in an array list.
        Collections.reverse(copiedColors);
        System.out.println("\nReversed list of colors:");
        for (String color : copiedColors) {
            System.out.println(color);
        }

        // 12.Write a Java program to extract a portion of a array list.
        int startIndex = 1;
        int endIndex = 3;
        System.out.println("\nExtracted sublist (index 1 to 3):");
        ArrayList<String> subList = new ArrayList<>(copiedColors.subList(startIndex, endIndex));
        for (String color : subList) {
            System.out.println(color);
        }


        // 13. Write a Java program to compare two array lists.
        ArrayList<String> anotherList = new ArrayList<>();
        anotherList.add("Blue");
        anotherList.add("Green");
        anotherList.add("Yellow");
        anotherList.add("Red");

        if (copiedColors.equals(anotherList)) {
            System.out.println("\nThe two lists are equal.");
        } else {
            System.out.println("\nThe two lists are NOT equal.");
        }
        // 14. Write a Java program of swap two elements in an array list.
        copiedColors.ensureCapacity(10);
        System.out.println("Capacity increased to at least 10.");

        copiedColors.add("Teal");
        copiedColors.add("Magenta");
        copiedColors.add("Cyan");

        System.out.println("After adding new colors:");
        for (String color : copiedColors) {
            System.out.println(color);
        }
        System.out.println("\n----------------");

        //15. Write a Java program to join two array lists.
        ArrayList<String> joinedList = new ArrayList<>(); // Creăm o listă nouă, goală

        joinedList.addAll(colors);
        joinedList.addAll(anotherList);
        System.out.println("\nJoined list:");

        for (String color : joinedList) {
            System.out.println(color);
        }
        System.out.println("\n----------------");

        //16. Write a Java program to clone an array list to another array list.
        ArrayList<String> clonedColors =  new ArrayList<>(colors);
        System.out.println("\nCloned list of colors:");
        for (String color : clonedColors) {
            System.out.println(color);
        }

        //17.Write a Java program to empty an array list.
        colors.clear();
        System.out.println("\nList after clearing all elements " + colors);

        //18. Write a Java program to test an array list is empty or not.
        if (colors.isEmpty()) {
            System.out.println("The colors list is empty.");
        } else {
            System.out.println("The colors list has " + colors.size() + " colors.");
        }
        System.out.println("\n----------------");

        //19.Write a Java program to trim the capacity of an array list the current list size.
        colors.trimToSize();
        System.out.println("List size after trimming to current list size: " + colors.size());
        System.out.println("\n----------------");

        //20. Write a Java program to increase the size of an array list.
        colors.ensureCapacity(15);
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Pink");
        System.out.println("Size after adding elements: " + colors.size());
    }
}
