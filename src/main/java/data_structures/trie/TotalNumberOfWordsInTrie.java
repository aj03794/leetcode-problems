package data_structures.trie;

import java.util.Arrays;

public class TotalNumberOfWordsInTrie {

    public static int totalWords(TrieNode root){
        int total = 0;

        if (root == null) {
            return total;
        }

        if (root.isEndWord) {
            total++;
        }

        for (int i = 0; i < root.children.length; i++) {
            total += totalWords(root.children[i]);
        }

        return total;
    }

    public static void main(String args[]){
        // Input keys (use only 'a' through 'z' and lower case)
        String[] keys = {"the", "a", "there", "answer", "any",
                "by", "bye", "their","abc"};

        System.out.println("Keys: "+ Arrays.toString(keys));

        // Construct trie
        Trie t = new Trie();

        for (int i = 0; i < keys.length ; i++)
            t.insert(keys[i]);

        System.out.println(totalWords(t.getRoot()));
    }
}
