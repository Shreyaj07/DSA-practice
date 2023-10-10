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
        boolean[] visited = new boolean[n];
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        visited[0] = true;
        while (!q.isEmpty()) {
            int vertex = q.poll();
            ans.add(vertex);
            for (int neighbour : adj.get(vertex)) {
                if (!visited[neighbour]) {
                    q.offer(neighbour);
                    visited[neighbour] = true;
                }
            }
        }
        return ans;
    }

}
