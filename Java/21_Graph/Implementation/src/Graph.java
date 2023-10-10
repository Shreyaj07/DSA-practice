import java.util.*;

public class Graph {
    Map<Integer, List<Integer>> adj;
    public Graph() {
        adj = new HashMap<>();
    }

    void addEdge(int u, int v, int direction) {
//        direction==0 -> undirected
//        direction == 1 -> directed graph
        //create an edge from u to v
        adj.putIfAbsent(u, new ArrayList<>());
        adj.putIfAbsent(v, new ArrayList<>());
        if (direction == 0) {
            //unidirectional
            adj.get(u).add(v);
            adj.get(v).add(u);
        } else if (direction == 1) {
            //directed graph
            adj.get(u).add(v);
        }

    }

    void print() {
        adj.forEach((key, value) -> {
            System.out.println(key + "->" + value);
        });
    }

}
