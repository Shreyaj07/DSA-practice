import java.lang.reflect.Array;
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(List.of(0,0,1,2,3));
        ArrayList<Integer> b = new ArrayList<>(List.of(1,2,3,4,4));
        System.out.println(getPath(5,5,a,b,0,4));
    }
    static ArrayList<Integer> getPath(int V, int E, ArrayList<Integer> a, ArrayList<Integer> b, int v1, int v2) {
       List<List<Integer>> adjList = new ArrayList<>();
       ArrayList<Integer> ans = new ArrayList<>();
       Queue<Integer> queue = new LinkedList<>();

       for(int i=0; i<V; i++){
           adjList.add(i,new ArrayList<>());
       }

       for(int i=0; i<E; i++){
           int u = a.get(i);
           int v = b.get(i);
           adjList.get(u).add(v);
           adjList.get(v).add(u);
       }

       queue.offer(0);
       boolean[] visited = new boolean[V];
       visited[0] = true;

       while(!queue.isEmpty()){
           int vertex = queue.poll();
           ans.add(vertex);
           visited[vertex] = true;
           for(int neighbour: adjList.get(vertex)){
               if(!visited[neighbour]){
                   queue.offer(neighbour);
                   visited[neighbour] = true;
               }
           }
       }
       int start = -1;
       int end = -1;
       Stack<Integer> st = new Stack<>();
       for(int i=0; i<V; i++){
           if(ans.get(i)==v1){
               start = i;
           }
           if(ans.get(i)==v2){
               end = i;
           }
       }
       for(int i=start; i<=end; i++){
           st.push(ans.get(i));
       }
       ArrayList<Integer> finalAns = new ArrayList<>();
       while(!st.isEmpty()){
            finalAns.add(st.pop());
       }
       return finalAns;
    }

}
