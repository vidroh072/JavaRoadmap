package Collections;

import java.util.TreeMap;

/*
 Why TreeMap invented ?
 we already have
    - HashMap
    - LinkedHashMap

 Problem:
    103 -> Nagpur
    103 -> Mandsaur
    103 -> Ratlam
 using LinkedHashMap output will
    - Ordered inserted
    - Key -> value pair

 but what if your manager says
    show in ascending order;
 can LinkedHashMap or HashMap do that ❌

 Java Solution : TreeMap
    ✅ Key -> Value pairs
    ✅ Keys are automaticaly sorted
 */
public class TreeMapJava {
    static void main(String[] args) {

        TreeMap <Integer,String> buses = new TreeMap<>();

        // insertion data
        buses.put(103,"Ratlam");
        buses.put(101,"Indore");
        buses.put(102,"Mandsaur");

        System.out.println(buses);

        // updating data -> put()
        buses.put(101,"Ujjain");

        // accessing value
        System.out.println(buses.get(101));

        // method firstKey() -> Smallest key
        System.out.println(buses.firstKey());

        // method lastKey() -> Largest key
        System.out.println(buses.lastKey());

        // method remove() -> remove an entry
        buses.remove(101);

        // TreeMap
        // ✅ Key -> Value pair
        // ✅ Ascending order

        // slower than HashMap bcz it keep sorted whenever you insert or remove
    }
}
