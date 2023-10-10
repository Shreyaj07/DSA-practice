import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CycleDetectionInUndirectedGraph {
    public static void main(String[] args) {
        int n = 4; // Number of vertices
        List<List<Integer>> edges = new ArrayList<>();

        // Add edges to the graph
        edges.add(Arrays.asList(1, 2));
        edges.add(Arrays.asList(2, 3));
        edges.add(Arrays.asList(3, 4));
        edges.add(Arrays.asList(4,1));

        boolean hasCycle = hasCycle(n, edges);
        if (hasCycle) {
            System.out.println("The graph contains a cycle.");
        } else {
            System.out.println("The graph does not contain a cycle.");
        }
    }

    public static boolean hasCycle(int n, List<List<Integer>> edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adjList.add(new ArrayList<>());
        }

        // Create adjacency list from edges
        for (List<Integer> edge : edges) {
            int u = edge.get(0);
            int v = edge.get(1);
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        boolean[] visited = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                if (hasCycleDFS(i, -1, visited, adjList)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean hasCycleDFS(int vertex, int parent, boolean[] visited, List<List<Integer>> adjList) {
        visited[vertex] = true;
        for (int neighbor : adjList.get(vertex)) {
            if (!visited[neighbor]) {
                if (hasCycleDFS(neighbor, vertex, visited, adjList)) {
                    return true;
                }
            } else if (neighbor != parent) {
                return true;
            }
        }
        return false;
    }
}
