import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ShortestPathDAG {
    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Edge>> adjList = new ArrayList<>();
        for(int i=0; i<V; i++){
            adjList.add(new ArrayList<>());
        }
        adjList.get(0).add(new Edge(1,5));
        adjList.get(0).add(new Edge(2,3));
        adjList.get(1).add(new Edge(2,2));
        adjList.get(1).add(new Edge(3,6));
        adjList.get(2).add(new Edge(3,7));
        adjList.get(2).add(new Edge(4,4));
        adjList.get(2).add(new Edge(5,2));
        adjList.get(3).add(new Edge(4,-1));
        adjList.get(4).add(new Edge(5,-2));

        int source = 1;
        shortestPathDAG(adjList,source, 6);
    }
    static class Edge{
        int to,weight;
        Edge(int to, int weight){
            this.to = to;
            this.weight = weight;
        }
    }
    static void shortestPathDAG(ArrayList<ArrayList<Edge>> adjList, int source, int V){

        int[] distance = new int[V];
        Arrays.fill(distance,Integer.MAX_VALUE);

        //step 1: topological sort
        Stack<Integer> st = new Stack<>();
        boolean[] visited = new boolean[V];
        for(int i=0; i<V; i++){
            if(!visited[i]){
                topologicalSort(adjList, i, visited, st);
            }
        }
        //step 2: initialize dist to src vertex
        distance[source] = 0;
        while(!st.isEmpty()){
            int u = st.pop();
            for(Edge edge: adjList.get(u)){
                int v = edge.to;
                int weight = edge.weight;
                if(distance[u]!=Integer.MAX_VALUE && distance[u] + weight < distance[v]){
                   distance[v] = distance[u] + weight;
                }
            }
        }
        for(int i=0; i<V; i++){
            System.out.println("Shortest distance from "+source+" to "+i+": "+distance[i]);
        }
    }
    static void topologicalSort(ArrayList<ArrayList<Edge>> adjList, int u, boolean[] visited, Stack<Integer> st){
        visited[u] = true;
        for(Edge edge: adjList.get(u)){
            int v = edge.to;
            if(!visited[v]){
                topologicalSort(adjList,v,visited,st);
            }
        }
        st.push(u);
    }
}
