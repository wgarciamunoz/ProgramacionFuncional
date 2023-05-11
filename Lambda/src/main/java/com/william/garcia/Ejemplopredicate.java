package com.william.garcia;

import java.util.function.Predicate;

public class Ejemplopredicate {
    public static void main(String[] args) {

        // Simpre devuelve un Boolean

        Predicate<Integer> test = num -> num > 10;
        
        boolean ra = test.test(45);

        Predicate<String> testA = chr -> chr.equals("A");

        boolean r = testA.test("sss");
        System.out.println("r = " + r);
    }
}
