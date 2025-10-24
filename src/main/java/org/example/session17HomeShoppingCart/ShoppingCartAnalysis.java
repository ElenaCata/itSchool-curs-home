package org.example.session17HomeShoppingCart;

import java.util.*;

public class ShoppingCartAnalysis {

    private List<List<String>> shoppingHistory; // Lista cu toate coșurile

    // Constructor
    public ShoppingCartAnalysis() {
        this.shoppingHistory = new ArrayList<>();
    }

    // Method to add a new purchase (shopping cart) to the history

    public void addPurchase(List<String> cart) {
        shoppingHistory.add(cart);
    }

    // Method to find K most frequently purchased items

    public List<String> getTopKFrequentItems(int k) {
        HashMap<String, Integer> freqMap = new HashMap<>();

        // 1. Count frequency of each product across all carts
        for (List<String> cart : shoppingHistory) {
            for (String product : cart) {
                freqMap.put(product, freqMap.getOrDefault(product, 0) + 1);
            }
        }

        // 2. Use a min-heap to keep top K items efficiently
        PriorityQueue<Map.Entry<String, Integer>> minHeap =
                new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll(); // elimină cel mai puțin frecvent
            }
        }

        // 3. Extract items from heap
        List<String> result = new ArrayList<>();
        int minFreqInHeap = minHeap.isEmpty() ? 0 : minHeap.peek().getValue();
        while (!minHeap.isEmpty()) {
            Map.Entry<String, Integer> entry = minHeap.poll();
            result.add(entry.getKey());
            minFreqInHeap = entry.getValue();
        }

        // 4. Handle ties: include any other items with the same frequency as the smallest in heap
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == minFreqInHeap && !result.contains(entry.getKey())) {
                result.add(entry.getKey());
            }
        }

        // Optional: sort descending by frequency
        result.sort((a, b) -> freqMap.get(b) - freqMap.get(a));

        return result;
    }


    // Main method to demonstrate usage

    public static void main(String[] args) {
        org.example.session17HomeShoppingCart.ShoppingCartAnalysis analysis = new org.example.session17HomeShoppingCart.ShoppingCartAnalysis();

        // Adding sample shopping carts
        analysis.addPurchase(Arrays.asList("apple", "banana", "orange"));
        analysis.addPurchase(Arrays.asList("banana", "apple", "apple"));
        analysis.addPurchase(Arrays.asList("banana", "kiwi"));
        analysis.addPurchase(Arrays.asList("orange", "kiwi", "banana"));
        analysis.addPurchase(Arrays.asList("apple", "kiwi", "banana"));

        int K = 2;
        List<String> topItems = analysis.getTopKFrequentItems(K);

        System.out.println("Top " + K + " most frequently purchased items: " + topItems);
    }
}
