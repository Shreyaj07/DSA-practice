import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public static void main(String[] args) {
		int[][] edges = {{1,2},{1,3},{1,4},{3,8},{2,5},{5,8},{4,6},{6,7},{7,8}};
		System.out.println(shortestPath(edges,8,edges.length,1,8));
	}

	public static LinkedList<Integer> shortestPath(int[][] edges, int n, int m, int s, int t) {
		ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
		for(int i=0; i<=n; i++){
			adjList.add(i, new ArrayList<>());
		}
		//creating an adjacent list from given edges
		for(int i=1; i<m; i++){
			int u = edges[i][0];
			int v = edges[i][1];
			adjList.get(u).add(v);
			adjList.get(v).add(u);
		}
		boolean[] visited = new boolean[n+1];
		int[] parent = new int[n+1];
		Queue<Integer> queue = new LinkedList<>();
		//initialize the parent array with -1 to indicate that no parent is set
		Arrays.fill(parent,-1);
		//mark the src vertex as visited and enqueue it
		visited[s] = true;
		queue.offer(s);

		while(!queue.isEmpty()){
			int u = queue.poll();
			//explore neighbours
			for(int neighbour: adjList.get(u)){
				if(!visited[neighbour]){
					visited[neighbour] = true;
					parent[neighbour] = u;
					queue.offer(neighbour);
				}
			}
		}
		//reconstruct the shortest path from s to t using the parent array
		LinkedList<Integer> path = new LinkedList<>();
		int current = t;
		while(current!=-1){
			path.addFirst(current);
			current = parent[current];
		}
		//if there is no path return an empty list
		if(path.getFirst()!=s){
			return new LinkedList<>();
		}
		return path;
	}

}