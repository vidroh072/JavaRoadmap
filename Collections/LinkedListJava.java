package Collections;

// problem with ArrayList
// - slow for Insetion & Deletion at the beginning.
//      # bcz all subsequent elements must be shifted
//        to maintain continuous indexing;
//  suppose there are 1 million elements ?
//      # than 1 million elements, almost all of them
//        may need to shift;
// solution = LINKEDLIST;

//  --------    
//  --------            --------
// |  Rahul |   ---->  |  Amit  |  ---->  | Rohan
// |  --- null          --------
//  --------
//  --------        Each box is called node.

// node has two parts
// ----------------------
// | Data | Next Address |    next Address = refrence link
// ----------------------                    next node

// ----------------------
// | Rahul | ------>    |   
// ----------------------      

// we simply move head refrence
// head = Amit  after head = Rahul

// problem:
//  - reading is slow;
//      bcz reading start at the head, it visit each node
//      to reach desired location.
//  - thats why list.get()  - is slower than ArrayList;

import java.util.LinkedList;
public class LinkedListJava {
    public static void main(String[] args) {
        LinkedList <String> students = new LinkedList<>();
        // Insertion -- fast
        students.add("Riyansh"); 
        students.add("Anishk"); 
        students.add("Ayush");
    

        // reading -- slow
        System.out.println(students.get(2));

        // update   -- slow
        // ArrayList faster = java can directly go to index
        // bcz element are stored in continous way! 
        students.set(2, "karn");

        // remove   -- fast
        students.remove(0);
        System.out.println(students);

        // size
        System.out.println(students.size());

        // method are same as ArrayList diffrence is
        // how they work internaly.

        // engine -> coach1 -> coach2 -> coach3
        // use more memory = bcz node store
        //                   - actual data
        //                   - refrence next node 
    }
    
}
