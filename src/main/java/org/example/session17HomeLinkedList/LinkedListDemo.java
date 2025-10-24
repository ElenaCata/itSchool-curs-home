package org.example.session17HomeLinkedList;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Blue");
        System.out.println("1. Initial LinkedList: " + String.valueOf(linkedList));
        System.out.println("\n2. Iterating through all elements:");

        for(String color : linkedList) {
            System.out.println(color);
        }

        System.out.println("\n3. Iterate starting from index 1:");
        Iterator<String> iterator = linkedList.listIterator(1);

        while(iterator.hasNext()) {
            System.out.println((String)iterator.next());
        }

        System.out.println("\n4. Iterate in reverse order:");
        Iterator<String> descendingIterator = linkedList.descendingIterator();

        while(descendingIterator.hasNext()) {
            System.out.println((String)descendingIterator.next());
        }

        linkedList.add(1, "Yellow");
        System.out.println("\n5. After inserting 'Yellow' at position 1: " + String.valueOf(linkedList));
        linkedList.addFirst("Black");
        linkedList.addLast("White");
        System.out.println("\n6. After inserting at first and last position: " + String.valueOf(linkedList));
        linkedList.offerFirst("Pink");
        System.out.println("\n7. After inserting 'Pink' at front: " + String.valueOf(linkedList));
        linkedList.offerLast("Gray");
        System.out.println("\n8. After inserting 'Gray' at end: " + String.valueOf(linkedList));
        LinkedList<String> newColors = new LinkedList();
        newColors.add("Cyan");
        newColors.add("Magenta");
        linkedList.addAll(3, newColors);
        System.out.println("\n9. After inserting 'Cyan' and 'Magenta' at position 3: " + String.valueOf(linkedList));
        linkedList.add("Red");
        System.out.println("\n10. Index of first 'Red': " + linkedList.indexOf("Red"));
        System.out.println("Index of last 'Red': " + linkedList.lastIndexOf("Red"));
        System.out.println("\n11. Display elements with their positions:");

        for(int i = 0; i < linkedList.size(); ++i) {
            System.out.println("Index " + i + ": " + (String)linkedList.get(i));
        }

        linkedList.remove("Magenta");
        System.out.println("\n12. After removing 'Magenta': " + String.valueOf(linkedList));
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("\n13. After removing first and last: " + String.valueOf(linkedList));
        LinkedList<String> tempList = new LinkedList(linkedList);
        tempList.clear();
        System.out.println("\n14. After clearing all elements: " + String.valueOf(tempList));
        Collections.swap(linkedList, 0, 2);
        System.out.println("\n15. After swapping elements at index 0 and 2: " + String.valueOf(linkedList));
        Collections.shuffle(linkedList);
        System.out.println("\n16. After shuffling: " + String.valueOf(linkedList));
        LinkedList<String> secondList = new LinkedList();
        secondList.add("Gold");
        secondList.add("Silver");
        LinkedList<String> joinedList = new LinkedList(linkedList);
        joinedList.addAll(secondList);
        System.out.println("\n17. After joining two linked lists: " + String.valueOf(joinedList));
        LinkedList<String> clonedList = (LinkedList)linkedList.clone();
        System.out.println("\n18. Cloned LinkedList: " + String.valueOf(clonedList));
        String firstElement = (String)linkedList.pollFirst();
        System.out.println("\n19. Removed first element: " + firstElement);
        System.out.println("LinkedList after removal: " + String.valueOf(linkedList));
        String peekElement = (String)linkedList.peekFirst();
        System.out.println("\n20. First element (without removing): " + peekElement);
        System.out.println("Final LinkedList: " + String.valueOf(linkedList));
    }
}

