import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LowestCommonAncestorTest {

    @Test
    public void testCreateAndAddNodeDAG() {
        LowestCommonAncestor dag = new LowestCommonAncestor(3);
        dag.addEdge(0,1);
        dag.addEdge(0,2);
        ArrayList<Integer> nodes = new ArrayList<>();
        for(int pcrawl : dag.dag.adjListArray[0]) {
            nodes.add(pcrawl);
        }
        assertEquals("1 is adjacent to 0", 1, (int)nodes.get(0));
        assertEquals("2 is adjacent to 1", 2, (int)nodes.get(1));
    }

    @Test
    public void testLCANormal(){
    }

    @Test
    public void testLCARoot(){
    }

    @Test
    public void testLCAEmptyDAG(){
    }

    @Test
    public void testLCASameNode(){
    }
}