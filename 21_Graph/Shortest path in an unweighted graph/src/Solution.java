import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {

	public static LinkedList<Integer> shortestPath(int[][] edges, int n, int m, int s, int t) {
		ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
		for(int i=1; i<=n; i++){
			adjList.add(i, new ArrayList<>());
		}
		for(int i=1; i<=m; i++){
			int u = edges[i][0];
			int v = edges[i][1];
			adjList.get(u).add(v);
			adjList.get(v).add(u);
		}
		boolean[] visited = new boolean[n+1];
		int[] parent = new int[n+1];
	}

}