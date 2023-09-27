import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int[][] edges = {{1,2},{2,3},{1,3}};
        System.out.println(cycleDetection(edges,3,3));
        int[][] edges1 = {{1,2},{2,3}};
        System.out.println(cycleDetection(edges1,3,2));
    }
    public static String cycleDetection(int[][] edges, int n, int m) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        boolean[] visited = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            if (!visited[i] && hasCycle(i, -1, visited, adjList)) {
                return "Yes";
            }
        }
        return "No";
    }
   static boolean hasCycle(int v, int parent, boolean[] visited, List<List<Integer>> adj) {
        visited[v] = true;
        for (int neighbor : adj.get(v)) {
            if (!visited[neighbor]) {
                if (hasCycle(neighbor, v, visited, adj)) {
                    return true;
                }
            } else if (parent != neighbor) {
                return true;
            }
        }
        return false;
    }
}






