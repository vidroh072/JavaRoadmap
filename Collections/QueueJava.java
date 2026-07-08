package Collections;

    // why Queue invented ?
    // Imagine Bus ticket counter
    // three people standing in line
    // Riyansh -> Ayush -> Anishk
    // who get ticket first -> Riyansh
    // bcz he came first that's exactly Queue works

    // A Queue is a linear data structure that follows
    // the FIFO principle. First in First Out
    // Comparision Stack & Queue
    //   Stack              Queue
    // push(Riyansh)    add Riyansh
    // push(Ayush)      add Ayush
    // push(Anishk)     add Anishk      FIFO
    // pop() -> Anishk  remove - Riyansh

    // Bus Ticket Queue
    // first customer arrive serve first
    // Restaurant orders

import java.util.Queue;
import java.util.LinkedList;

public class QueueJava {
    static void main(String[] args) {
        Queue <String> queue = new LinkedList<>();
        // Queue is interface
        // we cannot create obj of interface
        // we can create object of class that implements it
        // Animal a = new Dog();
        // here reference type -> Queue, Object type-> LinkedList

        // insertion
        // method offer() -> Add element to end
        queue.offer("Riyansh"); // Riyansh -> front
        queue.offer("Ayush");   // Ayush
        queue.offer("Anishk");  // Anishk  -> rear

        // method poll() -> removes front element
        System.out.println(queue.poll()); // Ayush - front
                                          // Rohan - rear

        // method peek() -> returns front element
        // without removing it
        System.out.println(queue.peek());

        System.out.println(queue);

        // method size() -> returns number of element
        System.out.println(queue.size());

        // method isEmpty() -> returns true/false

        System.out.println(queue.isEmpty());
    }
    // Real life example
    // suppose your bus booking system receives booking request
    // booking1
    // booking2
    // booking3
    // they should processed in same order
}
