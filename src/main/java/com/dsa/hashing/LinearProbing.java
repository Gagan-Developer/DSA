package hashing;

import java.util.ArrayList;
import java.util.List;

public class LinearProbing {

    private String[] hashtable;
    private int noOfCellsUsed;

    public LinearProbing() {
        this.hashtable = new String[15];
        this.noOfCellsUsed = 0;
    }

    public double getLoadFactor() {
        return noOfCellsUsed * 1.0 / hashtable.length;
    }

    private int asciiHashFunction(String word, int M) {
        int sum, idx;
        for (sum = 0, idx = 0; idx < word.length(); idx++) {
            sum = sum + word.charAt(idx);
        }
        return sum % M;
    }

    public void insertIntoHashTable(String word) {
        double loadFactor = getLoadFactor();
        if (loadFactor > 0.75) {
            System.out.println("Load factor has exceeded 0.75. Creating a new hashtable of double size");
            rehashKeys(word);
        } else {
            int index = asciiHashFunction(word, hashtable.length);
            if (hashtable[index] == null) {
                hashtable[index] = word;
            } else {
                for (int idx = index; idx < index + hashtable.length; idx++) {
                    int newIndex = idx % hashtable.length;
                    if (hashtable[newIndex] == null) {
                        hashtable[newIndex] = word;
                        break;
                    }
                }
            }
            System.out.println("Inserted the word " + word + " successfully");
        }
        noOfCellsUsed++;
    }

    private void rehashKeys(String word) {
        List<String> data = new ArrayList<>();
        for (String s : hashtable) {
            if(s != null)
                data.add(s);
        }
        data.add(word);
        hashtable = new String[hashtable.length * 2];
        noOfCellsUsed =0;
        for (String s : data) {
            insertIntoHashTable(s);
        }
    }

    public void search(String word) {
        int index = asciiHashFunction(word, hashtable.length);

        for (int idx = index; idx < index + hashtable.length; idx++) {
            int newIndex = idx % hashtable.length;
            if (hashtable[newIndex] != null && hashtable[index].equals(word)) {
                System.out.println("Word found in hashtable");
                return;
            }
        }
        System.out.println("Word not found in Hashtable");
    }

    public void deleteFromHashTable(String word) {
        int index = asciiHashFunction(word, hashtable.length);

        for (int idx = index; idx < index + hashtable.length; idx++) {
            int newIndex = idx % hashtable.length;
            if (hashtable[newIndex] != null && hashtable[index].equals(word)) {
                hashtable[index] = null;
                noOfCellsUsed--;
                System.out.println("Deleted word from Hashtable");
                return;
            }
        }
        System.out.println("Word not found in Hashtable");
    }

    public void delete() {
        hashtable = null;
        noOfCellsUsed = 0;
        System.out.println("Deleted Hashtable");
    }

    public void displayHashTable() {
        if(hashtable == null) {
            System.out.println("Hashtable does not exist");
        } else {
            for(String s : hashtable) {
                if(s != null)
                    System.out.print(s + " ");
            }
        }
    }

}
