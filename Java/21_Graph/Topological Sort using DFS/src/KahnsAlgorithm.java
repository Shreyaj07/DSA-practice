import java.util.* ;
import java.io.*;

/*
Kahn's algorithm:
1. Find indegree of all
2. Queue -> 0 to n -> indegree -> insert
3. Do BFS
* */
public class KahnsAlgorithm {
    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> edges, int v, int e) {
        //create adj list
        int[] inDegree = new int[v];
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<v; i++){
           adjList.add(i, new ArrayList<>());
        }
        for(int i=0; i<e; i++){
            int u = edges.get(i).get(0);
            int w = edges.get(i).get(1);
            adjList.get(u).add(w);
            inDegree[w]++;
        }
        //create a queue for kahn's algo
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<v; i++){
            if(inDegree[i]==0){
                queue.offer(i);
            }
        }
        //initialize list to store topological sorting order
        ArrayList<Integer> topologicalOrder = new ArrayList<>();
        //perform kahn's algo
        while(!queue.isEmpty()){
            int u = queue.poll();
            topologicalOrder.add(u);
            for(int neigbour: adjList.get(u)){
                if(--inDegree[neigbour]==0){
                    queue.offer(neigbour);
                }
            }
        }
        //if the topological sort consists of all vertices, return list else return an empty list(indicating a cycle)
        if (topologicalOrder.size() == v) {
            return topologicalOrder;
        }
        return new ArrayList<>();
    }
}
