package com.sample;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.WeakHashMap;

public class Demo {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque=new ArrayDeque<>();
        arrayDeque.offer(10);// add element at last bcoz queue
        arrayDeque.offer(20);
        arrayDeque.offer(15);
        arrayDeque.offer(11);
        arrayDeque.offer(9);
        arrayDeque.offerFirst(5); // add element at first bcoz deque
        System.out.println("Elements of arrayDeque is"+arrayDeque);
        System.out.println(arrayDeque.poll()); // Delete element from front
        System.out.println(arrayDeque.pollLast()); // Delete from last
        System.out.println(arrayDeque.pollFirst());// Delete from front
    }
}
