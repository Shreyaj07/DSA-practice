import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
		edges.add(new ArrayList<>(List.of(0,2)));
		edges.add(new ArrayList<>(List.of(2,1)));
		edges.add(new ArrayList<>(List.of(1,0)));
		edges.add(new ArrayList<>(List.of(2,3)));
		edges.add(new ArrayList<>(List.of(3,4)));
		System.out.println(stronglyConnectedComponents(5,edges));
	}
	public static int stronglyConnectedComponents(int v, ArrayList<ArrayList<Integer>> edges) {
		ArrayList<ArrayList<Integer>> adjList= new ArrayList<>();
		ArrayList<ArrayList<Integer>> transpose = new ArrayList<>();
		for(int i=0; i<v; i++){
			adjList.add(i, new ArrayList<>());
			transpose.add(i, new ArrayList<>());
		}
		//adjacency list and transpose graph
		for(int i=0; i<edges.size(); i++){
			int u = edges.get(i).get(0);
			int w = edges.get(i).get(1);
			adjList.get(u).add(w);
			transpose.get(w).add(u);
		}
		//step 1: dfs
		Stack<Integer> st = new Stack<>();
		boolean[] visited = new boolean[v];
		for(int i=0; i<v; i++){
			if(!visited[i]){
				dfs(adjList, i, visited, st);
			}
		}
		//step 2: reset visited flags
		visited = new boolean[v];
		//step 3: second dfs to find sccs
		int noSCCs = 0;
		ArrayList<ArrayList<Integer>> sccList = new ArrayList<>();
		while(!st.isEmpty()){
			int u = st.pop();
			if(!visited[u]){
				ArrayList<Integer> scc = new ArrayList<>();
				dfsTranspose(transpose, u, visited, scc);
				sccList.add(scc);
				noSCCs++;
			}
		}
		return noSCCs;
	}

	private static void dfs(ArrayList<ArrayList<Integer>> adjList, int i, boolean[] visited, Stack<Integer> st) {
		visited[i] = true;
		for (int neighbor : adjList.get(i)) {
			if (!visited[neighbor]) {
				dfs(adjList, neighbor, visited, st);
			}
		}
		st.push(i);
	}
	static void dfsTranspose(ArrayList<ArrayList<Integer>> transpose, int i, boolean[] visited, ArrayList<Integer> scc){
		visited[i] = true;
		scc.add(i);
		for(int neighbour: transpose.get(i)){
			if(!visited[neighbour]){
				dfsTranspose(transpose,neighbour, visited,scc);
			}
		}
	}
}