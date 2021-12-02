// SupplierTest.java
package com.jdojo.lambda.exercises;
import java.util.function.Supplier;
public class SupplierTest {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> {
            int counter = 0;
            return ++counter;
        };
        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }
}
