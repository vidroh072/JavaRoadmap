package Collections;
/*
 Why vector invented?
 before ArrayList existed, Java needed a dynamic array.
 so Java created Vector.
 Later ArrayList was introduced as faster alternative for most of situations.

 Vector in legacy(older) code for Interviews.

 Vector: A dynamic array, just like ArrayList
    ✅ Grow automatically.
    ✅ Store duplicate elements.
    ✅ Maintain Insetion order.
    ✅ Access element by index.
 */

import java.util.Vector;

public class VectorJava {
    static void main(String[] args) {
        Vector <String> names = new Vector<>();

        // Insertion elements
        names.add("Riyansh");
        names.add("Anishk");
        names.add("Ayush");
        names.add("Riyansh");

        System.out.println(names);

        // Accessing
        System.out.println(names.get(1));

        // remove
        names.remove(1);


        // size
        System.out.println(names.size());

        // Real project example
        // suppose you maintain an old banking application written years ago.
        // you may find code like Vector

        //   ArrayList                Vector
        //     Faster              slightly slower
        //   not synchronized    synchronized (Thread Safe)

    }
}
