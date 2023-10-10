import java.util.*;

public class KahnAlgorithmTopologicalSort {
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
    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> edges, int v, int e){
        ArrayList<Integer> result = new ArrayList<>();
        //creating adj list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<v; i++){
            adj.add(new ArrayList<>());
        }
        //creating adj list
        for(int i=0; i<e; i++){
            ArrayList<Integer> edge = edges.get(i);
            int u = edge.get(0);
            int w = edge.get(1);
            adj.get(u).add(w);
        }
        //calculate indegree
        int[] indegree = new int[v];
        int zero=0;
        for(int i=0; i<v; i++){
            indegree[i] = adj.get(i).size();
            if(indegree[i]==0){
                zero = i;
            }
        }
        //do bfs
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(zero);
        while (!queue.isEmpty()){
            int front = queue.poll();
            result.add(front);
            for(Integer n: adj.get(front)){
                indegree[n]--;
                if(indegree[n]==0){
                    queue.add(n);
                }
            }
        }
        return result;
    }
}
