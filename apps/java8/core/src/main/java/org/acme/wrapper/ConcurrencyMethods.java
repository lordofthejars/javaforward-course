package org.acme.wrapper;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrencyMethods {
    

    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        map.put(1, "Alex");
        map.put(2, "Burr");
        map.put(3, "Edson");
        map.put(4, "Kamesh");
        map.put(5, "Sebi");

        map.forEach((k, v) -> System.out.println("Key: " + k + "Value: " + v));

        System.out.println("Map Count: " + map.mappingCount());

        String element = map.search(2, (k, v) -> {
            if (v.startsWith("A")) {
                return v;
            }

            return null;
        });

        System.out.println("Searched Element: " + element);

        Integer totalChars = map.reduce(2, (k, v) -> v.length(), (v1, v2) -> v1 + v2);
        System.out.println("Total Chars: " + totalChars);

        // for each key, search keys, reduce keys, reduce To double, int, ... reduce Values, search values

        ExecutorService newWorkStealingPool = Executors.newWorkStealingPool();
        newWorkStealingPool.submit(() -> System.out.println("Hi"));

    }

}