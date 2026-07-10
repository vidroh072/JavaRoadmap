package Collections;

import java.util.Stack;

public class StackJava {
    // stack is linear data structure that follows the
    // LIFO principle.

    // LIFO = last in first out
    // Example undo
    // hello -> java -> world
    static void main(String[] args) {
        Stack <String> students = new Stack<>();

        // method push() -> insert element
        students.push("Riyansh");  // stack
        students.push("Anishk");   // Ayush - top
        students.push("Ayush");    // Anishk
                                       // Riyansh
        System.out.println(students);  // [,]

        // method pop() -> removes element
        System.out.println(students.pop()); // stack
                                            //  Anishk - top
                                            //  Ayush

        // method peek() -> return top element without removing
        System.out.println(students.peek());

        // method isEmpty() -> check stack
        if(students.isEmpty()){
            System.out.println("Stack is empty");
        }else System.out.println("Stack is filled");

        // method size() -> return no of elements
        System.out.println(students.size());
    }
    // internal working
    // push(java)     push(python)     pop()
    // top - > Java   top - > python   top-> Java
    //                        Java
    // ✅ Every operation happens only at top
    // That's why stack are efficient for LIFO

    // Real world example
    // Text Editor
    // Type a       every action is pushed in Stack
    // Type b       press undo - pop c
    // Type c       press again - pop b
}