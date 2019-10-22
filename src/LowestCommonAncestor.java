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

    void GetParents(int node , int par){

    }

    int LCA(int num, int nodeOne, int nodeTwo){
        return -1 ;
    }
}