import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DetectCycleUsingKahnAlgo {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        edges.add(new ArrayList<>(List.of(1,2)));
        edges.add(new ArrayList<>(List.of(2,3)));
        edges.add(new ArrayList<>(List.of(3,4)));
        System.out.println(detectCycleInDirectedGraph(6,edges));
        edges.add(new ArrayList<>(List.of(4,5)));
        edges.add(new ArrayList<>(List.of(4,6)));
        edges.add(new ArrayList<>(List.of(6,2)));
        System.out.println(detectCycleInDirectedGraph(6,edges));
    }
    public static boolean detectCycleInDirectedGraph(int n, ArrayList < ArrayList < Integer >> edges) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<=n; i++){
            adjList.add(i, new ArrayList<>());
        }
        int[] indegree = new int[n+1];
        for(int i=0; i<edges.size(); i++){
            int u = edges.get(i).get(0);
            int w = edges.get(i).get(1);
            adjList.get(u).add(w);
            indegree[w]++;
        }
        ArrayList<Integer> topologicalSorted = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=n; i++){
            if(indegree[i]==0){
                queue.offer(i);
            }
        }
        while(!queue.isEmpty()){
            int temp = queue.poll();
            topologicalSorted.add(temp);
            for(int neighbour: adjList.get(temp)){
                if(--indegree[neighbour]==0){
                    queue.offer(neighbour);
                }
            }
        }
        if(topologicalSorted.size()==n){
            return false;
        }
        return true;
    }
}