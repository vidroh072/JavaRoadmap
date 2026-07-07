package Collections;

import java.util.ArrayList;
public class ArrayListJava {
    // Most used collection *
    // Automaticaly grows when needed

    public static void main(String[] args) {
        
        // class ArrayList  <datatype>
        // Indexing     0   1   2   3
        ArrayList<String> students = new ArrayList<>();
        students.add("Rajesh"); 
        students.add("Anishk"); 
        students.add("Ayush");

        // accessing element
        // why arraylist use get() and array [] bcz arraylist is class
        // so it provide methods
        System.out.println(students.get(1));

        // updating elements
        students.set(0, "Riyansh");

        // removing elements
        System.out.println(students.size());

        // looping
        for (int i = 0; i < students.size(); i++) {
                System.out.println(students.get(i));            
        }
        // use = suppose you dont know how many students are there

        // internaly = ArrayList uses an array
        // when it become full 
        // 1. Java create a larger array
        // 2. Copies the old elements
        // 3. Adds the new element
        // 4. Discard the old array

        // pros:
        // - fast for reading
        // cons:
        // - slow for Insetion & Deletion at the beginning.
        //      # bcz all subsequent elements must be shifted
        //        to maintain continuous indexing.
    }
}
