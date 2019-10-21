import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LowestCommonAncestorTest {

    @Test
    public void testCreateAndAddNodeDAG() {
        LowestCommonAncestor dag = new LowestCommonAncestor(3);
        dag.addEdge(0,1);
        dag.addEdge(0,2);
        //      0
        //    /  \
        //   1    2
        ArrayList<Integer> nodes = new ArrayList<>();
        for(int pcrawl : dag.dag.adjListArray[0]) {
            nodes.add(pcrawl);
        }
        assertEquals("There is an edge between 0 and 1.", 1, (int)nodes.get(0));
        assertEquals("There is an edge between 0 and 2.", 2, (int)nodes.get(1));
    }

    @Test
    public void testLCANormal(){
        LowestCommonAncestor dag = new LowestCommonAncestor(5);
        dag.addEdge(0,1);
        dag.addEdge(0,2);
        dag.addEdge(1,3);
        dag.addEdge(2,3);
        dag.addEdge(1,4);
        //          0
        //        /  \
        //      1     2
        //    /  \   /
        //   4     3
        int lcaNode = dag.LCA(dag.dag, 1, 2);
        assertEquals("The lowest common ancestor should be 0.", 0, lcaNode);
        lcaNode = dag.LCA(dag.dag, 3, 4);
        assertEquals("The lowest common ancestor should be 1.", 1, lcaNode);
        lcaNode = dag.LCA(dag.dag, 1, 3);
        assertEquals("The lowest common ancestor should be 1.", 1, lcaNode);
    }

    @Test
    public void testLCALarge(){
        LowestCommonAncestor dag = new LowestCommonAncestor(10);
        dag.addEdge(0,1);
        dag.addEdge(0,2);
        dag.addEdge(1,3);
        dag.addEdge(2,3);
        dag.addEdge(1,4);
        dag.addEdge(4,5);
        dag.addEdge(4,6);
        dag.addEdge(3,7);
        dag.addEdge(2,8);
        dag.addEdge(3,9);
        //          0
        //        /  \
        //      1     2
        //    /  \   / \
        //   4     3    8
        //  / \   / \
        // 5   6 9   7
        int lcaNode = dag.LCA(dag.dag, 1, 2);
        assertEquals("The lowest common ancestor should be 0.", 0, lcaNode);
        lcaNode = dag.LCA(dag.dag, 3, 4);
        assertEquals("The lowest common ancestor should be 1.", 1, lcaNode);
        lcaNode = dag.LCA(dag.dag, 1, 3);
        assertEquals("The lowest common ancestor should be 1.", 1, lcaNode);
        lcaNode = dag.LCA(dag.dag, 9, 2);
        assertEquals("The lowest common ancestor should be 2.", 2, lcaNode);
        lcaNode = dag.LCA(dag.dag, 5, 6);
        assertEquals("The lowest common ancestor should be 4.", 4, lcaNode);
        lcaNode = dag.LCA(dag.dag, 3, 8);
        assertEquals("The lowest common ancestor should be 2.", 2, lcaNode);
        lcaNode = dag.LCA(dag.dag, 5, 7);
        assertEquals("The lowest common ancestor should be 1.", 1, lcaNode);
        lcaNode = dag.LCA(dag.dag, 8, 5);
        assertEquals("The lowest common ancestor should be 0.", 0, lcaNode);
        lcaNode = dag.LCA(dag.dag, 6, 9);
        assertEquals("The lowest common ancestor should be 1.", 1, lcaNode);
    }

    @Test
    public void testLCAEmptyDAG(){
        LowestCommonAncestor dag = new LowestCommonAncestor(5);
        int lcaNode = dag.LCA(dag.dag, 1, 2);
        assertEquals("The function should return -1 as there is no nodes present.", -1, lcaNode);
    }

    @Test
    public void testCyclic(){
        LowestCommonAncestor dag = new LowestCommonAncestor(5);
        dag.addEdge(0,1);
        dag.addEdge(1,2);
        dag.addEdge(2, 0);
        //      0
        //    /   \
        //   1  -  2
        int lcaNode = dag.LCA(dag.dag, 0, 1);
        assertEquals("The function should return -1 as the graph is cyclic and therefore invalid.", -1, lcaNode);
    }

    @Test
    public void testLCASameNode(){
        LowestCommonAncestor dag = new LowestCommonAncestor(1);
        int lcaNode = dag.LCA(dag.dag, 0, 0);
        assertEquals("The function should return 0 as the LCA of the same node is itself.", 0, lcaNode);
    }

    @Test
    public void testLCAOneNode(){
        LowestCommonAncestor dag = new LowestCommonAncestor(1);
        int lcaNode = dag.LCA(dag.dag, 0, 1);
        assertEquals("The function should return -1 as there is only one node.", -1, lcaNode);
    }

    @Test
    public void testLCAThreeNodes(){
        LowestCommonAncestor dag = new LowestCommonAncestor(3);
        dag.addEdge(0,1);
        dag.addEdge(0,2);
        //      0
        //    /  \
        //  1     2
        int lcaNode = dag.LCA(dag.dag, 0, 1);
        assertEquals("The function should return 0 as that is the LCA of 0 and 1.", 0, lcaNode);
        lcaNode = dag.LCA(dag.dag, 1, 2);
        assertEquals("The function should return 0 as that is the LCA of 1 and 2.", 0, lcaNode);
    }
}