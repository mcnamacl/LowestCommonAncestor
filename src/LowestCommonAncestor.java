import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DirectedAcyclicGraph;

public class LowestCommonAncestor {
    
    DirectedAcyclicGraph<Integer, DefaultEdge> dag;

    LowestCommonAncestor() {
        this.dag = new DirectedAcyclicGraph<>(DefaultEdge.class);
    }

    int LCA(int num, int nodeOne, int nodeTwo){
        return -1 ;
    }
}