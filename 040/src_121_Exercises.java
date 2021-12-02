// Scope.java
package com.jdojo.lambda.exercises;
import java.util.function.Function;
public class Scope {
    private static long n = 100;
    private static Function<Long,Long> f = n -> n + 1;
    public static void main(String[] args) {
        System.out.println(n);
        System.out.println(f.apply(n));
        System.out.println(n);
    }
}
