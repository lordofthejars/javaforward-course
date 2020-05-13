package org.acme.wrapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JavaStreams {
    
    public static void main(String args[]) {

        final List<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Edson");
   

        Optional<String> name = names.stream()
             .filter(n -> n.startsWith("A"))
             .map(n -> n.toUpperCase()).limit(1)
             .findFirst();
        System.out.println(name);

             // collect
        List<String> filteredNames = names.stream()
             .filter(n -> n.startsWith("A"))
             .map(n -> n.toUpperCase()).limit(1)
             .collect(Collectors.toList());
        System.out.println(filteredNames);
             // count
        
        long num = names.stream()
             .filter(n -> n.startsWith("A"))
             .map(n -> n.toUpperCase())
             .count();
        System.out.println(num);
        
        // reduce
        Optional<String> reduced = names.stream()
             .reduce((x, y) -> x.concat(y));
        System.out.println(reduced);
            // match
        boolean allA = names.stream()
            .allMatch(n -> n.startsWith("A"));
        System.out.println(allA);
             // flatMap
        
        final List<List<String>> namesAndRegion = new ArrayList<>();
        namesAndRegion.add(Arrays.asList("Alex", "Sebi"));
        namesAndRegion.add(Arrays.asList("Burr", "Edson"));
        
        namesAndRegion.stream()
        .flatMap(l -> l.stream())
        .filter(n -> n.startsWith("A"))
        .forEach(n -> System.out.println(n));

    }

}