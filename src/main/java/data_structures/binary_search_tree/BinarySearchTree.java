package data_structures.binary_search_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree {

    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node search(int value) {
        if (root == null) return null;

        Node current = this.root;

        while (current != null) {
            if (current.value == value) return current;

            if (current.value > value) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
        }

        System.out.println(value + " not found in tree");

        return null;
    }

    public void preOrderTraversal(Node root) {
        if (root == null) return;

        System.out.println(root.value + " ");
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }

    /*
    * Visit left, right, root
     */
    public void postOrderTraversal(Node root) {
        if (root == null) return;

        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.println(root.value + " ");

    }

    public void levelOrderTraversal(Node root) {

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        List<Integer> result = new ArrayList<>();

        while(!queue.isEmpty()) {
            Node node = queue.poll();
            result.add(node.value);
            if (node.leftChild != null) {
                queue.add(node.leftChild);
            }
            if (node.rightChild != null) {
                queue.add(node.rightChild);
            }
        }

        System.out.println("Level order traversal: " + result);
    }

    /*
    * Visit left, right, and then root
     */
    public void inorderTraversal(Node root) {
        if (root == null) {
            return;
        }

        inorderTraversal(root.leftChild);
        System.out.println(root.value + " ");
        inorderTraversal(root.rightChild);
    }

    public void add(int value) {
        root = addRecursively(this.root, value);
    }

    /*
    * 1) Start from root node
    * 2) Check if value is greater than root/current node value
    * 3) If yes, then traverse the right subtree
    * Otherwise, if the value is less than or equal to the current node value,
    * traverse its left subtree
    * 4) Repeat steps two and 3 until you find a leaf node, then insert the data
    * and connect the new node with the leaf code, which will become
    * the parent of that new node
     */
    private Node addRecursively(Node currentNode, int value) {
        if (currentNode == null) {
            return new Node(value);
        }

        if (value < currentNode.value) {
            currentNode.leftChild = addRecursively(currentNode.leftChild, value);
        } else if (value > currentNode.value) {
            currentNode.rightChild = addRecursively(currentNode.rightChild, value);
        } else {
            // value already exists
            return currentNode;
        }

        return currentNode;
    }

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.add(6);
        binarySearchTree.add(4);
        binarySearchTree.add(9);
        binarySearchTree.add(5);
        binarySearchTree.add(2);
        binarySearchTree.add(8);
        binarySearchTree.add(12);

        binarySearchTree.inorderTraversal(binarySearchTree.getRoot());
        System.out.println("-------------");
        binarySearchTree.postOrderTraversal(binarySearchTree.getRoot());
        System.out.println("-------------");
        binarySearchTree.preOrderTraversal(binarySearchTree.getRoot());
//        binarySearchTree.levelOrderTraversal(binarySearchTree.getRoot());
//        System.out.println(binarySearchTree.search(12).value);
    }

}
