package org.acme.wrapper;

import java.util.List;

public class DefaultsInterface {
    
    public interface ShoppingCart {
        List<String> get();
        int size();
        default boolean isEmpty() {
            return size() == 0;
        }

        static void log() {
            System.out.println("hello");
        }
    }

    public static class InMemShoppingCart implements ShoppingCart {

        @Override
        public List<String> get() {
            return null;
        }

        @Override
        public int size() {
            return 0;
        }

    }

    public static void main(String args[]) {
        System.out.println(new InMemShoppingCart().isEmpty());
        ShoppingCart.log();
    }

}