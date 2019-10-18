import java.util.LinkedList;

public class DAG {
    int V;
    LinkedList<Integer> adjListArray[];

    // constructor
    DAG(int V) {
        this.V = V;

        // define the size of array as
        // number of vertices
        adjListArray = new LinkedList[V];

        // Create a new list for each vertex
        // such that adjacent nodes can be stored
        for (int i = 0; i < V; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }
}

