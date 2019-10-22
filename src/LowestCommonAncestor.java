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
        for(int i = 0 ; i < dag.adjListArray[node].size() ; i++){
            if(dag.adjListArray[node].get(i) != par){
                parent[dag.adjListArray[node].get(i)] = node ;
                System.out.println("node: " + node);
                GetParents(dag.adjListArray[node].get(i), node) ;
            }
        }
        for (int i = 0; i < parent.length; i++){
            System.out.println(parent[i]);
        }
    }

    int LCA(int num, int nodeOne, int nodeTwo){
        return -1 ;
    }
}