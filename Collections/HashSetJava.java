package Collections;
// why HashSet invented ?
// ArrayList allows duplicates
// ["Riyasnh","Anishk","Ayush","Riyansh"]
// Solution Java Create HashSet
// A HashSet stores unique elements;
// ✅ unordered / Random
// ✅ No duplicate
import java.util.HashSet;

public class HashSetJava {
    static void main(String[] args) {
        HashSet <String> names = new HashSet<>();

        // Insertion element
        names.add("Riyansh");
        names.add("Anishk");
        names.add("Ayush");
        names.add("Riyansh");

        System.out.println(names);

        // Removing element
        names.remove("Riyansh");

        // method contains() -> if element exists
        System.out.println(names.contains("Ayush"));

        // method size()
        System.out.println(names.size());


    }
}
