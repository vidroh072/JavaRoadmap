package Collections;

import java.util.LinkedHashMap;

/*
 Why LinkedHashMap invented ?
 we already know HashMap
 so why another one ?

 Problem:
 Suppose your manager add buses in order
    101 - Indore Express
    102 - Jaipur Express
    102 - Ratlam Express

 using HashMap
 the order is not guaranted ❌
 but manager said show in same order they added ?

 Java Solution : LinkedHashMap
    ✅ Key -> value pairs
    ✅ Maintains insertion order
 */
public class LinkedHashMapJava {
    static void main(String[] args) {
        LinkedHashMap <Integer,String> buses = new LinkedHashMap<>();

        // insertion data
        buses.put(101,"Indore Express");
        buses.put(102,"Jaipur Express");
        buses.put(103,"Ratlam Express");
        System.out.println(buses);

        // put() -> updating key, insetion oder is same
        buses.put(102,"Ujjain Express");

        System.out.println(buses);

        // method get() -> get value from key
        System.out.println(buses.get(102));

        // method containsKey()
        System.out.println(buses.containsKey(102));

        // method remove() -> remove entry
        buses.remove(102);
        System.out.println(buses);

        // Real Project example
        // display same order, LinkedHashMap is great choice.

        // less fast bcz maintained order

        // almost all Java Collection store object not primitive data type
        // so we use Integer rather than int
        // bcz int -> primitive datatype
        // Integer -> object (wrapper class)
        // Topic wrapper clas -> later
        // Remember
        //      Primitive            Wrapper Class
        //         int                  Integer
        //        double                 Double
        //         char                 Character
        //        boolean                Boolean
        //        String                 String
        

    }

}
