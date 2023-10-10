import java.lang.reflect.Array;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		int V = 4;
		ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
		edges.add(new ArrayList<>(List.of(0,1,3)));
		edges.add(new ArrayList<>(List.of(0,3,5)));
		edges.add(new ArrayList<>(List.of(1,2,1)));
		edges.add(new ArrayList<>(List.of(2,3,8)));
		System.out.println(minimumSpanningTree(edges,V));
		ArrayList<ArrayList<Integer>> edges1 = new ArrayList<>();
		edges1.add(new ArrayList<>(List.of(1,2,6)));
		edges1.add(new ArrayList<>(List.of(2,3,2)));
		edges1.add(new ArrayList<>(List.of(1,3,2)));
		edges1.add(new ArrayList<>(List.of(1,0,2)));
		System.out.println(minimumSpanningTree(edges1,V));
	}

	static class Edge {
		int from, to, weight;

		Edge(int from, int to, int weight) {
			this.from = from;
			this.to = to;
			this.weight = weight;
		}
	}

	static class DSU {
		int[] parent;

		DSU(int n) {
			parent = new int[n];
			for (int i = 0; i < n; i++) {
				parent[i] = i;
			}
		}

		int find(int x) {
			if (parent[x] == x) {
				return x;
			}
			return parent[x] = find(parent[x]);
		}

		boolean union(int x, int y) {
			int rootX = find(x);
			int rootY = find(y);
			if (rootX == rootY) {
				return false; // Adding this edge would create a cycle
			}
			parent[rootX] = rootY;
			return true;
		}
	}

	public static int minimumSpanningTree(ArrayList<ArrayList<Integer>> edges, int n) {
		ArrayList<Edge> edgeList = new ArrayList<>();
		for (ArrayList<Integer> edgeData : edges) {
			int from = edgeData.get(0);
			int to = edgeData.get(1);
			int weight = edgeData.get(2);
			edgeList.add(new Edge(from, to, weight));
		}

		Collections.sort(edgeList, Comparator.comparingInt(e -> e.weight));

		DSU dsu = new DSU(n);
		int minCost = 0;
		ArrayList<ArrayList<Integer>> mstEdges = new ArrayList<>();

		for (Edge edge : edgeList) {
			if (dsu.union(edge.from, edge.to)) {
				minCost += edge.weight;
				mstEdges.add(new ArrayList<>(Arrays.asList(edge.from, edge.to, edge.weight)));
			}
		}

		// If the MST has less than n - 1 edges, the graph is not connected.
//		if (mstEdges.size() < n - 1) {
//			return -1;
//		}

		// return mstEdges if you need the edges of the MST.
		return minCost;
	}
}
