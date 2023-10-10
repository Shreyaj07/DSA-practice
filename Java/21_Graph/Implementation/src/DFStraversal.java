import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class DFStraversal {
    public static void main(String[] args) {
        int v =5,e=4;
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        edges.add(new ArrayList<>(List.of(0,2)));
        edges.add(new ArrayList<>(List.of(0,1)));
        edges.add(new ArrayList<>(List.of(1,2)));
        edges.add(new ArrayList<>(List.of(3,4)));
        ArrayList<ArrayList<Integer>> ans = DFStraversal.depthFirstSearch(v,e,edges);
        System.out.println(ans.size());
        System.out.println(ans);
    }
    public static void dfs(int vertex,ArrayList<ArrayList<Integer>> adjList,ArrayList<Integer> component,boolean[] visited){
        Stack<Integer> st = new Stack<>();
        st.push(vertex);
        visited[vertex] = true;
        component.add(vertex);
        while(!st.isEmpty()){
            int temp = st.pop();
            for(int neighbour: adjList.get(temp)){
                if(!visited[neighbour]){
                    st.push(neighbour);
                    visited[neighbour] = true;
                    component.add(neighbour);
                }
            }
        }
    }
    public static ArrayList<ArrayList<Integer>> depthFirstSearch(int v, int e, ArrayList<ArrayList<Integer>> edges) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[v];
        for(int i=0; i<v; i++){
            adjList.add(new ArrayList<>());
        }
        for(ArrayList<Integer> edge: edges){
            int u = edge.get(0);
            int w = edge.get(1);
            adjList.get(u).add(w);
            adjList.get(w).add(u);
        }
        for(int i=0; i<v; i++){
            if(!visited[i]){
                ArrayList<Integer> component = new ArrayList<>();
                dfs(i,adjList, component,visited);
                result.add(component);
            }
        }
        return result;
    }
}