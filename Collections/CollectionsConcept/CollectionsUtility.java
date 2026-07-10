package Collections.CollectionsConcept;

import java.util.ArrayList;
import java.util.Collections;

/*
 Why was invented ?
 suppose you have an ArrayList:
    ArrayList <Integer> list = new ArrayList<>();
    list.add(30);
    list.add(10);
    list.add(20);

    should every collection class have all these methods ?
    ❌ No
    Java's solution was to create a helper class called collections ?
    Remember the difference:
    * Collection  -> interface
    * Collections -> utility class (helper methods)

    this is common interview question.

    1. Collections.sort()
        Collections.sort(list);
        System.out.println(list);
    Output: [10,20,30]

    2. Collections.reverse()
        Collections.reverse(list);
        System.out.println(list);
    Output: [30,20,10]

    3. Collections.max()
        Collections.max(list);
        System.out.println(list);
    Output: 30

    4. Collections.min()
        Collections.min(list);
        System.out.println(list);
    Output: 10

    5. Collections.shuffle()
        Collections.shuffle(list);
        System.out.println(list);
    Output: [20,30,10]

 Real Project Example
    imagine your bus project, you have list of fares.
    500, 200, 700
    Need the cheapest fare ?
    Collections.min(fares):
    Need the highest fare ?
    Collections.max(fares):

    what is Collections ?
    - A utility class that provides helper methods for working
      with collections.
    Is collections same as Collection ❌
    * Collection  -> interface
    * Collections -> utility class with static methods.
 */
public class CollectionsUtility {
    static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(50);
        list.add(10);
        list.add(30);
        list.add(50);
        System.out.println("Orignal: "+list);
        Collections.sort(list);
        System.out.println("Sort: "+list);
        Collections.reverse(list);
        System.out.println("reverse: "+list);

    }
}
