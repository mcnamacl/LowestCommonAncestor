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

        int vAncestor[] = setToArray(vAncestorSet, v);
        int wAncestor[] = setToArray(wAncestorSet, w);

        int vlength = vAncestor.length - 1;
        int wlength = wAncestor.length - 1;

        int lcaNode = -1;

        for (int i = vlength; i >= 0; i--){
            for (int j = wlength; j >= 0; j--){
                if (vAncestor[i] == wAncestor[j]){
                    return vAncestor[i];
                }
            }
        }
        return lcaNode;
    }

    int[] setToArray(Set<Integer> set, int num){
        int[] setArray = new int[set.size()+1];
        int index = 0;
        for (int vNode : set){
            setArray[index] = vNode;
            index++;
        }
        setArray[index] = num;
        return setArray;
    }
}