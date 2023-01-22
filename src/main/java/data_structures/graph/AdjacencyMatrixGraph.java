package data_structures.graph;

public class AdjacencyMatrixGraph {

    int[][] matrix;

    public AdjacencyMatrixGraph(int[][] matrix) {
        this.matrix = matrix;
    }

    // Undirected
    public void addEdge(int row, int col) {
        matrix[row][col] = 1;
        matrix[col][row] = 1;
    }

    public void depthFirstTraversal(int start, boolean[] visited) {

        System.out.print(start + " ");
        visited[start] = true;

        for (int i = 0; i < matrix[start].length; i++) {
            if (matrix[start][i] == 1 && !visited[i]) {
                depthFirstTraversal(i, visited);
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 5;
//        int edges = 4;

        int[][] matrix = new int[vertices][vertices];

        AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(matrix);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);

        boolean[] visited = new boolean[vertices];

        graph.depthFirstTraversal(0, visited);
    }
}
