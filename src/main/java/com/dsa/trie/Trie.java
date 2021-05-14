package trie;

import java.util.HashMap;
import java.util.Map;

public class Trie {

    private class TrieNode {
        Map<Character, TrieNode> children;
        boolean endOfWord;

        public TrieNode() {
            children = new HashMap<>();
            endOfWord = false;
        }
    }

    private TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;
        for (int idx = 0; idx < word.length(); idx++) {
            char ch = word.charAt(idx);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                node = new TrieNode();
                current.children.put(ch, node);
            }
            current = node;
        }

        current.endOfWord = true;
        System.out.println("Successfully inserted " + word + " in the trie");
    }

    public boolean search(String word) {
        TrieNode current = root;
        for (int idx = 0; idx < word.length(); idx++) {
            char ch = word.charAt(idx);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                System.out.println("Word " + word + " not available in the trie");
                return false;
            }
            current = node;
        }

        if (current.endOfWord) {
            System.out.println("word " + word + " found in Trie");
        } else {
            System.out.println("The word " + word + " is substring of another word in the trie");
        }
        return current.endOfWord;
    }

    public void delete(String word) {
        if (search(word)) {
            delete(word, root, 0);
        }

    }

    private boolean delete(String word, TrieNode parentNode, int index) {

        char ch = word.charAt(index);
        TrieNode currentNode = parentNode.children.get(ch);

        if (currentNode.children.size() > 1) { // multiple elements with same element prefix
            delete(word, currentNode, index + 1);
            return false;
        }

        if (index == word.length() - 1) {
            if (currentNode.children.size() >= 1) {
                currentNode.endOfWord = false;
                System.out.println("Deleted node from the Trie");
                return false;
            } else {
                System.out.println("Work " + word + " has no dependency. Hence, deleting the node");
                parentNode.children.remove(ch);
                System.out.println("Deleted the word");
                return true;
            }
        }


        if (currentNode.endOfWord == true) {
            System.out.println("Some other word is a prefix of this word");
            delete(word, parentNode, index + 1);
        }

        boolean canThisNodeBeDeleted = delete(word, currentNode, index + 1);
        if (canThisNodeBeDeleted) {
            System.out.println("Character " + ch + " has no dependency. This can be deleted");
            parentNode.children.remove(ch);
            return true;
        } else {
            System.out.println("Character " + ch + " had dependent words. Cant delete this word");
            return false;
        }
    }
}