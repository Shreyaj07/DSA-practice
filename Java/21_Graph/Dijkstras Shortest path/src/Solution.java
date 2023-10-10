//https://www.codingninjas.com/studio/problems/dijkstra-s-shortest-path_920469\

import java.util.*;
//uSing priority queue

public class Solution {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> vec = new ArrayList<>();
		vec.add(new ArrayList<>(List.of(0,1,7)));
		vec.add(new ArrayList<>(List.of(0,3,2)));
		vec.add(new ArrayList<>(List.of(0,2,1)));
		vec.add(new ArrayList<>(List.of(1,3,5)));
		vec.add(new ArrayList<>(List.of(1,2,3)));
		vec.add(new ArrayList<>(List.of(1,4,1)));
		vec.add(new ArrayList<>(List.of(3,4,7)));
		System.out.println(dijkstra(vec,5,vec.size(),0));
	}
	public static ArrayList<Integer> dijkstra(ArrayList<ArrayList<Integer>> vec, int vertices, int edges, int source) {
		// Create an adjacency list to represent the graph
		ArrayList<ArrayList<Edge>> adjList = new ArrayList<>();
		for (int i = 0; i < vertices; i++) {
			adjList.add(new ArrayList<>());
		}

		// Populate the adjacency list based on the input
		for (int i = 0; i < edges; i++) {
			int from = vec.get(i).get(0);
			int to = vec.get(i).get(1);
			int weight = vec.get(i).get(2);
			adjList.get(from).add(new Edge(to, weight));
			adjList.get(to).add(new Edge(from, weight)); // Assuming it's an undirected graph
		}

		// Initialize distances to all vertices as infinity
		int[] distance = new int[vertices];
		Arrays.fill(distance, Integer.MAX_VALUE);

		// Create a priority queue for Dijkstra's algorithm
		PriorityQueue<Node> pq = new PriorityQueue<>(new NodeComparator());
		distance[source] = 0;
		pq.add(new Node(source, 0));

		while (!pq.isEmpty()) {
			Node node = pq.poll();
			int u = node.vertex;
			int dist = node.distance;

			// If this node has been visited with a shorter distance before, skip it
			if (dist > distance[u]) {
				continue;
			}

			// Explore neighbors of u
			for (Edge edge : adjList.get(u)) {
				int v = edge.to;
				int weight = edge.weight;

				// Relaxation step
				if (distance[u] + weight < distance[v]) {
					distance[v] = distance[u] + weight;
					pq.add(new Node(v, distance[v]));
				}
			}
		}

		// Convert the distance array to ArrayList and return it
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < vertices; i++) {
			result.add(distance[i]);
		}
		return result;
	}

	static class Edge {
		int to, weight;

		Edge(int to, int weight) {
			this.to = to;
			this.weight = weight;
		}
	}

	static class Node {
		int vertex, distance;

		Node(int vertex, int distance) {
			this.vertex = vertex;
			this.distance = distance;
		}
	}

	static class NodeComparator implements Comparator<Node> {
		public int compare(Node node1, Node node2) {
			return Integer.compare(node1.distance, node2.distance);
		}
	}
}
