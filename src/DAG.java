import java.util.ArrayList;

public class DAG {
    int V;
    ArrayList<Integer> adjListArray[];

    // constructor
    DAG(int V) {
        this.V = V;

        // define the size of array as
        // number of vertices
        adjListArray = new ArrayList[V];

        // Create a new list for each vertex
        // such that adjacent nodes can be stored
        for (int i = 0; i < V; i++) {
            adjListArray[i] = new ArrayList<>();
        }
    }

    // Adds an edge to an directed graph
    void addEdge(int src, int dest) {
        // Add an edge from src to dest.
        adjListArray[src].add(dest);
    }
}

