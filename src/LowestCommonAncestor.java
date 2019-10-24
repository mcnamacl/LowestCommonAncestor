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

        int vlength = vAncestor.length - 1;
        int wlength = wAncestor.length - 1;

        int lcaNode = -1;

        for (int i = vlength; i >= 0; i--){
            for (int j = wlength; j >= 0; j--){
                System.out.println("v: " + vAncestor[i] + " w: " + wAncestor[j]);
                if (vAncestor[i] == wAncestor[j]){
                    lcaNode = vAncestor[i];
                }
            }
        }

        return lcaNode;
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