package hashing;

public class DirectChainingMain {
    public static void main(String[] args) {
        System.out.println("Starting Direct Chaining Hashing operations");

        System.out.println("Creating Hashtable");
        DirectChaining hashTable = new DirectChaining();

        System.out.println();

        System.out.println("Inserting element in hashtable");
        hashTable.insertIntoHashTable("abc");
        hashTable.insertIntoHashTable("cba");
        hashTable.insertIntoHashTable("bca");
        hashTable.insertIntoHashTable("cab");

        System.out.println();

        System.out.println("Searching for element in hashtable");
        hashTable.search("cab");
        hashTable.search("def");

        System.out.println();

        System.out.println("Deleting element from hashtable");
        hashTable.delete("bca");

        System.out.println();
        System.out.println("Checking if deleted element is present in hashtable");
        hashTable.search("bca");

        System.out.println();

        System.out.println("Delete hashtable");
        hashTable.deleteHashTable();
    }
}
