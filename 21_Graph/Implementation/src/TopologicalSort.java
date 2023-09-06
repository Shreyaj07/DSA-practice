import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class TopologicalSort {
    public static void main(String[] args) {
        int v = 6;
        int e= 7;
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        edges.add(new ArrayList<>(List.of(1,2)));
        edges.add(new ArrayList<>(List.of(2,4)));
        edges.add(new ArrayList<>(List.of(1,3)));
        edges.add(new ArrayList<>(List.of(3,4)));
        edges.add(new ArrayList<>(List.of(4,6)));
        edges.add(new ArrayList<>(List.of(4,5)));
        edges.add(new ArrayList<>(List.of(5,6)));
        System.out.println(topologicalSort(edges, v,e));
    }
    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> edges, int v, int e) {
        //create adjacency list
        HashMap<Integer, List<Integer>> adj = new HashMap<>();
        for(int i=1; i<=v; i++){
            adj.put(i,new ArrayList<>());
        }
        for(int i=0; i<e; i++){
            ArrayList<Integer> edge = edges.get(i);
            int u = edge.get(0);
            int w = edge.get(1);
            adj.get(u).add(w);
        }
        boolean[] visited = new boolean[v+1];
        Stack<Integer> stack = new Stack<>();

        for(int i=1; i<=v; i++){
            if(!visited[i]){
                topoSort(i,visited,stack,adj);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        while(!stack.isEmpty()){
            result.add(stack.pop());
        }
        return result;
    }

    private static void topoSort(int i, boolean[] visited, Stack<Integer> stack, HashMap<Integer, List<Integer>> adj) {
        visited[i] = true;
        for(Integer n: adj.get(i)){
            if(!visited[n]){
                topoSort(n,visited,stack,adj);
            }
        }
        stack.push(i);
    }
}
