import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        edges.add(new ArrayList<>(Arrays.asList(0, 1, 2)));
        edges.add(new ArrayList<>(Arrays.asList(0, 3, 6)));
        edges.add(new ArrayList<>(Arrays.asList(1, 3, 8)));
        edges.add(new ArrayList<>(Arrays.asList(1, 4, 5)));
        edges.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        edges.add(new ArrayList<>(Arrays.asList(2, 4, 7)));
        ArrayList<ArrayList<Integer>> mst = calculatePrimsMST(V, edges.size(), edges);
        for (ArrayList<Integer> edge : mst) {
            System.out.println(edge.get(0) + " - " + edge.get(1) + " : " + edge.get(2));
        }
    }

    public static ArrayList<ArrayList<Integer>> calculatePrimsMST(int n, int m, ArrayList<ArrayList<Integer>> g) {
        ArrayList<ArrayList<Edges>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int from = g.get(i).get(0);
            int to = g.get(i).get(1);
            int weight = g.get(i).get(2);
            adjList.get(to).add(new Edges(from, weight));
            adjList.get(from).add(new Edges(to, weight));
        }

        int[] key = new int[n];
        Arrays.fill(key, Integer.MAX_VALUE);
        boolean[] mst = new boolean[n];
        int[] parent = new int[n];
        Arrays.fill(parent, -1);

        // Start from vertex 0 as the root of MST
        key[0] = 0;

        for (int count = 0; count < n - 1; count++) {
            int u = minKey(key, mst);
            mst[u] = true;
            for (Edges edge : adjList.get(u)) {
                int v = edge.to;
                int weight = edge.weight;
                if (!mst[v] && weight < key[v]) {
                    parent[v] = u;
                    key[v] = weight;
                }
            }
        }

        // Reconstruct the MST as a list of edges
        ArrayList<ArrayList<Integer>> mstEdges = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            mstEdges.add(new ArrayList<>(Arrays.asList(parent[i], i, key[i])));
        }

        return mstEdges;
    }

    static class Edges {
        int to, weight;

        Edges(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    static int minKey(int[] key, boolean[] mst) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int v = 0; v < key.length; v++) {
            if (!mst[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }
        return minIndex;
    }
}
