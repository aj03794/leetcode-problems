package data_structures.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class AdjacencyListGraph {

    int vertices; // total number of vertices in graph
    LinkedList<Integer>[] adjacencyList; // Array of linked lists to store adjacent vertices

    public AdjacencyListGraph(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    // Prints graph
    void printGraph() {
        System.out.println(">>Adjacency List of Directed Graph<<");
        LinkedList<Integer>[] copy = adjacencyList.clone();
        for (int i = 0; i < vertices; i++) {
            if (copy[i] != null) {
                System.out.print("|" + i + "| => ");
                LinkedList<Integer> temp = copy[i];
                while (!temp.isEmpty()) {
                    System.out.print("[" + temp.poll() + "] -> ");
                }
                System.out.println("null");
            } else {
                System.out.println("|" + i + "| => "+ "null");
            }
        }
    };

    // Adds an edge from source vertex to edge vertex
    // NOTE THIS IS FOR A DIRECTED GRAPH RIGHT NOW
    // JUST HAVE TO UNCOMMENT LINE WITHIN METHOD TO MAKE IT UNDIRECTED
    void addEdge(int source, int destination) {
        if (source < vertices && destination < vertices) {
            this.adjacencyList[source].addLast(destination);

            // FOR UNDIRECTED GRAPH UNCOMMENT THE LINE BELOW
            // this.adjacencyList[destination.addLast(source)
        }
    }

    void deleteEdge(int source, int destination) {
        for (int i = 0; i < adjacencyList[source].size(); i++) {
            if (adjacencyList[source].get(i) == destination) {
                adjacencyList[source].remove(i);
                break;
            }
        }

        // If undirected graph, we would have to delete source at destination as well
//        for (int i = 0; i < adjacencyList[destination].size(); i++) {
//            if (adjacencyList[destination].get(i) == source) {
//                adjacencyList[destination].remove(i);
//                break;
//            }
//        }
    }

    public String breadthFirstTraversal(int s) {

        String result = "";

        boolean[] visited = new boolean[vertices];
        LinkedList<Integer> queue = new LinkedList<>();

        queue.add(s);
        visited[s] = true;

        while(!queue.isEmpty()) {
            s = queue.poll();
            System.out.print(s+" ");

            // Get all adjacent vertices of dequeued
            Iterator<Integer> itr = adjacencyList[s].listIterator();
            while (itr.hasNext()) {
                int n = itr.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }

        return result;
    }

    public void depthFirstTraversal(int v) {
        boolean[] visited = new boolean[vertices];

        DFSUtil(v, visited);
    }

    private void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        // Recurse for all vertices adjacent to this vertex
        Iterator<Integer> itr = adjacencyList[v].listIterator();
        while(itr.hasNext()) {
            int n = itr.next();
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }

    public static void main(String[] args) {
        AdjacencyListGraph graph = new AdjacencyListGraph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(1, 4);
        //>>Adjacency List of Directed Graph<<
        //                |0| => [1] -> [2] -> null
        //                |1| => [3] -> [4] -> null
        //                |2| => [3] -> null
        //                |3| => null
        //                |4| => null
//        graph.printGraph();
//        graph.deleteEdge(0, 2);
//         >>Adjacency List of Directed Graph<<
//                |0| => [1] -> null
//                |1| => [3] -> null
//                |2| => [3] -> null
//                |3| => null
//        graph.printGraph();
        graph.breadthFirstTraversal(0); // 0 1 2 3 4
        System.out.println();
        graph.depthFirstTraversal(0); // 0 1 3 4 2
    }

}
