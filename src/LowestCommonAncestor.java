import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DirectedAcyclicGraph;

import java.util.Set;

public class LowestCommonAncestor {
    
    DirectedAcyclicGraph<Integer, DefaultEdge> dag;

    public LowestCommonAncestor() {
        this.dag = new DirectedAcyclicGraph<>(DefaultEdge.class);
    }

    int LCA(int v, int w) {
        Set<Integer> firstAncestors = dag.getAncestors(v);
        Set<Integer> secondAncestors = dag.getAncestors(w);
        return -1;
    }

    public int digraphVertexDepth(int root, int vertex) {
        return -1;
    }

    int digraphVertexDepthRecursive(int currentVertex, int targetVertex, int depth){
        return -1;
    }
}