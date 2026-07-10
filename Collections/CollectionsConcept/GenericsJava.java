package Collections.CollectionsConcept;
/*
 let's imagine without Generics;
 You write
    ArrayList list = new ArrayList();
    list.add("Rahul");
    list.add(100);
    list.add(true);
 is this allowed ✅ (before Generics, it was)

 Now imagine later you write:
 String name = (String) list.get(1);
 what is index 1 ? --> 100
 can an integer become String ❌
 your program crashes with a runtime error.

 Java Solution : Generics
 Now we write:
    ArrayList <String> list = new ArrayList();
    - this array can store only String objects.
    now if you
    list.add(100); -> it will give compile time error

    What does <String> means ?
    ArrayList <String>  -> The type of element stored in collection is String
    ArrayList <Integer> -> store only Integer objects

    We are using Generics
    HashMap <Integer, String> map = new HashMap<>();
    Queue <String> q = new LinkedList<>();

    #why Generic usefull ?
    1. Type Safety
    - compile type prevents wrong data types.
    2. No Casting
    - without Generics
        Object obj = list.get(0);
        String name = (String) obj;
    - with Generics
        String name = list.get(0);
    3. Cleaner Code
    - code is easy to read and maintain

    // Generics allow us to specify the type of objects a class or collection
       can store, providing type safety and reducing runtime errors;

 */

public class GenericsJava {
}
