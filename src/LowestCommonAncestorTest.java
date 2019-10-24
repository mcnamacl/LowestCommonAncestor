import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LowestCommonAncestorTest {

    @Test
    public void testCreateAndAddNodeDAG() {
        int noVertices = 3;
        LowestCommonAncestor dag = new LowestCommonAncestor();
        for (int i = 0; i < noVertices; i++){
            dag.dag.addVertex(i);
        }
        dag.dag.addEdge(0,1);
        dag.dag.addEdge(0,2);
        //      0
        //    /  \
        //   1    2
    }

    @Test
    public void testLCANormal(){
        int noVertices = 5;
        LowestCommonAncestor dag = new LowestCommonAncestor();
        for (int i = 0; i < noVertices; i++){
            dag.dag.addVertex(i);
        }
        dag.dag.addEdge(0,1);
        dag.dag.addEdge(0,2);
        dag.dag.addEdge(1,3);
        dag.dag.addEdge(2,3);
        dag.dag.addEdge(1,4);
        //          0
        //        /  \
        //      1     2
        //    /  \   /
        //   4     3
        dag.LCA(4,3);
//        int lcaNode;
//        assertEquals("The lowest common ancestor should be 0.", 0, lcaNode);
//
//        assertEquals("The lowest common ancestor should be 1.", 1, lcaNode);
//
//        assertEquals("The lowest common ancestor should be 1.", 1, lcaNode);
    }

    @Test
    public void testLCALarge(){
        int noVertices = 10;
        LowestCommonAncestor dag = new LowestCommonAncestor();
        for (int i = 0; i < noVertices; i++){
            dag.dag.addVertex(i);
        }
        dag.dag.addEdge(0,1);
        dag.dag.addEdge(0,2);
        dag.dag.addEdge(1,3);
        dag.dag.addEdge(2,3);
        dag.dag.addEdge(1,4);
        dag.dag.addEdge(4,5);
        dag.dag.addEdge(4,6);
        dag.dag.addEdge(3,7);
        dag.dag.addEdge(2,8);
        dag.dag.addEdge(3,9);
        //          0
        //        /  \
        //      1     2
        //    /  \   / \
        //   4     3    8
        //  / \   / \
        // 5   6 9   7
        int lcaNode = dag.LCA(1, 2);
        assertEquals("The lowest common ancestor should be 0.", 0, lcaNode);
        lcaNode = dag.LCA(3, 4);
        assertEquals("The lowest common ancestor should be 1.", 1, lcaNode);
        lcaNode = dag.LCA(1, 3);
        assertEquals("The lowest common ancestor should be 1.", 1, lcaNode);
        lcaNode = dag.LCA(9, 2);
        assertEquals("The lowest common ancestor should be 2.", 2, lcaNode);
        lcaNode = dag.LCA(5, 6);
        assertEquals("The lowest common ancestor should be 4.", 4, lcaNode);
        lcaNode = dag.LCA(3, 8);
        assertEquals("The lowest common ancestor should be 2.", 2, lcaNode);
        lcaNode = dag.LCA(5, 7);
        assertEquals("The lowest common ancestor should be 1.", 1, lcaNode);
        lcaNode = dag.LCA(8, 5);
        assertEquals("The lowest common ancestor should be 0.", 0, lcaNode);
        lcaNode = dag.LCA(6, 9);
        assertEquals("The lowest common ancestor should be 1.", 1, lcaNode);
    }
//
//    @Test
//    public void testLCAEmptyDAG(){
//        int noVertices = 2;
//        LowestCommonAncestor dag = new LowestCommonAncestor();
//        int lcaNode = dag.LCA(1, 2);
//        assertEquals("The function should return -1 as there is no nodes present.", -1, lcaNode);
//    }
//
//    @Test
//    public void testCyclic(){
//        int noVertices = 3;
//        LowestCommonAncestor dag = new LowestCommonAncestor();
//        for (int i = 0; i < noVertices; i++){
//            dag.dag.addVertex(i);
//        }
//        dag.dag.addEdge(0,1);
//        dag.dag.addEdge(1,2);
//        //      0
//        //    /   \
//        //   1  -  2
//        assertThrows(IllegalArgumentException.class, () -> {
//            dag.dag.addEdge(2, 0);
//        }, "If an edge is added that will create a cycle, an IllegalArgumentException is thrown.");    }
//
//    @Test
//    public void testLCASameNode(){
//        int noVertices = 1;
//        LowestCommonAncestor dag = new LowestCommonAncestor();
//        for (int i = 0; i < noVertices; i++){
//            dag.dag.addVertex(i);
//        }
//        int lcaNode = dag.LCA(0, 0);
//        assertEquals("The function should return 0 as the LCA of the same node is itself.", 0, lcaNode);
//    }
//
//    @Test
//    public void testLCAOneNode(){
//        int noVertices = 1;
//        LowestCommonAncestor dag = new LowestCommonAncestor();
//        for (int i = 0; i < noVertices; i++){
//            dag.dag.addVertex(i);
//        }
//        int lcaNode = dag.LCA(0, 1);
//        assertEquals("The function should return -1 as there is only one node.", -1, lcaNode);
//    }
//
//    @Test
//    public void testLCAThreeNodes(){
//        int noVertices = 3;
//        LowestCommonAncestor dag = new LowestCommonAncestor();
//        for (int i = 0; i < noVertices; i++){
//            dag.dag.addVertex(i);
//        }
//        dag.dag.addEdge(0,1);
//        dag.dag.addEdge(0,2);
//        //      0
//        //    /  \
//        //  1     2
//        int lcaNode = dag.LCA(0, 1);
//        //assertEquals("The function should return 0 as that is the LCA of 0 and 1.", 0, lcaNode);
//        lcaNode = dag.LCA(1, 2);
//        assertEquals("The function should return 0 as that is the LCA of 1 and 2.", 0, lcaNode);
//    }
}