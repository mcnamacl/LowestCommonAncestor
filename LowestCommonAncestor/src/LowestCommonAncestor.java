public class LowestCommonAncestor {

    BST binaryTree;

    LowestCommonAncestor(){
        this.binaryTree = new BST();
    }

    // Recursive function to find Lowest Common Ancestor of given nodes
    // x and y where both x and y are present in the Binary Search Tree
    public Node LCARecursive(Node root, int x, int y)
    {
        // if both x and y is smaller than root, LCA exists in left subtree
        if (root.data > Integer.max(x, y)) {
            return LCARecursive(root.left, x, y);
        }

        // if both x and y is greater than root, LCA exists in right subtree
        else  if (root.data < Integer.min(x, y)) {
            return LCARecursive(root.right, x, y);
        }

        // if one key is greater (or equal) than root and one key is smaller
        // (or equal) than root, then the current node is LCA
        return root;
    }

    // Print Lowest Common Ancestor of two nodes in a BST
    public Node LCA(Node root, int x, int y)
    {
        // return if tree is empty or either x or y is not present
        // in the tree
        if (root == null || !binaryTree.search(root, x) || !binaryTree.search(root, y)) {
            return null;
        }

        // lca stores lowest common ancestor of x and y
        return LCARecursive(root, x, y);
    }
}
