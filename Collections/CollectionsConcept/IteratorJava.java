package Collections.CollectionsConcept;
/*
 Why was iterator invented;
 we already use loop like this
 for(String name : names){....}
 - so why do we need iterators

 suppose you want to remove elements while traversing a collection.
 example:
    for(String name : names){
        if(name.equals("Riyansh")){
            names.remove(name)
         }
     }
    will it work ❌
    it throws ConcurrentModificationException bcz you're modifing
    the collection while looping through it.

    Java Solution : Iterator

 */

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorJava {
    static void main(String[] args) {
        ArrayList <String> names = new ArrayList<>();

        names.add("Riyansh");
        names.add("Ayush");
        names.add("Anishk");

        // creating Iterator
        Iterator <String> it = names.iterator();
        // iterator() creates an iterator object for the collection.

        // method hasNext() -> check whether another element exists.
        System.out.println(it .hasNext());

        // method next() -> move to next & return next element.
        System.out.println(it.next());  // Riyansh

        // Traversing a collection
        while(it.hasNext()){    // start from Ayush. line 42
            System.out.println(it.next()+" ");
        }

        // all iterator element accessed so we have to create again to start
        Iterator<String> iter = names.iterator();
        // removing safely

        while(iter.hasNext()){
            String name = iter.next();
            if(name.equals("Riyansh")) {
                iter.remove();
            }
        }

        System.out.println(names);
        // iterator only moves forward.
        // start again create new iterator.
        // it update orignal ArrayList.
        // you dont have to convert back.

        // iterator not a collection a helper use to traverse (Safely).
    }

}

