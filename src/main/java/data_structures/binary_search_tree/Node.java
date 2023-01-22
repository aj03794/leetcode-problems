package data_structures.binary_search_tree;

class Node {

    //Variables
    public int value;
    public Node leftChild;
    public Node rightChild;

    //Constructor
    Node(int value){
        this.value = value;
        leftChild = null;
        rightChild = null;
    }
}
