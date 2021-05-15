package hashing;

import java.util.LinkedList;

public class DirectChaining {

    private LinkedList<String>[] hashtable;

    public DirectChaining() {
        this.hashtable = new LinkedList[15];
    }

    private int asciiHashFunction(String word, int M) {
        int sum, idx;
        for (sum = 0, idx = 0; idx < word.length(); idx++) {
            sum = sum + word.charAt(idx);
        }

        return sum % M;
    }

    public void insertIntoHashTable(String word) {
        int index = asciiHashFunction(word, hashtable.length);

        if (hashtable[index] == null) {
            System.out.println("No element present at index = " + index + " Inserting new element");
            hashtable[index] = new LinkedList<>();
            hashtable[index].add(word);
            System.out.println("Word " + word + " inserted at index " + index);
        } else {
            System.out.println("Element already present at index = " + index + " Inserting new element");
            hashtable[index].add(word);
            System.out.println("Word " + word + " inserted at index " + index);
        }
    }

    public void search(String word) {
        int index = asciiHashFunction(word, hashtable.length);

        if (hashtable[index] != null && hashtable[index].contains(word)) {
            System.out.println("Element present at index = " + index);
        } else {
            System.out.println("No element present at index");
        }
    }

    public void delete(String word) {
        int index = asciiHashFunction(word, hashtable.length);

        if (hashtable[index] != null && hashtable[index].contains(word)) {
            System.out.println("Element present at index = " + index + ". Deleting the element now");
            hashtable[index].remove(word);
        } else {
            System.out.println("No element present at index");
        }
    }

    public void deleteHashTable() {
        hashtable = null;
        System.out.println("Deleted Hashtable");
    }


}
