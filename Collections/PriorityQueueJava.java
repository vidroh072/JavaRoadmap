package Collections;

import java.util.PriorityQueue;

/*
 Why was PriorityQueue invented ?
 Imagine normal Queue at bus station
 people come in order
    - Riyansh
    - Anishk
    - Ayush
 A normal Queue serves them like this;
   - Riyansh
   - Anishk
   - Ayush
   this is called FIFO -> first in, first out

   Problem:
    Now imagine you managing a hospital
    patients arrive
        Riyansh (Normal)
        Anishk  (Critical)
        Ayush   (Normal)
    Should doctor treat them in arrival order ? ❌
    the critical patient should treat first.
    A normal queue cannot do that.

    Java Solution : PriorityQueue
    - it serves elements acc to priority, not insertion order.
    - for numbers, the smallest number has the highest priority
      by default.

 */
public class PriorityQueueJava {
    static void main(String[] args) {
        PriorityQueue <Integer> pq = new PriorityQueue<>();

        // insertion element
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(5);
        System.out.println(pq);

        // method poll() -> removing element
        System.out.println(pq.poll()); // 5 smallest no -Hp

        // method offer -> add element
        // same as add

        // method peek() -> see highest priority
        System.out.println(pq.peek());

        // method size()
        System.out.println(pq.size());


    }
}
