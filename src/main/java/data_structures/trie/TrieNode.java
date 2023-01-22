package data_structures.trie;

public class TrieNode {

    static final int ALPHABET_SIZE = 26;

    TrieNode[] children;
    boolean isEndWord; // will be true if the node represents the end of the word

    public TrieNode() {
        this.isEndWord = false;
        this.children = new TrieNode[ALPHABET_SIZE];
    }

    public void markAsLeaf() {
        this.isEndWord = true;
    }

    public void unMarkAsLeaf() {
        this.isEndWord = false;
    }

}
