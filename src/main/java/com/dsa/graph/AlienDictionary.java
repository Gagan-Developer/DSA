package graph;

import java.util.*;


public class AlienDictionary {
    public static void main(String[] args) {
        String[] words = {"wrt","wrf","er","ett","rftt"};
        int[] indegree = new int[26];
        String sequence = alienOrder(words, indegree);
        System.out.println(sequence);

    }

    private static String alienOrder(String[] words, int[] indegree) {
        Map<Character, Set<Character>> alphabetMap = new HashMap<>();
        buildDictionary(words, alphabetMap, indegree);

       return findSequence(alphabetMap, indegree);

    }


    private static void buildDictionary(String[] words, Map<Character, Set<Character>> alphabetMap, int[] indegree) {

        for (String word : words) {
            for (char c : word.toCharArray()) alphabetMap.put(c, new HashSet<>());
        }

        for (int i = 1; i < words.length; i++) {
            String firstWord = words[i - 1];
            String secondWord = words[i];

            int firstLen = firstWord.length();
            int secondLen = secondWord.length();

            int length = Math.min(firstWord.length(), secondWord.length());


            for (int j = 0; j < length; j++) {
                char c1 = firstWord.charAt(j);
                char c2 = secondWord.charAt(j);

                if (c1 != c2) {
                    if (!alphabetMap.get(c1).contains(c2)) {
                        alphabetMap.get(c1).add(c2);
                        indegree[c2 - 'a']++;
                    }
                    break;
                }
            } // inner for loop
        } //outer for loop
    } // Method end


    private static String findSequence(Map<Character, Set<Character>> alphabetMap, int[] indegree) {
        Queue<Character> independentChars = new LinkedList<>();

        for (Character c : alphabetMap.keySet()) {
            if (indegree[c - 'a'] == 0)
                independentChars.offer(c);
        }

        StringBuilder sb = new StringBuilder();
        while (!independentChars.isEmpty()) {
            char c = independentChars.poll();
            sb.append(c);

            for (char neighbour : alphabetMap.get(c)) {
                if (--indegree[neighbour - 'a'] == 0)
                    independentChars.offer(neighbour);

            }
        }
        return sb.toString();
    }


}

