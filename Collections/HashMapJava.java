package Collections;

import java.util.HashMap;

/* why HashMap was invented.
 Suppose you store passengers in an ArrayList.
 ["Riyansh","Anishk","Ayush"]
 "Find Rahul's mobile number."
 An ArrayList only stores values.
 Index 0 → Riyansh
       1 → Anishk
       2 → Ayush
 Where is Rahul's mobile number?
 One Solution (But Bad)

 #You could create another ArrayList.
 Example:       names and mobile are two ArrayList.
    names                 mobiles
    Riyansh        ----->   98xxxxxxxx
    Anishk         ----->   91xxxxxxxx
    Ayush          ----->   99xxxxxxxx
    Question:
 What if Rahul is deleted from names but not from mobiles?
 😵 Everything becomes mismatched.

 #Java's Solution
 Java created HashMap. A HashMap stores data as:
    ✅ Key → Value
    Riyansh  → 98xxxxxxxx
    Anishk   → 91xxxxxxxx
    Ayush    → 99xxxxxxxx
*/
public class HashMapJava {
    static void main(String[] args) {
        HashMap<String,String> contacts = new HashMap<>();
        // Key = String, Value = String

        // method put() -> insert data
        contacts.put("Riyansh","98xxxxxxxx");
        contacts.put("Anishk","91xxxxxxxx");
        contacts.put("Ayush","99xxxxxxxx");
        System.out.println(contacts);

        // method get() -> accessing data
        System.out.println(contacts.get("Riyansh"));

        // method put() -> updating data old value replaced
        contacts.put("Riyansh", "92xxxxxxxx");

        // method remove() -> removing data
        contacts.remove("Riyansh");

        // method containsKey() -> if a Key Exists
        System.out.println(contacts.containsKey("Riyansh"));

        // method containsValue() -> if a Value Exists
        System.out.println(contacts.containsValue("99xxxxxxxx"));

    }
}
/*
 Internal Working of HashMap
 How does Java find numbers very quickly ?
 Does it check every entry one by one
 if Java searched one by one, it would be very slow.

 Step1: HashCode
 Every object Java can produce a number called HashCode
 Example: (not actual values)
    Riyansh  → 98xxxxxxxx
    Anishk   → 91xxxxxxxx
    Ayush    → 99xxxxxxxx
    HashCode as a unique-ish fingerprint that Java uses to decide
    where to store data.

 Step2: Buckets
    Imagine HashMap as a cupboard with many lockers
    Buckets 0
    Buckets 1
    Buckets 2
    ...
    When we do put("Riyansh","98xxxxxxxx")
    Java
    1. Calculates Riyansh hash code.
    2. Uses that numbers to decide a bucket.
    3. Stores the key-value pair in that bucket

    When we do get("Riyansh")
    Java does not search every bucket.
    Instead it:
    1. Calculate Riyansh hash code again.
    2. Finds the same bucket.
    3. Looks there.
    thats's why HashMap is actualy very fast.

 Why is it O(1) ?
    think of library
    Without HashMap -> You have to check every shelf.
     Shelf 1
     Shelf 2
     ...
     Shelf 100       slow

    with HashMap -> Someone tells you
    - your book is ion Shelf 44
    - you go directly there -> Fast

 But here's the big question...
    what if two keys go to the same bucket ?
        Riyansh -> bucket 3
        Anishk  -> bucket 3
    what now ?
        will one overwrite the other, ❌ NO
        this situation is called collision
    Collision:
        A collision happens when two different keys are assigned to the
        same bucket.
        HashMap handels this by storing both entries in that bucket.
        Bucket 3
        Riyansh -> 98xxxxxxxx
                   ↓
        Anishk  -> 91xxxxxxxx

       How does get() work after a collision?
       Java:
       1. Finds Bucket 3.
       2. Checks the first key.
       3. If it matches, returns the value.
       4. If not, checks the next entry in that bucket.
       It compares keys, not just bucket positions.

 What is a hash code?
    A number generated from an object that helps determine where it should
    be stored in a HashMap.
 What is a bucket?
    A storage location inside a HashMap where key-value pairs are placed.

 HashMap
    Bucket 0 → Empty
    Bucket 1 → Ayush → 99xxxxxxxx
    Bucket 2 → Empty
    Bucket 3 → Riyansh → 98xxxxxxxx
                 ↓
               Anishk → 91xxxxxxxx
    Bucket 4 → xyz → 7777
 */
