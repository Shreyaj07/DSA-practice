import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> edges, int v, int e) 
    {
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<v; i++){
            adjList.add(i, new ArrayList<>());
        }
        for(int i=0; i<e; i++){
            int u = edges.get(i).get(0);
            int w = edges.get(i).get(1);
            adjList.get(u).add(w);
        }
        boolean[] visited = new boolean[v];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<v; i++){
            if(!visited[i]){
                topoSort(i,visited, st, adjList);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
        return ans;
    }
    static void topoSort(int i, boolean[] visited, Stack<Integer> st, List<List<Integer>> adjList){
        visited[i] = true;
        for(int neighbour: adjList.get(i)){
           if(!visited[neighbour]){
                topoSort(neighbour, visited, st, adjList);
           }
        }
        st.push(i);
    }
}
