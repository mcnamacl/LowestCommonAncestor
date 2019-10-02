// Data structure to store a Binary Search Tree node
class Node
{
    int data;
    Node left = null, right = null;

    Node(int data) {
        this.data = data;
    }
}

class BST {
    // Recursive function to insert an key into BST
    public static Node insert(Node root, int key) {
        // if the root is null, create a new node an return it
        if (root == null) {
            return new Node(key);
        }

        // if given key is less than the root node, recur for left subtree
        if (key < root.data) {
            root.left = insert(root.left, key);
        }

        // if given key is more than the root node, recur for right subtree
        else {
            root.right = insert(root.right, key);
        }

        return root;
    }

    // Iterative function to search a given key in root
    public static boolean search(Node root, int key) {
        // traverse the tree and search for the key
        while (root != null) {
            // if given key is less than the current node, go to left
            // subtree else go to right subtree

            if (key < root.data) {
                root = root.left;
            } else if (key > root.data) {
                root = root.right;
            }
            // if key is found return true
            else {
                return true;
            }
        }

        // we reach here if the key is not present in the BST
        return false;
    }
}
