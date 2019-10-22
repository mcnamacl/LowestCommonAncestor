public class LowestCommonAncestor {

    DAG dag;
    int parent[];
    boolean visited[];
    int noVertices;

    LowestCommonAncestor(int noVertices) {
        this.dag = new DAG(noVertices);
        this.noVertices = noVertices;
        this.parent = new int[noVertices];
        this.visited = new boolean[noVertices];
    }

    // Adds an edge to an directed graph
    void addEdge(int src, int dest) {
        // Add an edge from src to dest.
        dag.adjListArray[src].add(dest);
    }

    void GetParents(int node , int par){
        for(int i = 0 ; i < dag.adjListArray[node].size() ; ++i){
            if(dag.adjListArray[node].get(i) != par){
                parent[dag.adjListArray[node].get(i)] = node ;
                GetParents(dag.adjListArray[node].get(i), node) ;
            }
        }
    }

    int LCA(DAG dag, int nodeOne, int nodeTwo){
        return -1;
    }
}