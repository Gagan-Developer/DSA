package hashtable;

import java.util.*;

public class HashTableOperations {
    public static void main(String[] args) {

        Hashtable<Integer, String> table = new Hashtable<>();

        System.out.println("Perform Insert operations");
        table.put(1, "Gagan");
        table.put(2, "Rahul");
        table.put(3, "Lilly");


        System.out.println("Print current Hashtable");
        System.out.println(table);

        System.out.println("Modify existing value");
        table.put(2, "Ganesh");

        System.out.println("Print current Hashtable");
        System.out.println(table);


        System.out.println("Delete an existing element");
        table.remove(3);

        System.out.println("Print current Hashtable");
        System.out.println(table);

    }
}
