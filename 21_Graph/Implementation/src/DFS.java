import java.util.*;

public class DFS {
    public static void main(String[] args) {
        int n = 6; //vertices
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(1).add(4);
        adj.get(2).add(5);
        System.out.println(adj);
        List<Integer> dfsResult = dfsTraversal(n, adj); // Corrected function name
        System.out.println("DFS traversal: " + dfsResult);
    }

    public static List<Integer> dfsTraversal(int n, List<List<Integer>> adj) { // Corrected function name
        boolean[] visited = new boolean[n];
        List<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        st.add(0);
        visited[0] = true;
        while (!st.isEmpty()) {
            int vertex = st.pop();
            ans.add(vertex);
            for (int neighbour : adj.get(vertex)) {
                if (!visited[neighbour]) {
                    st.push(neighbour);
                    visited[neighbour] = true;
                }
            }
        }
        return ans;
    }
}
