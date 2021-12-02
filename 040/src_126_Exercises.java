// PredicateTest.java
package com.jdojo.lambda.exercises;
import java.util.function.Predicate;
public class PredicateTest {
   public static void main(String[] args) {
       int[] nums = {1, 2, 3, 4, 5};
       filterThenPrint(nums, n -> n%2 == 0);
       filterThenPrint(nums, n -> n%2 == 1);
   }
   static void filterThenPrint(int[] nums, 
         Predicate<Integer> p) {
       for(int x : nums) {
           if(p.test(x)) {
               System.out.println(x);
           }
       }
   }
}
