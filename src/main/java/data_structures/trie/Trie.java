package data_structures.trie;

import java.util.Arrays;

/*
Time Complexity = O(d^h) => for each node, we traverse all it's children if they exist
So, if we have a word like "the" => we traverse all 26 letters for **the**, all 26 letters for h, all 26 letters for e
d is constant at 26
h is variable => h is the longest word in the dictionary (which causes the deepest part of the Trie)
 */
public class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public TrieNode getRoot() {
        return root;
    }

    public int getIndex(char t) {
        return t - 'a';
    }

    public void insert(String key) {
        if (key == null) {
            System.out.println("Null key cannot be inserted");
            return;
        }

        key = key.toLowerCase();
        TrieNode currentNode = this.root;
        int index = 0;

        // Iterate the Trie with given character index,
        // If it is null, then simply create a TrieNode and go down a level
        // Each TrieNode has 26 possible child TreeNodes
        for (int level = 0; level < key.length(); level++) {
            // Getting the index of where this key should be in the TrieNodes children array
            index = getIndex(key.charAt(level));
            if (currentNode.children[index] == null) {
                currentNode.children[index] = new TrieNode();
            }
            currentNode = currentNode.children[index];
        }

        currentNode.markAsLeaf();

    }

    public boolean search(String key) {
        if (key == null) return false;

        key = key.toLowerCase();
        TrieNode currentNode = this.root;
        int index = 0;

        // Iterate the Trie with given character index
        // If it is null at any point then we stop and return false
        // We will only return true IF we reach leafNode AND have traversed the
        // Trie based on the length of the key
        for (int level = 0; level < key.length(); level++) {
            index = getIndex(key.charAt(level));
            if (currentNode.children[index] == null) return false;
            currentNode = currentNode.children[index];
        }

        return currentNode.isEndWord;
    }

    public void delete(String key) {
        if (root == null || key == null) {
            System.out.println("Null key or Empty trie error");
            return;
        }
        deleteHelper(key, root, key.length(), 0);
    }

    private boolean deleteHelper(String key, TrieNode currentNode, int length, int level) {

        boolean deletedSelf = false;

        if (currentNode == null) {
            System.out.println("Key does not exist");
            return deletedSelf;
        }

        // Base case: We've reached the last letter in the given key
        if (level == length) {
            // If there are no nodes ahead of this node in this path
            // then we can delete this node
            if (hasNoChildren(currentNode)) {
                currentNode = null;
                deletedSelf = true;
            }
            // If there are nodes ahead of currentNode in this path, then we cannot delete currentNode
            // we simply unmark this as a leaf
            else {
                currentNode.unMarkAsLeaf();
            }
        } else {
            TrieNode childNode = currentNode.children[getIndex(key.charAt(level))];
            boolean childDeleted = deleteHelper(key, childNode, length, level + 1);
            if (childDeleted) {
                // Making children pointer also null, since child is deleted
                currentNode.children[getIndex(key.charAt(level))] = null;

                // If currentNode is a leaf node, that means currentNode is part of another key
                // and therefore, we cannot delete this node and it's parent path nodes
                if (currentNode.isEndWord) {
                    deletedSelf = false;
                }
                // If childNode is deleted but if currentNode has more children than current
                // must be part of another key
                else if (!hasNoChildren((currentNode))) {
                    deletedSelf = false;
                }
                else {
                    currentNode = null;
                    deletedSelf = true;
                }
            } else {
                deletedSelf = false;
            }
        }

        return deletedSelf;
    }

    private boolean hasNoChildren(TrieNode currentNode) {
        for (int i = 0; i < currentNode.children.length; i++) {
            if (currentNode.children[i] != null)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Input keys (use only 'a' through 'z' and lower case)
        String[] keys = {"the", "a", "there", "answer", "any",
                "by", "bye", "their","abc"};
        String[] output = {"Not present in trie", "Present in trie"};
        Trie t = new Trie();

        System.out.println("Keys: "+ Arrays.toString(keys));

        // Construct trie

        int i;
        for (i = 0; i < keys.length ; i++)
            t.insert(keys[i]);

        // Search for different keys
        if(t.search("the"))
            System.out.println("the --- " + output[1]);
        else System.out.println("the --- " + output[0]);

        if(t.search("these"))
            System.out.println("these --- " + output[1]);
        else System.out.println("these --- " + output[0]);

        if(t.search("abc"))
            System.out.println("abc --- " + output[1]);
        else System.out.println("abc --- " + output[0]);

        // Search for different keys and delete if found
        if(t.search("the"))
        {
            System.out.println("the --- " + output[1]);
            t.delete("the");
            System.out.println("Deleted key \"the\"");
        }
        else System.out.println("the --- " + output[0]);

        if(t.search("these"))
        {
            System.out.println("these --- " + output[1]);
            t.delete("these");
            System.out.println("Deleted key \"these\"");
        }
        else System.out.println("these --- " + output[0]);

        if(t.search("abc"))
        {
            System.out.println("abc --- " + output[1]);
            t.delete("abc");
            System.out.println("Deleted key \"abc\"");
        }
        else System.out.println("abc --- " + output[0]);

        // check if the string has deleted correctly or still present
        if(t.search("abc") == true)
            System.out.println("abc --- " + output[1]);
        else System.out.println("abc --- " + output[0]);
    }

}
