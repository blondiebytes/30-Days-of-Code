/*
 * Copyright 2015 blondiebytes
 */
package generics;

/**
 * @author kathrynhodge
 */
public class Generics {

    /**
     * @param args the command line arguments
     */
    
    public static <T extends Comparable <T>> T findMax(T a, T b) {
        int n = a.compareTo(b);
        if (n < 0) {
            return b;
        } else {
            return a;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(findMax(2, 3));
        System.out.println(findMax(3, 3));
        System.out.println(findMax(3, 2));
        
        System.out.println(findMax(2.0, 3.0));
        System.out.println(findMax('a', 'b'));
        System.out.println(findMax("hello", "there"));
        
       // Generics k = new Generics();
       // System.out.println(findMax(k, k));
    }

    
}
