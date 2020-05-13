package org.acme.wrapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionMethods {
    
    public static void main(String[] args) {

        Collection<String> letters = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));

        letters.iterator().forEachRemaining(l -> System.out.println("Iterate: " + l));

        letters.removeIf(l -> "B".equals(l));
        letters.forEach(l -> System.out.println("Not Removed: " + l));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Alex");
        map.put(2, "Burr");
        map.put(3, "Edson");
        map.put(4, "Kamesh");
        map.put(5, "Sebi");

        System.out.println("**** Default ****");

        System.out.println(map.getOrDefault("Max", "Not Found"));
        
        map.forEach((k, v) -> System.out.println("Map: " + k + " " + v));

        System.out.println("**** Replace ****");
        map.replaceAll((k, v) -> v.toUpperCase());
        map.forEach((k, v) -> System.out.println("Map: " + k + " " + v));

        System.out.println("**** Put If Absent ****");

        map.putIfAbsent(5, "NEW");
        map.putIfAbsent(6, "NEW");

        map.forEach((k, v) -> System.out.println("Map: " + k + " " + v));

        System.out.println("**** Remove Map ****");

        map.remove(6, "OLD");
        map.forEach((k, v) -> System.out.println("Map: " + k + " " + v));

        System.out.println("**** Replace with Value ****");

        map.replace(6, "NEW", "NEWNEW");
        map.forEach((k, v) -> System.out.println("Map: " + k + " " + v));

        System.out.println("**** Replace By Key ****");

        map.replace(6, "NEW");
        map.forEach((k, v) -> System.out.println("Map: " + k + " " + v));

        System.out.println("**** Compute ****");

        Map<Integer, List<String>> map2 = new HashMap<>();
        map2.computeIfAbsent(1, k -> new ArrayList<String>()).add("First");
        map2.computeIfPresent(1, (k, v) -> {
            v.add("Second");
            return v;
        });
        map2.forEach((k, v) -> System.out.println("Map: " + k + " " + v));

    }

}