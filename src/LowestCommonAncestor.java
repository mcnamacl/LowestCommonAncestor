import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DirectedAcyclicGraph;

import java.util.Set;

public class LowestCommonAncestor {

    DirectedAcyclicGraph<Integer, DefaultEdge> dag;

    public LowestCommonAncestor() {
        this.dag = new DirectedAcyclicGraph<>(DefaultEdge.class);
    }

    int LCA(int v, int w) {
        Set<Integer> vAncestorSet = dag.getAncestors(v);
        Set<Integer> wAncestorSet = dag.getAncestors(w);

        int vAncestor[] = setToArray(vAncestorSet);
        int wAncestor[] = setToArray(wAncestorSet);
        
        return -1;
    }

    int[] setToArray(Set<Integer> set){
        int[] setArray = new int[set.size()];
        int index = 0;
        for (int vNode : set){
            setArray[index] = vNode;
            index++;
        }
        return setArray;
    }
}