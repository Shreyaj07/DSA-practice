import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Graph {
    HashMap<Integer, List<Integer>> adj;
    Graph(){
        adj = new HashMap<>();
    }
    void addEdge(int u, int v, int direction){
        //direction -> 0 -> undirected, 1 -> directed
        //create an edge from u to v
        adj.putIfAbsent(u, new ArrayList<Integer>());
        adj.putIfAbsent(v,new ArrayList<Integer>());
        adj.get(u).add(v);
        if(direction==0){
            adj.get(v).add(u);
        }
    }
    void printAdjList(){
        for(Integer vertex: adj.keySet()){
            List<Integer> neighbours = adj.get(vertex);
            System.out.print(vertex+" -> ");
            for(Integer neighbour: neighbours){
                System.out.print(neighbour+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no. of nodes: ");
        int nodes = scanner.nextInt();
        System.out.println("Enter no. of edges: ");
        int edges = scanner.nextInt();
        Graph g = new Graph();
        for(int i=0; i<edges; i++){
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            g.addEdge(u,v,1);
        }
        //printing
        g.printAdjList();
    }
}
