package Collections;

import java.util.TreeSet;

/*
 Why TreeSet invented when we already have HashSet
 Problem
    Suppose your bus service travel to this cities
    -Indore  -Nagpur    -Delhi
    -Bhopal  -Ahemdabad
    You stored them in HashSet;
    Output will be: unordered / Random
    # Now your manager said show them in alphabetical order
    - can Hashset do it ?

    Solution TreeSet
    ✅ unique elemetns
    ✅ Automaticaly Sorted
 */
public class TreeSetJava {
    static void main(String[] args) {
        TreeSet <String> names = new TreeSet<>();

        // Insertion
        names.add("Riyansh");
        names.add("Ayush");
        names.add("Anishk");
        names.add("Riyansh");

        System.out.println(names);

        // method first -> return smallest element
        System.out.println(names.first());

        // method last() -> return last element
        System.out.println(names.last());

        // method contains() -> check whether element exists
        System.out.println(names.contains("Ayush"));

        /*
        real example :
            suppose you want to display all cities in alphabetical
            order
         slower than HashSet bcz maintains sorting
         */
    }
}
