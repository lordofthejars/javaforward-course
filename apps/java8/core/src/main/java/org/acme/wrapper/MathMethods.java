package org.acme.wrapper;

public class MathMethods {
    

    public static void main(String[] args) {

        System.out.println("Sum " + Math.addExact(1, 3));
        
        try {
            System.out.println("Sum Overflow " + Math.addExact(Integer.MAX_VALUE, 3));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // for long/subtract, multiply

        System.out.println("Negate " + Math.negateExact(4));
        System.out.println("To Int" + Math.toIntExact(5L));

        try {
            System.out.println("to Int Overflow" + Math.toIntExact(Long.MAX_VALUE));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("FloorDiv vs / " + Math.floorDiv(-4, 3) + " ** " + -4/3);
        System.out.println("FloorMod vs % " + Math.floorMod(-4, 3) + " ** " + -4/3);

        System.out.println(Math.nextDown(2.3));

    }

}