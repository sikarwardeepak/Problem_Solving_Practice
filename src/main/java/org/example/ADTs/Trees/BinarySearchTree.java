package org.example.ADTs.Trees;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
public class BinarySearchTree {

    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int key) {
        root = insertRecursive(root, key);
    }

    public Node insertRecursive(Node node, int key) {
        if (node == null) {
            return new Node(key);
        }

        if (key < node.data) {
            node.left = insertRecursive(node.left, key);
        } else if (key > node.data) {
            node.right = insertRecursive(node.right, key);
        }
        return node;
    }

    public boolean search(int key) {
        return searchRecursive(root, key) != null;
    }

    public Node searchRecursive(Node node, int key){
        if (node == null || node.data == key) {
            return node;
        }

        if (key < node.data) {
            return searchRecursive(node.left, key);
        } else {
            return searchRecursive(node.right, key);
        }
    }

    public void delete(int key) {
        root = deleteRecursive(root, key);
    }

    private Node deleteRecursive(Node node, int key) {
        if (node == null) {
            return null;
        }

        if (key < node.data) {
            node.left = deleteRecursive(node.left, key);
        } else if (key > node.data) {
            node.right = deleteRecursive(node.right, key);
        } else {
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }

            node.data = minValue(node.right);
            node.right = deleteRecursive(node.right, node.data);
        }
        return node;
    }

    private int minValue(Node node) {
        while (node.left != null) {
              node = node.left;
        }
        return node.data;
    }

    //traversals
    //inorder
    public void inorder() {
        inorderRecursive(root);
        System.out.println();
    }

    private void inorderRecursive(Node node) {
        if (node != null) {
            inorderRecursive(node.left);
            System.out.print(node.data + " ");
            inorderRecursive(node.right);
        }
    }

    //preorder
    public void preorder() {
        preorderRecursive(root);
        System.out.println();
    }

    private void preorderRecursive(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderRecursive(node.left);
            preorderRecursive(node.right);
        }
    }
    //postorder
    public void postorder() {
        postorderRecursive(root);
        System.out.println();
    }

    private void postorderRecursive(Node node) {
        if (node != null) {
            postorderRecursive(node.left);
            postorderRecursive(node.right);
            System.out.print(node.data + " ");
        }
    }
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);

        System.out.println(tree.search(3));

        System.out.println("Inorder traversal: ");
        tree.inorder();

        System.out.println("Preorder traversal: ");
        tree.preorder();

        System.out.println("Postorder traversal: ");
        tree.postorder();

        // Delete a key
        System.out.println("Deleting 7...");
        tree.delete(7);
        System.out.println("Inorder traversal after deletion:");
        tree.inorder();
    }
}
