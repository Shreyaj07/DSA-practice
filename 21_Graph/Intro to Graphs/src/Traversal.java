import java.util.*;

public class Traversal {
    public static void main(String[] args) {
        Graph1 g = new Graph1(5);
        int[][] edges = {{0,3},{1,3},{1,4},{4,2},{0,2}};
        for (int[] edge : edges) {
            g.addEdge(edge[0], edge[1], 0);
        }
        g.print();
        System.out.println(bfsTraversal(g.adj));
        System.out.println(dfsTraversal(g.adj));
    }
    static  List<Integer> bfsTraversal(List<List<Integer>> adj){
        return bfsTraversal(5, adj);
    }
    public static List<Integer> bfsTraversal(int n, List<List<Integer>> adj){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[adj.size()];
        q.offer(0);
        ArrayList<Integer> al = new ArrayList<>();
        visited[0] = true;
        while(!q.isEmpty()){
            int vertex = q.poll();
            al.add(vertex);
            for(Integer neighbours: adj.get(vertex)){
                if(!visited[neighbours]){
                    q.offer(neighbours);
                    visited[neighbours] = true;
                }
            }
        }
        return al;
    }
    public static List<Integer> dfsTraversal(List<List<Integer>> adj){
        Stack<Integer> st = new Stack<>();
        boolean[] visited = new boolean[adj.size()];
        st.push(0);
        visited[0] = true;
        List<Integer> ans = new ArrayList<>();
        while(!st.isEmpty()){
            int temp = st.pop();
            ans.add(temp);
            for(int neighbours: adj.get(temp)){
                if(!visited[neighbours]){
                    st.push(neighbours);
                    visited[neighbours] = true;
                }
            }
        }
        return ans;
    }
}
class Graph1{
    List<List<Integer>> adj;
    Graph1(int noOfVertices){
        adj =new ArrayList<>();
        for(int i=0; i<noOfVertices; i++){
            adj.add(i,new ArrayList<>());
        }
    }

    void addEdge(int u, int v, int direction){
        //0 -> undirected 1 -> directed
        adj.get(u).add(v);
        if(direction==0){
            adj.get(v).add(u);
        }
    }
    void print(){
        for(int i=0; i<adj.size();i++){
            List<Integer> vertex = adj.get(i);
            System.out.print(i+" -> ");
            for(Integer neighbour: vertex){
                System.out.print(neighbour+" ");
            }
            System.out.println();
        }
    }
}