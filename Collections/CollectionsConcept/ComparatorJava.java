package Collections.CollectionsConcept;
/*
 why Comparator invented ?
 Suppose you have Student class
 Sometimes you want to sort:
    * By marks
    * By name
    * By age
 can comparable do all three ❌
 A class can implement Comparable only once, so it can have only
 one natural sorting rule.

 Java Solution
 java create Comparator interface.
 A Comparator lets you create different sorting rules whenever you need them.

 Comparable
 One peramanent rule.
 Example:
    Students are always sorted by marks.

 Comparator
 Temporary rules
 Example:
    Today sort by name.
    Tomorrow sort by age.
    Next week by marks.

 Sort by name
 example:
    Collection.sort(Students,new NameComparator());
    Collection.sort(Students,new AgeComparator());
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class NameComparator implements Comparator <Student>{
    @Override
    public int compare(Student s1, Student s2){
        return s1.name.compareTo(s2.name);  // java send two object
    }

}class MarksComparator implements Comparator <Student>{
    @Override
    public int compare(Student s1, Student s2){
        return s1.marks - s2.marks;  // java send two object
    }

}
public class ComparatorJava {
    static void main(String[] args) {
        ArrayList <Student> students = new ArrayList<>();
        students.add(new Student("Riyansh",90));
        students.add(new Student("Ayush",70));
        students.add(new Student("Anishk",80));
        students.add(new Student("Aashish",800));
        Collections.sort(students,new NameComparator());
        Collections.sort(students,new MarksComparator());

        System.out.println(students);
    }
}
