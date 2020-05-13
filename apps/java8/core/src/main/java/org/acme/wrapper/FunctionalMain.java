package org.acme.wrapper;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalMain {
    

    public static void main(String args[]) {

        Runnable r = new Runnable(){
        
            @Override
            public void run() {
            }
        };

        Runnable r2 = () -> System.out.println("Hello");

        Consumer<String> c = (String x) -> System.out.println(x);
        c.accept("Hi");

        Consumer<String> c2 = new Consumer<String>() {

            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        };

        c2.accept("Aloha");

        Predicate<String> p = (String t) -> t.startsWith("A");
        System.out.println(p.test("Alex"));

        // no statement return
        Predicate<String> p2 = (String t) -> {
            String uppercase = t.toUpperCase();
            return uppercase.startsWith("A");
        };
        System.out.println(p2.test("Alex"));
    }   

}