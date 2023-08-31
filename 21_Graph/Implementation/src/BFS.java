import java.sql.Array;
import java.util.*;

public class BFS {
    public static void main(String[] args) {
        int n = 5; //vertices
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(1).add(4);
        System.out.println(adj);
        List<Integer> bfsResult = bfsTraversal(n, adj);
        System.out.println("BFS traversal: " + bfsResult);
    }

    public static List<Integer> bfsTraversal(int n, List<List<Integer>> adj) {
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        boolean[] visited = new boolean[n];
        List<Integer> result = new ArrayList<>();
        prepareAdjList(adjList, adj, n);

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0); //starting from vertex 0
        visited[0] = true;

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            result.add(vertex);

            for (int neighbour : adjList.getOrDefault(vertex, new ArrayList<>())) {
                if (!visited[neighbour]) {
                    queue.offer(neighbour);
                    visited[neighbour] = true;
                }
            }
        }
        return result;
    }

    private static void prepareAdjList(Map<Integer, List<Integer>> adjList, List<List<Integer>> adj, int n) {
        for (int i = 0; i < n; i++) {
            adjList.put(i, adj.get(i));
        }
        System.out.println(adjList);
    }

}
