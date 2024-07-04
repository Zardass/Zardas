package ders19;

import java.util.*;

public class Classmates {
    public static void main(String[] args) {
        HashMap<String,Integer> classmates = new HashMap<>();
        classmates.put("Zerda",19);
        classmates.put("Fegan",19);
        classmates.put("Rahibe",23);
        System.out.println(classmates);

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(classmates.entrySet());

        // Sort the list based on values (age) using a Comparator
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                // Compare values (ages)
                return entry1.getValue().compareTo(entry2.getValue());
            }
        });

        // Create a LinkedHashMap to store the sorted entries
        LinkedHashMap<String, Integer> sortedClassmates = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedClassmates.put(entry.getKey(), entry.getValue());
        }

        // Print the sorted map
        System.out.println("Sorted by Values:");
        System.out.println(sortedClassmates);
    }

}
