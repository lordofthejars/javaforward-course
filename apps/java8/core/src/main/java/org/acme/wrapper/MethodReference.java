package org.acme.wrapper;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReference {
    
    public static void main(String args[]) {

        // Type 1
        Consumer<String> c = s -> System.out.println(s);

        Consumer<String> c2 = System.out::println;
        c2.accept("Alex");

        // Type 2
        Function<String, Integer> f = s -> s.length();
        System.out.println(f.apply("Alex"));

        Function<String, Integer> f2 = String::length;
        System.out.println(f2.apply("Alex"));

        BiFunction<String, String, Boolean> bif = (s, start) -> s.startsWith(start);
        System.out.println(bif.apply("Alex", "A"));

        BiFunction<String, String, Boolean> bif2 = String::startsWith;
        System.out.println(bif2.apply("Edson", "E"));

        // type 3

        String s = "Alex";
        Function<String, Boolean> fu = s::startsWith;
        System.out.println(fu.apply("E"));

        Function<String, Thread> ft = Thread::new;

    }


}