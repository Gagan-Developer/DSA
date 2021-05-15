package hashing;

public class LinearProbingMain {
    public static void main(String[] args) {
        System.out.println("Starting Linear Probing Hashing operations");

        System.out.println("Creating a Hashtable");
        LinearProbing hashtable = new LinearProbing();

        System.out.println();

        System.out.println("Inserting element in hashtable");
        hashtable.insertIntoHashTable("a");
        hashtable.insertIntoHashTable("v");
        hashtable.insertIntoHashTable("s");
        hashtable.insertIntoHashTable("d");
        hashtable.insertIntoHashTable("awd");
        hashtable.insertIntoHashTable("d");
        hashtable.insertIntoHashTable("qa");
        hashtable.insertIntoHashTable("ddsff");
        hashtable.insertIntoHashTable("derwe");
        hashtable.insertIntoHashTable("asdfdd");
        hashtable.insertIntoHashTable("gfgdfd");
        hashtable.insertIntoHashTable("werfbvfd");
        hashtable.insertIntoHashTable("mjhd");
        hashtable.insertIntoHashTable("dasdacd");
        hashtable.insertIntoHashTable("fgfed");
        hashtable.insertIntoHashTable("wed");
        hashtable.insertIntoHashTable("wsd");
        hashtable.insertIntoHashTable("daf");


        System.out.println();

        System.out.println("Print Hashtable");
        hashtable.displayHashTable();

        System.out.println("");

        System.out.println("Search in Hashtable");
        hashtable.search("qa");
        hashtable.search("sde");

        System.out.println();

        System.out.println("Delete from Hashtable");
        hashtable.deleteFromHashTable("wed");

        System.out.println();

        System.out.println("Print Hashtable");
        hashtable.displayHashTable();

        System.out.println();

        System.out.println("Delete Hashtable");
        hashtable.delete();

    }
}
