import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Graph graph = new Graph();
        System.out.println("Graph- 0. Undirected 1. Directed");
        int direction = scanner.nextInt();
        System.out.println("Enter the no. of edges");
        int edges = scanner.nextInt();
        for(int i=0; i<edges; i++){
            System.out.println("Enter the edges: ");
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph.addEdge(u,v,direction);
        }
        graph.print();
    }
}