package Collections;

import java.util.ArrayDeque;

/*
 why ArrayDeque invented we already have
    - Stack (LIFO)
    - Queue (FIFO)
    bcz sometime we need both behaviors in one data structure.

    Problem:
        Imagine you're managing buses parked in a line
        sometimes:
        - bus enters from the front.
        - sometimes from the back.
        - sometimes bus leaves from the front.
        - sometimes from the back.
    * A normal Queue allows insertion only at the one end and
      removal from the other.
    * A Stack allows insertion and removal only from the top.
    NEITHER is flexible enough.

    Java Solution : ArrayDeque
    Deque stands for:
        Double Ended Queue
        - you can add and remove elements from both ends.
 */
public class ArrayDequeJava {
    static void main(String[] args) {
        ArrayDeque <String> buses = new ArrayDeque<>();

        // insertion at front
        buses.addFirst("Bus A");

        // insertion at back
        buses.addLast("Bus B");

        buses.addFirst("Bus C");

        System.out.println(buses);
        // accessing from front
        System.out.println(buses.peekFirst());

        // accessing from last
        System.out.println(buses.peekLast());

        // removeFirst -> remove from front
        buses.removeFirst();

        // removeLast -> remove from back
        buses.removeLast();

        System.out.println(buses);
    }
}
