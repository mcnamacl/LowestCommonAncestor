public class LowestCommonAncestor {

    DAG dag;

    LowestCommonAncestor(int noVertices) {
        this.dag = new DAG(noVertices);
    }

    // Adds an edge to an undirected graph
    void addEdge(int src, int dest) {
        // Add an edge from src to dest.
        dag.adjListArray[src].add(dest);

        // Since graph is undirected, add an edge from dest
        // to src also
        dag.adjListArray[dest].add(src);
    }
}