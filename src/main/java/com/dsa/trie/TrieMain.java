package trie;

public class TrieMain {
    public static void main(String[] args) {

        System.out.println("Starting Trie operations");

        System.out.println("Creating Trie");
        Trie trie = new Trie();

        System.out.println("---------------------");

        System.out.println("Inserting elements in Trie");
        trie.insert("air");
        trie.insert("airy");
        trie.insert("test");

        System.out.println("---------------------");

        System.out.println("Search word in Trie");
        trie.search("test");
        trie.search("abc");

        System.out.println("---------------------");

        System.out.println("Delete word from Trie");
        trie.delete("air");
    }
}
