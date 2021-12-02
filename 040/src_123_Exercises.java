// Capture.java
package com.jdojo.lambda.exercises;
import java.util.function.Function;
public class Capture {
    public static void main(String[] args) {
        test();
        test();
    }
    public static void test() {
        int n = 100;
        Function<Integer,Integer> f = x -> n + 1;
        System.out.println(f.apply(100));
    }
}
