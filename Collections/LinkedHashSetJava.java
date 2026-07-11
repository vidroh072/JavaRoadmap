package Collections;

import java.util.LinkedHashSet;

/*
 why LinkedHashSet invented ?
 we already have HashSet TreeSet
 Suppose users register in this order
 Riyasnh -> Ayush -> Anishk
 you store them in HashSet Day.output will be
    Unordered
  Now manager says show them in order they register.
  can HashSet guarantee that can TreeSet do that.
  -No TreeSet gives alphabetical order not register order

  Solution LinkedHashSet
    ✅ Unique elements
    ✅ Maintain insertion order


 */
public class LinkedHashSetJava {
    static void main(String[] args) {
        LinkedHashSet <String> names = new LinkedHashSet<>();

        // Insertion
        names.add("Riyansh");
        names.add("Anishk");
        names.add("Ayush");
        names.add("Riyansh");
        System.out.println(names);

        // method size()
        System.out.println(names.size());

        // method remove() -> remove element
        names.remove("Riyansh");

        // method contains()
        System.out.println(names.contains("Riyansh"));

        // HashSet
        // ✅ Unique
        // ❌ No guaranteed order
        // ⚡ Fastest for genral uniqueness

        // TreeSet
        // ✅ Unique
        // ✅ Sorted order

        // ✅ Unique
        // ✅ Insertion order



    }
}
