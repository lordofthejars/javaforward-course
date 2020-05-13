package org.acme.wrapper;

public class WrapperMethods {
    
    public static void numbers(int a, int b) {
        System.out.println("Max " + Integer.max(a, b));
        System.out.println("Min " + Integer.min(a, b));
        System.out.println("Sum " + Integer.sum(a, b));
        // Same for Long, Double, Float
    }

    public static void booleans(boolean a, boolean b) {
        System.out.println("And " + Boolean.logicalAnd(a, b));
        System.out.println("Or " + Boolean.logicalOr(a, b));
        System.out.println("Xor " + Boolean.logicalXor(a, b));
    }

    public static void main(String[] args) {
        WrapperMethods.booleans(true, false);
        WrapperMethods.numbers(3, 4);
    }

}