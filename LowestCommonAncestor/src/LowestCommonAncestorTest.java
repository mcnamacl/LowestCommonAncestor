import org.junit.Test;

import static org.junit.Assert.*;

public class LowestCommonAncestorTest {
    @Test
    public void testEmptyBST() {
        LowestCommonAncestor lca = new LowestCommonAncestor();
        Node testNode = lca.LCA(null, 0, 0);
        assertNull("An empty BST should always return null.", testNode);
        testNode = lca.LCA(new Node(3), 7, 9);
        assertNull("An empty BST should always return null.", testNode);
    }

    @Test
    public void testNodeIsNotPresent() {
        LowestCommonAncestor lca = new LowestCommonAncestor();
        Node root = null;
        int[] keys = { 15, 10, 20, 8, 12, 16, 25 };
        for (int key : keys) {
            root = lca.binaryTree.insert(root, key);
        }
        Node testNode = lca.LCA(root, 5, 20);
        assertNull("x Node does not exist.", testNode);
        testNode = lca.LCA(root, 15, 5);
        assertNull("y Node does not exist.", testNode);
    }

    @Test
    public void testLCAIsRoot() {
        LowestCommonAncestor lca = new LowestCommonAncestor();
        Node root = null;
        int[] keys = { 15, 10, 20, 8, 12, 16, 25 };
        for (int key : keys) {
            root = lca.binaryTree.insert(root, key);
        }
        Node testNode = lca.LCA(root, 8, 20);
        assertEquals("Lowest Common Ancestor is the root node.", 15, testNode.data);
    }

    @Test
    public void testLCAIdeal() {
        LowestCommonAncestor lca = new LowestCommonAncestor();
        Node root = null;
        int[] keys = { 15, 10, 20, 8, 12, 16, 25 };
        for (int key : keys) {
            root = lca.binaryTree.insert(root, key);
        }
        Node testNode = lca.LCA(root, 8, 12);
        assertEquals("Lowest Common Ancestor in left subtree.", 10, testNode.data);
        testNode = lca.LCA(root, 16, 25);
        assertEquals("Lowest Common Ancestor in right subtree.", 20, testNode.data);
    }

    @Test
    public void testRightBST() {
        LowestCommonAncestor lca = new LowestCommonAncestor();
        Node root = null;
        int[] keys = { 20, 15, 10, 5 };
        for (int key : keys) {
            root = lca.binaryTree.insert(root, key);
        }
        Node testNode = lca.LCA(root, 5, 10);
        assertEquals("Lowest Common Ancestor in right BST.", 10, testNode.data);
    }

    @Test
    public void testLeftBST(){
        LowestCommonAncestor lca = new LowestCommonAncestor();
        Node root = null;
        int[] keys = { 5, 10, 15, 20 };
        for (int key : keys) {
            root = lca.binaryTree.insert(root, key);
        }
        Node testNode = lca.LCA(root, 5, 10);
        assertEquals("Lowest Common Ancestor in left BST.", 5, testNode.data);
    }
}