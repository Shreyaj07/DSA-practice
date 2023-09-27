import java.util.ArrayList;
public class Solution {
  public static boolean detectCycleInDirectedGraph(int n, ArrayList < ArrayList < Integer >> edges) {
    ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
    for(int i=0; i<=n; i++){
      adjList.add(i,new ArrayList<>());
    }
    for(int i=0; i<edges.size(); i++){
      int u = edges.get(i).get(0);
      int v = edges.get(i).get(1);
      adjList.get(u).add(v);
    }
    boolean[] visited = new boolean[n+1];
    boolean[] recursionStack = new boolean[n+1];
    for(int i=1; i<=n; i++){
      if(!visited[i] && hasCycleUtil(i,visited,recursionStack, adjList)){
        return true;
      }
    }
    return false;
  }
  public static boolean hasCycleUtil(int i, boolean[] visited, boolean[] recursionStack, ArrayList<ArrayList<Integer>> adjList){
    visited[i] = true;
    recursionStack[i] = true;
    for(int neighbour: adjList.get(i)){
      if(!visited[neighbour] && hasCycleUtil(neighbour, visited, recursionStack, adjList)){
        return true;
      }else if(recursionStack[neighbour]){
        return true;
      }
    }
    recursionStack[i] = false;
    return false;
  }
}