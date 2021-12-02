// Stack.java
package com.jdojo.generics.exercises;
import java.util.LinkedList;
import java.util.List;
public class Stack<E> {
    // Use LinkedList instead of ArrayList
    private final List<E> stack = new LinkedList<>();
    public void push(E e) {}
    public E pop() { }
    public E peek() { }
    public boolean isEmpty() { }
    public int size() { }
}    
