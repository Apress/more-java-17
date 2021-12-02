// ConsumerTest.java
package com.jdojo.lambda.exercises;
import java.util.function.Consumer;
public class ConsumerTest {
    public static void main(String[] args) {
         Consumer<String> c1 = System.out::println;
         Consumer<String> c2 = s -> {};
         consume(c1, "Hello");
         consume(c2, "Hello");
    }
    static <T> void consume(Consumer<T> consumer, 
          T item) {
        consumer.accept(item);
    }
}
