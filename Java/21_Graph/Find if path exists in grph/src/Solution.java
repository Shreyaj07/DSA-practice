import java.util.ArrayList;
import java.util.Stack;

class Solution {
    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source<0 || destination>n){
            return false;
        }
      if(source==destination){
          return true;
      }
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<n; i++){
            adjList.add(i, new ArrayList<>());
        }
        for(int i=0; i<edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        Stack<Integer> st = new Stack<>();
        boolean[] visited = new boolean[n];
        st.push(source);
        if(source<0 || source>n){
            return false;
        }
        ArrayList<Integer> path = new ArrayList<>();
        visited[source] = true;
        while(!st.isEmpty()){
            int temp = st.pop();
            for(int neighbour: adjList.get(temp)){
               if(!visited[neighbour]){
                    st.push(neighbour);
                    visited[neighbour] = true;
                    path.add(neighbour);
                    if(neighbour==destination){
                    return true;
                }
               }
            }
        }
        return false;  
    }
}