package Collections.CollectionsConcept;

import java.util.ArrayList;
import java.util.Collections;

/*
 why was Comparable invented ?
 suppose you have numbers
    30
    10
    20
    Java already know how to sort them
 but suppose you have students objects:
    Riyansh (90)
    Anishk  (75)
    Ayush   (85)

    if you ask Java
        Collections.sort(students);
    Java ask:
    how should I sort them ?
    Java doesn't know

 Java Created Comparable Interface.
 it lets a class defining natural ordering.
 */
class Student implements Comparable<Student> {
    String name;
    int marks;
    Student(String name,int marks){
        this.name = name;
        this.marks = marks;
    }
    @Override
    public int compareTo(Student other){
        return this.marks - other.marks;
    }
    @Override
    public String toString(){   // we can use this. also
        return name +" : " + marks;
    }
}
public class ComparableJava {
    static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Riyansh", 90));
        students.add(new Student("Ayush", 70));
        students.add(new Student("Anishk", 80));

        System.out.println("Before sorting:");
        System.out.println(students);

        Collections.sort(students); // call compareTo(Collections.CollectionsConcept.Student other)
        System.out.println("After Sorting:");
        System.out.println(students);

    }
}

